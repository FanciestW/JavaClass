import javax.swing.JOptionPane;

public class Array{
    
    /**
     * Prints an array that is passed as the parameter.
     * @param array An int array that is going to be printed
     */
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    /**
     * Prints an array that is passed as the parameter.
     * @param array A string array that is going to be printed
     */
    public static void printArray(String[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    /**
     * Prints an array that is passed as the parameter.
     * @param array A double array that is going to be printed
     */
    public static void printArray(double[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    /**
     * Prints an array that is passed as the parameter.
     * @param array A char array that is going to be printed.
     */
    public static void printArray(char[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    
    /**
     * Creates an int array with user inputted values and with a set length
     * @param n the length of the array that is to be created.
     * @return The created array.
     */
    public static int[] createIntArray(int n){
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            int x;
            while(true){
                try{
                    String input = JOptionPane.showInputDialog("Array value at index " + i + ":");
                    if(input == null) System.exit(0);
                    x = Integer.parseInt(input);
                    break;
                }
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Please enter an Integer");
                }                
            }
            array[i] = x;
        }        
        return array;
    }
    
    /**
     * Creates an String array with user inputted values and with a set length
     * @param n the length of the array that is to be created.
     * @return The created array.
     */
    public static String[] createStringArray(int n){
        String[] array = new String[n];
        for(int i = 0; i < n; i++){
            String input = JOptionPane.showInputDialog("Array value at index " + i + ":");
            if(input == null) System.exit(0);  
            array[i] = input;
        }     
        return array;
    }
    
    /**
     * Creates an double array with user inputted values and with a set length
     * @param n the length of the array that is to be created.
     * @return The created array.
     */
    public static double[] createDoubleArray(int n){
        double[] array = new double[n];
        for(int i = 0; i < n; i++){
            double x;
            while(true){
                try{
                    String input = JOptionPane.showInputDialog("Array value at index " + i + ":");
                    if(input == null) System.exit(0);
                    x = Double.parseDouble(input);
                    break;
                }
                catch(NumberFormatException ex){
                    JOptionPane.showMessageDialog(null, "Please enter a Double");
                }                
            }
            array[i] = x;
        }
        
        return array;
    }
}