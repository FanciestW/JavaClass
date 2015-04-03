/*
Score.java
By: William Lin
Reads Scores from a file and displays the total of all of them.
*/
package week9;

import java.io.*;

public class Score {
    
    public static void main(String[] args) throws IOException, FileNotFoundException{
        System.out.println("Total: " + processFile("C:/scores.txt"));
    }
    
    /**
     * This method reads each line of the given file name that is passed as a parameter to the method.
     * Then it takes all the values or scores and adds them up and gets a total.
     * @param filename the file location.
     * @return The total of all the scores.
     * @throws IOException
     * @throws FileNotFoundException 
     */
    public static int processFile(String filename) throws IOException, FileNotFoundException{
        BufferedReader inputReader = new BufferedReader (new InputStreamReader(new FileInputStream(filename)));
        String line;
        int total = 0;
        while((line = inputReader.readLine()) != null){
            int value = Integer.parseInt(line);
            total = total + value;
        }
        inputReader.close();
        return(total);
    }
}
