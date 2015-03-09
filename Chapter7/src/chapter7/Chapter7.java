package chapter7;

import java.util.Scanner;

public class Chapter7{
    
    public static void main(String[] args){
        System.out.print("Your choice: ");
        Scanner scChoice = new Scanner(System.in);
        int choice = scChoice.nextInt();
        switch(choice){
            case 1:
                reverse();
                break;
            case 2:
                counter();
                break;
            default:
                System.err.println("Not vaild choice.");
        }
    }
    
<<<<<<< HEAD
    public void paint(Graphics g){
        /*drawString is a method of the Graphics class. It takes a string,
        and two integer parameters. As x and y coordinates. These coordinates 
        correspond to Quadrant I of a traditional coordinate plane, 
        so they are always positive.
        */
        g.drawString("Hello World Applet", 50, 25);
=======
    public static void reverse(){
        Scanner scInput = new Scanner(System.in);
        System.out.print("String: ");
        String input = scInput.next();
        int index = input.length();
        while(index != 0){
            System.out.print(input.charAt(index-1));
            index--;
        }
        System.out.println();
>>>>>>> ad14df54f44626ca006d93d8c32c407d49c9904b
    }
    
    public static void counter(){
        Scanner scInput = new Scanner(System.in);
        System.out.print("String: ");
        String input = scInput.next();
        System.out.print("Letter: ");
        String inputLetter = scInput.next();
        char letter = inputLetter.charAt(0);
        int index = 0;
        int count = 0;
        while(index < input.length()){
            if(input.charAt(index) == letter){
                count++;
            }
            index++;
        }
        System.out.println(count);
    }
    
    
}