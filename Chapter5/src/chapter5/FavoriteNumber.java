/*
FavoriteNumber.java
By: William Lin
This program checks your if your favorite number is even and/or
if your favorite number is a single digit number.
*/
package chapter5;

import javax.swing.JOptionPane;

public class FavoriteNumber{
    
    public static void main(String[] args){
        JOptionPane msg = new JOptionPane();
        String input = msg.showInputDialog("What is your favorite number?(No decimals please)");
        int number = Integer.parseInt(input);
        
        if(isEven(number) && isSingleDigit(number)){
            msg.showMessageDialog(null, "Your favorite number must be 2, 4, 6, or 8.");
        }
        else if(!isEven(number) && !isSingleDigit(number)){
            msg.showMessageDialog(null, "You have a \"oddly large\" favorite number.");
        }
        else if(!isEven(number) || isSingleDigit(number)){
            msg.showMessageDialog(null, "Are you single because you're odd?");
        }
        else if(isEven(number) && !isSingleDigit(number)){
            msg.showMessageDialog(null, "Are you even a large enough?");
        }
        else{
            msg.showMessageDialog(null, "You have one weird favorite number.");
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