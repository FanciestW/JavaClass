/*
Area.java
By: William Lin
This program calculates the area of a certain shape for you
*/
package chapter4;

import java.util.Scanner;

public class Area{
    public static void main(String[] args){
        calcArea();
    }
    
    /**
     * This method has no parameters. All it does is double the variables needed to find all the areas for
     * all the different shapes. And it also asks the user what shape they are going to calculate the area of.
     * Also it ask them what the shapes values are. Then it takes the input and assigns them to the right variables.
     * And depending what the user chooses, it invokes the correct method to find that shapes area. Passing the 
     * inputted values as the parameters to that one method.
     */
    public static void calcArea(){
        double base, height, radius, length, width;
        System.out.println("1 for Triangle\n2 for Circle\n3 for Rectangle\n0 for none of them");
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
            return; //This is not needed, if it is empty it will also do nothing since it is the end of the program
        }
    }
    
    /**
     * This method calculates the area of a right triangle. It requires the following parameters:
     * @param base The base of the triangle
     * @param height The height of the triangle
     */
    public static void areaTriangle(double base, double height){
        System.out.print("Area = ");
        System.out.println((.5) * base * height);
    }
    
    /**
     * This method calculates the area of a circle. It requires the following parameters:
     * @param radius The radius of the circle.
     */
    public static void areaCircle(double radius){
        System.out.print("Area = ");
        System.out.println(Math.PI * (Math.pow(radius, 2)));
    }
    
    /**
     * This method calculates the area of a rectangle. It requires the following parameters:
     * @param length The length of the rectangle.
     * @param width The width of the rectangle.
     */
    public static void areaRectangle(double length, double width){
        System.out.print("Area = ");
        System.out.println(length * width);
    }
}