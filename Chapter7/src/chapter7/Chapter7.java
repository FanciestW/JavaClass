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