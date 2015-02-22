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
    
    /**
     * This method prints the American format of the date with the following parameters
     * @param day The day of the week. (ex. Monday, Tuesday, etc.)
     * @param month The month of the year. (ex. August, December, etc.)
     * @param date The day of the month. (ex. 1, 29, 31, etc.)
     * @param year The year. (ex. 2015, 2014, 1997, etc.)
     */
    public static void printAmerican(String day, String month, int date, int year){
        System.out.println("American Format:");
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }
    
    /**
     * This method prints the European format of the date with the following parameters
     * @param day The day of the week. (ex. Monday, Tuesday, etc.)
     * @param month The month of the year. (ex. August, December, etc.)
     * @param date The day of the month. (ex. 1, 29, 31, etc.)
     * @param year The year. (ex. 2015, 2014, 1997, etc.)
     */
    public static void printEuropean(String day, String month, int date, int year){
        System.out.println("European Format:");
        System.out.println(day + " " + date + " " + month + ", " + year);
    }
}