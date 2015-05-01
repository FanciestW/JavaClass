package week10;

import java.io.*;

public class Week10{
    
    public static void main(String[] args) throws IOException{
        writeToFile("C:\\Users\\William\\Documents\\JavaClass\\MoreDates\\src\\moredates\\String.txt");
    }
    
    public static void writeToFile(String filename) throws IOException{
        BufferedWriter outputWriter = new BufferedWriter (new FileWriter(filename));
        outputWriter.write("Hello");
        outputWriter.newLine();
        outputWriter.write("World");
        outputWriter.flush();
        outputWriter.close();
    }
}