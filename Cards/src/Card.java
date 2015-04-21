public class Card{
    
    //Make the String array for suits and ranks an instance static variable.
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
     * This method prints an int[] array
     * @param array The int[] array that is to be printed.
     */
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    /**
     * Prints a given Card object.
     * @param card The Card object that is to be printed.
     */
    public static void printCard(Card card){
        String suits[] = {"Clubs", "Diamond", "Hearts", "Spades"};  //Make the String array for suits and ranks an instance static variable.
        String ranks[] = {"narf", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        System.out.println(ranks[card.rank] + " of " + suits[card.suit]);
    }
    
    /**
     * This method takes a String that depicts the standard format of a card
     * The method then searches for the corresponding suit and rank for the card
     * If either the suit or rank is not present, then it returns a null Card object.
     * @param card The string that depicts the standard format of a card.
     * @return a Card object that corresponds to the string that is given.
     */
    public static Card parseCard(String card){
        String suits[] = {"Clubs", "Diamond", "Hearts", "Spades"};  //Make the String array for suits and ranks an instance static variable.
        String ranks[] = {"narf", "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int space1 = card.indexOf(" ");
        if(space1 == -1){
            return new Card();
        }
        int space2 = card.lastIndexOf(" ");
        if(space2 == -1){
            return new Card();
        }
        String rankStr = card.substring(0, space1);
        String suitStr = card.substring(space2 + 1, card.length());
        int rank = 0;   //Change int variable to: int rank = 0, suit = 0;
        int suit = 0;
        for(int i = 0; i < suits.length; i++){
            if(suits[i].equals(suitStr)){
                suit = i;   //Change conditional to: if() [body];
            }
        }
        for(int n = 0; n < ranks.length; n++){
            if(ranks[n].equals(rankStr)){
                rank = n;   //Change conditional to: if() [body];
            }
        }
        System.out.println(suit + ", " + rank);
        return new Card(suit, rank);
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
    
    /**
     * This method takes an array of Cards and finds the scoreOf it by adding the 
     * rank up, with the ace as 1 and the face cards all as 10 and the number cards as themselves.
     * @param hand The array of Cards that make up the hand.
     * @return the score of the hand.
     */
    public static int handScore(Card[] hand){
        int score = 0;
        for(int i = 0; i < hand.length; i++){
            if(hand[i].rank > 0 && hand[i].rank < 11){
                score += hand[i].rank;
            }
            else if(hand[i].rank > 10 && hand[i].rank < 14){
                score += 10;
            }
            else{
                System.err.println("Card " + i + ": Rank out of range");
            }
        }
        return score;
    }
    
    /**
     * This method takes an Array of Cards and makes an histogram of the suits.
     * @param cards The array of Cards that will be used to populate the histogram.
     * @return An int[] array that contains the histogram.
     */
    public static int[] suitHist(Card[] cards){
        int[] suits = new int[4];
        for(int i = 0; i < cards.length; i++){
            suits[cards[i].suit]++;
        }
        return suits;
    }
    
    /**
     * This method looks through an array of Card objects and makes an histogram
     * based on the ranks of the cards.
     * @param cards The array of cards that will be used to make the histogram.
     * @return the int[] array for the histogram.
     */
    public static int[] rankHist(Card[] cards){
        int[] ranks = new int[13];
        for(int i = 0; i < cards.length; i++){
            ranks[((cards[i].rank) - 1)]++;
        }
        return ranks;
    }
    
    /**
     * This method checks to see if the hand that is porvided has a flush.
     * @param hand the array of Card objects that will be checked for a flush.
     * @return a boolean value for whether or not there is a flush in the hand.
     */
    public static boolean isFlush(Card[] hand){
                    
    }
}
