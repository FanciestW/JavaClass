/*
Game.java
By: William Lin
This program utilizes the Card class to create Cards and Decks and Hands. And it utilizes
the methods in the Card class to create histograms and check you hand or deck.
*/
import java.util.Random;

public class Game{
    
    public static void main(String[] args){
        //4 Randomly generated cards for your hand.
        Random random = new Random();
        Card[] deck = Card.buildDeck();
        Card one = new Card(random.nextInt(4), random.nextInt(13) + 1);
        Card two = new Card(random.nextInt(4), random.nextInt(13) + 1);
        Card three = new Card(random.nextInt(4), random.nextInt(13) + 1);
        Card four = new Card(random.nextInt(4), random.nextInt(13) + 1);
        //One set of card in your hand is set though.
        Card five = Card.parseCard("Queen of Clubs");
        Card[] hand = {one, two, three, four, five};
        System.out.println("Your Hand: ");
        Card.printDeck(hand);
        System.out.println("Your Hand Score: " + Card.handScore(hand));
        System.out.print("Suit Histogram: ");
        Card.printArray(Card.suitHist(hand));
        System.out.print("Ranks Histogram: ");
        Card.printArray(Card.rankHist(hand));
        System.out.println("Is Flush: " + Card.isFlush(hand));
        System.out.println("Is Three of a Kind: " + Card.isThreeKind(hand));
    }
}
