/*
Time.java
By: William Lin
This program calculates time since midnight, time remaining in a day, 
and the percentage of the day that has passed
*/
package time;

public class Time{
    public static void main(String[] args){
        int hour = 16;
        int minute = 41;
        int second = 30;
        int time = (hour * 60 + minute) * 60 + second; //The time in seconds
        int day = 24 * 60 * 60; //Seconds in a day
        int remain = day - time;
        System.out.println("Seconds since midnight: " + time + " seconds");
        System.out.println("Seconds left in the day: " + remain + " seconds");
        System.out.println("Percentage of day passed: " + (time * 100)/day + "%");
    }
}