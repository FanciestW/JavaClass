/*
Date.java
By: William Lin
This stores todays date in variables and displays todays date.
*/
package date;

public class Date {

    public static void main(String[] args) {
        String day = "Sunday";
        String month = "February";
        int date = 8;
        int year = 2015;
        System.out.println("American format:");
        System.out.println(day + ", " + month + " " + date + ", " + year);
        System.out.println("European format:");
        System.out.println(day + " " + date + " " + month + ", " + year);
    }
    
}
