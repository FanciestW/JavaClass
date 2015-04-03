package week9;
/*
bottles.java
By: William Lin
This program prints the lyrics to the famous song, 99 bottles of beer.
*/
public class bottles{
    
    public static void main(String[] args){
        bottles(99);
    }
    
    /**
     * This method creates the lyrics of the song starting from the integer n.
     * @param n the starting number of the song.
     */
    public static void bottles(int n){
        int next = n - 1;
        if(n == 0){
            System.out.println("No more bottles of beer on the wall");
        }
        else{
            System.out.println(n + " bottles of beer on the wall, " + n + " bottles of beer.");
            System.out.println("You take one down and pass it around, " + next + " bottles of beer on the wall.");
            bottles(next);
        }
    }
}