/*
Date.java
By: William Lin
Update 2.0.1 of Date.java from Chapter 2
Seperated the overall program into method.
*/
package chapter3;
public class Date{
    public static void main(String[]args){
        String day = "Sunday";
        String month = "February";
        int date = 14;
        int year = 2015;
        printAmerican(day, month, date, year);
        printEuropean(day, month, date, year);
    }
    
    public static void printAmerican(String day, String month, int date, int year){
        System.out.println("American Format:");
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }
    
    public static void printEuropean(String day, String month, int date, int year){
        System.out.println("European Format:");
        System.out.println(day + " " + date + " " + month + ", " + year);
    }
}