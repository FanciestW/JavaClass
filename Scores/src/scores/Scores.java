/*
Scores.java
By: William Lin
This program gets user inputted scores and writes them to a seperate file.
Then the program reads all of the scores on the file and finds the mean or average.
*/

package scores;

import java.io.*;
import java.util.*;

public class Scores{
    
    public static void main(String[] args) throws IOException{
        writeToFile("C:/Scores.txt");
        double average = readFileAverage("C:/Scores.txt");
        System.out.println("The average: " + average);
    }
    
    //This method gets user inputted scores and stores them in a file.
    public static void writeToFile(String filename) throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        Scanner scInput = new Scanner(System.in);
        System.out.print("Number of scores: ");
        int n = scInput.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Score" + (i + 1) + ": ");
            String score = scInput.next();
            writer.write(score);
            writer.newLine();
        }
        writer.flush();
        writer.close();
    }
    
    //This method reads the scores and finds the average of those scores.
    public static double readFileAverage(String filename) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        int total = 0;
        int n = 0;
        while((line = reader.readLine()) != null){
            int value = Integer.parseInt(line);
            total = total + value;
            n++;
        }
        reader.close();
        return(total/n);
    }
}