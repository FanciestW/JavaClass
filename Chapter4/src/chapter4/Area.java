/*
Area.java
By: William Lin
*/
package chapter4;

import java.util.Scanner;

public class Area{
    public static void main(String[] args){
        calcArea();
    }
    
    public static void calcArea(){
        double base, height, radius, length, width;
        System.out.println("1 for Triangle, 2 for Circle, 3 for Rectangle, 0 for none of them");
        Scanner scInput = new Scanner(System.in);
        int input = scInput.nextInt();
        if(input == 1){
            System.out.print("Base of Triangle: ");
            base = scInput.nextDouble();
            System.out.print("Height of Triangle: ");
            height = scInput.nextDouble();
            areaTriangle(base, height);
        }
        else if(input == 2){
            System.out.print("Radius of Circle: ");
            radius = scInput.nextDouble();
            areaCircle(radius);
        }
        else if(input == 3){
            System.out.print("Length of Rectangle: ");
            length = scInput.nextDouble();
            System.out.print("Width of Rectangle: ");
            width = scInput.nextDouble();
            areaRectangle(length, width);
        }
        else{
            return; //This is not needed, if it is empty it will also do nothing since it is the end of the program.
        }
    }
    
    public static void areaTriangle(double base, double height){
        System.out.print("Area = ");
        System.out.println((.5) * base * height);
    }
    
    public static void areaCircle(double radius){
        System.out.print("Area = ");
        System.out.println(Math.PI * (Math.pow(radius, 2)));
    }
    
    public static void areaRectangle(double length, double width){
        System.out.print("Area = ");
        System.out.println(length * width);
    }
}