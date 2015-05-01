/*
MoreDates.java
By: William Lin
This program uses Date.java to get a date using the given year, month and day.
*/

package moredates;

public class MoreDates{
    
    public static void main(String[] args){
        Date birthday = new Date(1997, 8,5);
        Date today = new Date();
        today.year = 2015;
        today.month = 4;
        today.day = 6;
        System.out.print("My Birthday: ");
        Date.printDate(birthday);
        System.out.print("Today is: ");
        Date.printDate(today);
        
    }
}
