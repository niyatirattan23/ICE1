/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Niyati Rattan
 * Student number:991729675
 * 
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];
        Random rand = new Random();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};

        
        Card luckyCard = new Card();
        luckyCard.setValue(3); 
        luckyCard.setSuit("Hearts");

      

        boolean includeLuckyCard = rand.nextBoolean(); 
        int luckyIndex = includeLuckyCard ? rand.nextInt(magicHand.length) : -1; 
        for (int i = 0; i < magicHand.length; i++) {
            if (i == luckyIndex) {
                
                magicHand[i] = luckyCard;
            } else {
                Card c = new Card();
                c.setValue(rand.nextInt(13) + 1); 
                c.setSuit(suits[rand.nextInt(suits.length)]); 
                magicHand[i] = c;
            }}

       
        System.out.println("Magic Hand Cards:");
        for (Card card : magicHand) {
            System.out.println(card.getValue() + " of " + card.getSuit());}

        
        boolean found = false;
        for (Card card : magicHand) {
            if (card.equals(luckyCard)) {
                found = true;
                break;
            }}

        
        if (found) {
            System.out.println("The lucky card {3 of Hearts} is in the magic hand. You win!");
        } else {
            System.out.println("The lucky card {3 of Hearts} is not in the magic hand. You lose.");}}}
