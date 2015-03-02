/*
MathTables.java
By: William Lin
This program outputs 3 different tables. One for the common log. One for addition.
And one for sin, cos and tan. For the common log table it will print a table for
common logs from 0 to 10 with increments of 0.5. For the addition table it will print a 2 dimensional
table for the numbers 0 to 12. And for the trig table. It will print the cos, sin and tan of angles
between 0 and 360 with increments of 30 degrees.
*/

package chapter6;

public class MathTables{
    
    public static void main(String[] args){
        System.out.println();
        printCommonLogTable();
        System.out.println();
        printAdditionTable();
        System.out.println();
        printTrigTables();
    }
    
    /**
     * This method prints a table of common logs from 0 to 10
     */
    public static void printCommonLogTable(){
        System.out.println("Common Log Table:");
        double i = 0;
        while(i <= 10){
            //double log = Math.log10(i); This can be in place of the conversion on line 26.
            double log = (Math.log(i)/Math.log(10));
            System.out.println(i + ":  " + log);
            i = i + 0.5;
        }
    }
    
    /**
     * This method prints a two dimensional table on addition.
     * Using the number 1 to 12. And using the additionTableHelp()
     * method to do it.
     */
    public static void printAdditionTable(){
        System.out.println("Addition Table");
        for(int i = 0; i <= 12; i++){
            additionTableHelp(i);
        }
    }
    
    /**
     * This method helps the printAdditionTable() method.
     * By creating a addition table from 0 to 12.
     * @param n Number that is being added to i to create the addition table.
     * i are the numbers on the x axis and n are the numbers on the y axis.
     * By adding the 2 together you get the result and a table of additions.
     */
    public static void additionTableHelp(int n){
        for(int i = 0; i <= 12; i++){
            System.out.print(i+n + " ");
        }
        System.out.println();
    }
    /**
     * This method prints a table for the sin, cos, and tan of the angles between 0 and 360.
     * Increasing by increments of 30 degrees each time for each.
     */
    public static void printTrigTables(){
        System.out.println("Trig Table:");
        for(double i = 0; i <= 360; i = i + 30){
            double rad = (i *Math.PI)/180;
            System.out.println(i + ": " + Math.sin(rad) + "..." + Math.cos(rad) + "..." + Math.tan(rad));
        } 
   }
}