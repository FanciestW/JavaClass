/*
AreaCircle.java
By: William Lin

*/
package chapter5;

import java.util.*;

public class AreaCircle{
    
    public static void main(String[] args){
        Scanner scInput = new Scanner(System.in);
        System.out.print("X1: ");
        double x1 = scInput.nextDouble();
        System.out.print("Y1: ");
        double y1 = scInput.nextDouble();
        System.out.print("X2: ");
        double x2 = scInput.nextDouble();
        System.out.print("Y2: ");
        double y2 = scInput.nextDouble();
        System.out.println("Area: " + areaCircle(x1, x2, y1, y2));
    }
    
    public static double distance(double x1, double x2, double y1, double y2){
        return(Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2))));
    }
    
    public static double areaCircle(double radius){
        return(Math.PI * (Math.pow(radius, 2)));
    }
    
    public static double areaCircle(double x1, double x2, double y1, double y2){
        double radius = distance(x1, x2, y1, y2)/2;
        return(areaCircle(radius));
    }
}