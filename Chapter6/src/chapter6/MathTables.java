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
        printTrigTables();
    }
    
    /**
     * This method prints a table of common logs from 0 to 10
     */
    public static void printCommonLogTable(){
        double i = 0;
        while(i <= 10){
            double log = Math.log10(i);
            double log2 = (Math.log(i)/Math.log(10));
            System.out.println(i + ":  " + log2);
            i = i + 0.5;
        }
    }
    
    /**
     * This method prints a two dimensional table on addition.
     * Using the number 1 to 12. And using the additionTableHelp()
     * method to do it.
     */
    public static void printAdditionTable(){
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
        for(double i = 0; i <= 360; i = i + 30){
            System.out.println(i + ": " + sin(i) + "..." + cos(i) + "..." + tan(i));
        } 
   }
    
    /**
     * This method helps the printTrigTable() method by finding the sin of 
     * the parameter n.
     * @param deg The degree used to find sin. Converted to radians.
     * @return The sin of parameter n.
     */
    public static double sin(double deg){
        double rad = (deg * Math.PI)/180;
        return(Math.sin(rad));
    }
    
    /**
     * This method helps the printTrigTable() method by finding the cos of 
     * the parameter n.
     * @param deg The degree used to find cos. Converted to radians.
     * @return The cos of parameter n.
     */
    public static double cos(double deg){
        double rad = (deg * Math.PI)/180;
        return(Math.cos(rad));
    }
    
    
    /**
     * This method helps the printTrigTable() method by finding the tan of 
     * the parameter n.
     * @param deg The degree used to find tan. Converted to radians.
     * @return The tan of parameter n.
     */
    public static double tan(double deg){
        double rad = (deg * Math.PI)/180;
        return(Math.tan(rad));
    }
}