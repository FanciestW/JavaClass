/**
 * myApplet.java
 * By: William Lin
 * This program creates a Applet that runs on a website.
 * It displays a common log table from last week.
 */

import java.applet.Applet;
import java.awt.*;

public class myApplet extends Applet{
	
    public void paint(Graphics g){
        setBackground(Color.CYAN);
	g.drawString("My name is: William Lin", 5, 20);
        g.drawString("I am a senior in high school", 5, 35);
	printCommonLogTable(g);
    }
        
    /**
     * This method displays in the applet the common log table.
     * @param g Provides the graphics
     */
    public static void printCommonLogTable(Graphics g){
        g.drawString("Common Log Table:", 5, 50);
        double i = 0;
        int y = 65;
        while(i <= 10){
            double log = (Math.log(i)/Math.log(10));
            String row = i + ":  " + log;
            g.drawString(row, 5, y);
            i = i + 0.5;
            y = y + 15;
        }
    }
}