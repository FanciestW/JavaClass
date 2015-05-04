/*
Area.java
Exercise 4.2
By: William Lin
This program calculates the area of a certain shape for you
*/
package chapter4;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class newArea{
    
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
        String strInput = JOptionPane.showInputDialog("1 for Triangle\n2 for Circle\n3 for Rectangle\n0 for none of them");
        int input = Integer.parseInt(strInput);
        if(input == 1){
            strInput = JOptionPane.showInputDialog("Base of Triangle: ");
            base = Double.parseDouble(strInput);
            strInput = JOptionPane.showInputDialog("Height of Triangle: ");
            height = Double.parseDouble(strInput);
            areaTriangle(base, height);
        }
        else if(input == 2){
            strInput = JOptionPane.showInputDialog("Radius of Circle: ");
            radius = Double.parseDouble(strInput);
            areaCircle(radius);
        }
        else if(input == 3){
            strInput = JOptionPane.showInputDialog("Length of Rectangle: ");
            length = Double.parseDouble(strInput);
            strInput = JOptionPane.showInputDialog("Width of Rectangle: ");
            width = Double.parseDouble(strInput);
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
        JOptionPane.showMessageDialog(null,"Area = " + ((.5) * base * height));
    }
    
    /**
     * This method calculates the area of a circle. It requires the following parameters:
     * @param radius The radius of the circle.
     */
    public static void areaCircle(double radius){
        JOptionPane.showMessageDialog(null, "Area = " + (Math.PI * (Math.pow(radius, 2))));
    }
    
    /**
     * This method calculates the area of a rectangle. It requires the following parameters:
     * @param length The length of the rectangle.
     * @param width The width of the rectangle.
     */
    public static void areaRectangle(double length, double width){
        JOptionPane.showMessageDialog(null, "Area = " + (length * width));
    }
}