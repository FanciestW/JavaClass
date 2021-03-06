/*
AreaCircle.java
By: William Lin
This program finds the radius of a circle by using the point of the center
of the circle. And a point on the outside of the circle. It then uses that radius to find
the area of that specific circle.
*/
package chapter5;

import java.util.*;

public class AreaCircle{
    
    public static void main(String[] args){
        Scanner scInput = new Scanner(System.in);
        System.out.println("Coordinates for center of the circle:");
        System.out.print("X1: ");
        double x1 = scInput.nextDouble();
        System.out.print("Y1: ");
        double y1 = scInput.nextDouble();
        System.out.println("Coordinates for a point on the outside of the circle:");
        System.out.print("X2: ");
        double x2 = scInput.nextDouble();
        System.out.print("Y2: ");
        double y2 = scInput.nextDouble();
        System.out.println("Area: " + areaCircle(x1, x2, y1, y2));
    }
    
    /**
     * Calculates the distance between point (x1,y1) and point (x2,y2). Using the distance formula
     * @param x1 The x coordinate of first point.
     * @param x2 The x coordinate of the second point.
     * @param y1 The y coordinate of the first point.
     * @param y2 THe y coordinate of the second point.
     * @return The distance from point 1 to point 2.
     */
    public static double distance(double x1, double x2, double y1, double y2){
        return(Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2))));
    }
    
    /**
     * Calculates the area of a circle provided a radius. Use formula pi*radius^2
     * @param radius The radius of the circle you want to calculate the area of.
     * @return The area of the circle with the provided radius.
     */
    public static double areaCircle(double radius){
        return(Math.PI * (Math.pow(radius, 2)));
    }
    
    /**
     * Calculates the radius of the circle using the distance() method. You provide
     * it with the point at the center of the circle and a point on the outside of 
     * the circle. The distance between these two points is the radius. Then it takes the
     * radius and uses the areaCircle() to calculate the area of the circle with the provided radius.
     * @param x1 The x coordinate of the center of the circle.
     * @param x2 The x coordinate of the point on the outside of the circle.
     * @param y1 The y coordinate of the center of the circle.
     * @param y2 The y coordinate of the point on the outside of the circle.
     * @return The area of the circle with point (x1,y1) being it's center. And point (x2,y2) being a point on the outside of the circle.
     */
    public static double areaCircle(double x1, double x2, double y1, double y2){
        double radius = distance(x1, x2, y1, y2);
        return(areaCircle(radius));
    }
}