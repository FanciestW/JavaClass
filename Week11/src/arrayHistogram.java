/*
arrayHistogram.java
By: William Lin
This program generates a random array that is n values long. And each values
range from -5 to 15. It then creates a histogram of the array for the number 0 - 10.
*/

public class arrayHistogram {
    
    public static void main(String[] args){
        int[] hist = randomIntArray(10, -5, 15);
        printArray(hist);
        System.out.println("break");
        printArray(arrayHist(hist));
    }
    
    /**
     * THis method generates a random int value within the low and high value.
     * @param low the lowest value the random generated int can be
     * @param high the highest value the random generated int can be.
     * @return the randomly generated int.
     */
    public static int randomInt(int low, int high){
        int diff = high - low;
        double x = diff * Math.random();
        return low + (int)Math.round(x);
    }
    
    /**
     * This method creates an array with n being the length and the low and high being the 
     * range of each value.
     * @param n the length of the array.
     * @param low the lowest values the array can have.
     * @param high the highest value the array can have.
     * @return the generated array.
     */
    public static int[] randomIntArray(int n, int low, int high){
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++){
            array[i] = randomInt(low, high);
        }
        return array;
    }
    
    /**
     * This method creates a histogram array using the array that is passed in as a parameter
     * Finds the histogram from the values 1 to 10.
     * @param array the array used to generate the histogram.
     * @return the new array that contains the histogram.
     */
    public static int[] arrayHist(int[] array){
        int[] hist = new int[11];
        for(int i = 0; i < array.length; i++){
            int index = array[i];
            if(index >= 0 && index <= 10) hist[index]++;
            else if(index < 0) hist[0]++;
            else if(index > 10) hist[10]++;
            else;
        }
        return hist;
    }
    
    /**
     * This method prints the int[] array that is passed in.
     * @param array The array that is printed.
     */
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
