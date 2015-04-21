public class Game{
    
    public static void main(String[] args){
        Card one = new Card(0, 2);
        Card two = new Card(0, 2);
        Card three = new Card(0, 4);
        Card four = new Card(2, 2);
        Card[] hand = {one, two, three, four};
        System.out.println(Card.isThreeKind(hand));
    }
}
