/*
SortData.java
By: William Lin
This program sorts integer data from a file.
*/

import java.io.*;

public class SortData{
    
    public static void main(String[] args) throws IOException, FileNotFoundException{
        
    }
    
    public static int[] fileToArray(String filename) throws IOException, FileNotFoundException{
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
        while (read.readLine() != null){
            
        }
    }
}