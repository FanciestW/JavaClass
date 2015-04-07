/*
Date.java
By: William Lin
This is a class definition which helps run the MoreDate.java program.
*/

package moredates;

public class Date{
    //Instance variables
    int year, month, day;
    
    public Date(){
        this.year = 0;
        this.month = 0;
        this.day = 0;
    }
    
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    /**
     * This method prints the date that is passed to it.
     * @param date the Date object that is used to print the given date.
     */
    public static void printDate(Date date){
        System.out.println(date.month + "/" + date.day + "/" + date.year);
    }
}
