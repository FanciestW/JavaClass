public class Game{
    
    public static void main(String[] args){
        Card one = new Card(0, 1);
        Card[] deck = {one};
        int[] suithist = Card.suitHist(deck);
        int[] rankhist = Card.rankHist(deck);
        Card.printArray(rankhist);
    }
}