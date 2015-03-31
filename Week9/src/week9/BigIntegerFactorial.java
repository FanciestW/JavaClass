/*
BigIntegerFactorial.java
By: William Lin
This program prints a table of factorials for the numbers 1 - 30
*/
package week9;

import java.math.BigInteger;

public class BigIntegerFactorial{
    
    public static void main(String[] args){
        factorialTable();
    }
    
    /**
     * This method generates and displays a table of factorials for the numbers 1 through 30.
     */
    public static void factorialTable(){
        //The table doesn't print the right values after 13 because the integer value is too high.
        //Integer values only go up to 2,147,483,647 and down to –2,147,483,648. 
        for(int i = 1; i <= 30; i++){
            System.out.print(i + ": ");
            System.out.println(factorialBig(i));
        }
    }
    /**
     * This method finds the factorial of the parameter int num.
     * @param num the int which we will find the factorial of.
     * @return the factorial of num.
     */
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
        else{
            return(num * factorial(num - 1));
        }        
    }
    
    public static BigInteger factorialBig(int n){
        for(int i = n-1; i > 0; i--){
            n = n * i;
        }
        return BigInteger.valueOf(n);
    }
}
