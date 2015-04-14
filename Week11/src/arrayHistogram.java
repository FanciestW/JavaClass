/*
arrayHistogram.java
By: William Lin
******************
*/

public class arrayHistogram {
    
    //Fix this method*************
    //Make random number generate from low to high value.********
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
