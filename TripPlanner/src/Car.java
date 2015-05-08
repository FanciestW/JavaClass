/**
 * Car.java
 * By: William Lin
 * This is a constructor class. It stores information about a certain car
 * Finds the given car if listed and uses its mpg.
 */
import java.io.*;

public class Car {
    String make, model;
    int mpg;

    public Car(String make, String model, int mpg){
        this.make = make;
        this.model = model;
        this.mpg = mpg;
    }

    public Car(){
        this.make = null;
        this.model = null;
        this.mpg = 0;
    }
}
