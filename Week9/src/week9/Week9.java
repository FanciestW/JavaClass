package week9;
import java.awt.*;
import java.math.BigInteger;

public class Week9{
    
    public static void main(String[] args){
        int x = 2147483647;
        int y = 2147483647;
        BigInteger notSoBig = BigInteger.valueOf(x);
        BigInteger bigger = BigInteger.valueOf(y);
        BigInteger big = bigger.multiply(notSoBig);
        System.out.println(big);
    }
}
