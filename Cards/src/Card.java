public class Card{
    
    int suit, rank;
    
    public Card(int suit, int rank){
        this.suit = suit;
        this.rank = rank;
    }
    
    public Card(){
        this.suit = 0;
        this.rank = 0;
    }
    
    /**
     * Prints a given Card object.
     * @param card The Card object that is to be printed.
     */
    public static void printCard(Card card){
        String suits[] = {"Clubs", "Diamond", "Hearts", "Spades"};
        String ranks[] = {"narf", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        System.out.println(ranks[card.rank] + " of " + suits[card.suit]);
    }
    
    /**
     * Prints an array of Card objects.
     * @param deck the array of Card objects that is to be printed.
     */
    public static void printDeck(Card[] deck){
        for(int i = 0; i < deck.length; i++){
            printCard(deck[i]);
        }
    }
    
    /**
     * This method builds a standard 52 card deck.
     * @return The array of Card objects that make up the deck.
     */
    public static Card[] buildDeck(){
        Card[] deck = new Card[52];
        int index = 0;
        for(int suit = 0; suit <= 3; suit++){
            for(int rank = 1; rank <= 13; rank++){
                deck[index] = new Card(suit, rank);
                index++;
            }
        }
        return deck;
    }
}