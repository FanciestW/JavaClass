/**
 * Trip.java
 * By: William Lin
 * This class is the main class of the program.
 */

import javax.swing.JOptionPane;
import java.io.*;

public class Trip {

    public static void main(String[] args) throws IOException, FileNotFoundException{
        JOptionPane msg = new JOptionPane();
        String make = msg.showInputDialog("Make:");
        String model = msg.showInputDialog("Model:");
        Car myCar = new Car(make, model);
        System.out.println(Car.findCar(myCar.make, myCar.model));
        System.out.println(Car.getMPG(Car.findCar(myCar.make, myCar.model)));
    }
}
