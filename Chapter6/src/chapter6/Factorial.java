/*
Factorial.java
By: William Lin
This program will take a user inputted number and find 
the factorial of that number.
*/
package chapter6;
import javax.swing.JOptionPane;

public class Factorial{
    
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog("Choose a positive whole number:");
        int n = Integer.parseInt(input);
        System.out.println(factorial(n));
    }
    
    /**
     * This method takes the integer n and finds and returns the factorial of n.
     * @param n Chosen integer to find the factorial with.
     * @return The factorial of integer n.
     */
    public static int factorial(int n){
        for(int i = n-1; i > 0; i--){
            n = n * i;
        }
        return n;
    }
}