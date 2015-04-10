package arrays;

public class Arrays{
    
    public static void main(String[] args){
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = i + 1;
        }
        for(int i = 0; i < 25; i++){
            System.out.println(randomInt(0, 10));
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
    }
    
    /**
     * This method prints an int array
     * @param array the int array you want to print.
     */
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    
    /**
     * This method prints an double array
     * @param array the double array you want to print.
     */
    public static void printArray(double[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    
    /**
     * This method prints an String array
     * @param array the String array you want to print.
     */
    public static void printArray(String[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
    
    /**
     * This method clones an int array
     * @param array the array that is going to be cloned.
     * @return the new clone array.
     */
    public static int[] cloneIntArray(int[] array){
        int[] newArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }
        return newArray;
    }
    
    /**
     * Generates a random number from the low value to the high value.
     * @param low the lowest random number limit
     * @param high the highest random number limit
     * @return the random int rounded from its double
     */
    public static int randomInt(int low, int high){
        double x = Math.random();
        x *= high;
        x += low;        
        return (int) Math.round(x);
    }
}