/*
SortData.java
By: William Lin
This program sorts integer data from a file.
*/

import java.io.*;

public class SortData{
    
    public static void main(String[] args) throws IOException, FileNotFoundException{
        int[] array = fileToArray("C:\\Users\\William\\Documents\\JavaClass\\SortData\\src\\Data.txt");
        printArray(array);
        sortArray(array);
        printArray(array);
        arrayToFile("C:\\Users\\William\\Documents\\JavaClass\\SortData\\src\\newData.txt", array);
    }
    
    /**
     * This method finds the max value in an array
     * @param array the array used to find the max value
     * @param low the lowest value possible value in the array
     * @param high the highest value possible in the array
     * @return the index where the max value first occurs.
     */
    public static int indexOfMaxInRange(int[] array, int low, int high){
        int index = low;
        int max = array[low];
        for(int i = low; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
                index = i;
            }
        }
        return index;
    }
    
    /**
     * This method takes an array and swaps the value at index and index2.
     * @param array the array that will be used to do the swapping.
     * @param index the index where the value of index2 will become.
     * @param index2  the index where the value of index will become.
     */
    public static void swapElement(int[] array, int index, int index2){
        int hold = array[index];
        int hold2 = array[index2];
        array[index] = hold2;
        array[index2] = hold;
    }
    
     /**
     * This method takes an int[] array and sorts it from largest to smallest.
     * @param array the array that is to be sorted.
     */
    public static void sortArray(int[] array){
        for(int i = 0; i < array.length; i++){
            int indexMax = indexOfMaxInRange(array, i, array.length);
            if(i != indexMax){
                swapElement(array, i, indexMax);
            }
            else;
        }
    }
    
    /**
     * This method reads 25 integers from a file from the filename path.
     * @param filename the location of the file you want to read from.
     * @return an array of the 25 integers in the file.
     */
    public static int[] fileToArray(String filename) throws IOException, FileNotFoundException{
        BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
        String line;
        int i = 0;
        int[] array =new int[25];
        while ((line = read.readLine()) != null){
            array[i] = Integer.parseInt(line);
            i++;
        }
        read.close();
        return array;
    }
    
    /**
     * This method takes an array and writes its values to a file at the filename path.
     * @param filename the location of the file where the array will be written to.
     * @param array the array that will be written to the file.
     */
    public static void arrayToFile(String filename, int[] array) throws IOException{
        BufferedWriter output = new BufferedWriter(new FileWriter(filename));
        for(int i = 0; i < array.length; i++){
            output.write(String.valueOf(array[i]));
            output.newLine();
        }
        output.flush();
        output.close();
    }
    
    /**
     * This method prints an int[] array
     * @param array the int[] array that is to be printed
     */
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}