
public class arrayHistogram {
    
    public static int randomInt(int low, int high){
        double rand = Math.random();
        System.out.println(rand);
        rand *= high;
        rand += low;
        return (int) rand;
    }
    
    public static void main(String[] args){
        for(int i = 0; i < 3; i++){
            System.out.println(randomInt(10, 20));
        }
    }
}
