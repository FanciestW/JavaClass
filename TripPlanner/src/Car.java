/**
 * Car.java
 * By: William Lin
 * This is a constructor class. It stores information about a certain car
 * Finds the given car if listed and uses its mpg.
 */
import java.io.*;

public class Car {
    String make, model;

    public Car(String make, String model){
        this.make = make;
        this.model = model;
    }

    public Car(){
        this.make = null;
        this.model = null;
    }

    public static String findCar(String make, String model) throws IOException, FileNotFoundException{
        String file = ("C:\\Users\\William\\Documents\\JavaClass\\TripPlanner\\src\\makes\\" + make.toLowerCase() + ".txt");
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        String line;
        while((line = read.readLine()) != null){

            if(getModel(line).equals(model.toLowerCase())){
                return line;
            }
        }
        return "error";
    }

    public static String getModel(String line){
        String model = line.substring(0, line.indexOf(" "));
        return model;
    }

    public static int getMPG(String line){
        int mpg = Integer.parseInt(line.substring(line.indexOf(" ") + 1, line.length()));
        return mpg;
    }
}
