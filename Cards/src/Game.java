/*
Game.java
By: William Lin
This program utilizes the Card class to create Cards and Decks and Hands. And it utilizes
the methods in the Card class to create histograms and check you hand or deck.
*/

public class Game{
    
    public static void main(String[] args){
        Card one = new Card(0, 2);
        Card two = new Card(0, 2);
        Card three = new Card(0, 4);
        Card four = new Card(2, 2);
        Card[] hand = {one, two, three, four};
        Card.printArray(Card.suitHist(hand));
        System.out.println("Is Flush: " + Card.isFlush(hand));
        Card.printArray(Card.rankHist(hand));
        System.out.println("Is Three of a Kind: " + Card.isThreeKind(hand));
    }
}
