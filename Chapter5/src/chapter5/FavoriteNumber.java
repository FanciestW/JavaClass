/*
FavoriteNumber.java
Exercise 5.2
By: William Lin
This program checks your if your favorite number is even and/or
if your favorite number is a single digit number.
*/
package chapter5;

import java.util.Scanner;

public class FavoriteNumber{
    
    public static void main(String[] args){
        System.out.println("What is your favorite number?(No decimals please)");
        Scanner scInput = new Scanner(System.in);
        int number = scInput.nextInt();
        
        if(isEven(number) && isSingleDigit(number)){
            System.out.println("Your favorite number must be 2, 4, 6, or 8.");
        }
        else if(!isEven(number) && !isSingleDigit(number)){
            System.out.println("You have a \"oddly large\" favorite number.");
        }
        else if(!isEven(number) || isSingleDigit(number)){
            System.out.println("Are you single because you're odd?");
        }
        else if(isEven(number) && !isSingleDigit(number)){
            System.out.println("Are you even large enough?");
        }
        else{
            System.out.println("You have one weird favorite number.");
        }
    }
    
    /**
     * This method returns true or false based on if the integer variable number is even or not.
     * @param number an integer, the method checks whether this integer is even or odd.
     * @return true if value of number is even and false if value of number is odd.
     */
    public static boolean isEven(int number){
        return(number%2 == 0);
    }
    
    /**
     * This method returns a true or false value based on whether the integer it is provides is a single digit or not.
     * @param number an integer, the method checks whether this integer is a single digit or not.
     * @return true if number is a single digit number, and false if it is not.
     */
    public static boolean isSingleDigit(int number){
        return(number < 10 && number >= 0);
    }
}