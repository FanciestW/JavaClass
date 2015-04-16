/*
sortArray.java
By: William Lin
This program takes an int[] array and sorts in from largest to smallest.
*/

public class sortArray{
    
    public static void main(String[] args){
        int[] array = randomIntArray(10, 0, 10);
        System.out.println("Original:");
        printArray(array);
        System.out.println("Sorted:");
        sortArray(array);
        printArray(array);
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
     * This method prints the int[] array that is passed in.
     * @param array The array that is printed.
     */
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
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
    
    //***fix this method*******
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
}