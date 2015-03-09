package chapter7;
import java.applet.Applet;  //Imports the Applet Class
import java.awt.Graphics;   //Imports the Graphics class, used to draw lines, circles, squares, text, etc.

/**
 * This class implements an applet that simply displays "Hello World"
 * @author William
 */
public class Chapter7 extends Applet{
    
    public void paint(Graphics g){
        /*drawString is a method of the Graphics class. It takes a string,
        and two integer parameters. As x and y coordinates. These coordinates 
        correspond to Quadrant I of a traditional coordinate plane, 
        so they are always positive.
        */
        g.drawString("Hello World Applet", 50, 25);
    }
}