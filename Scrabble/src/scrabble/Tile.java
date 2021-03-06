/*
Tile.java
By: William Lin
This program helps that Scrabble class. This is a class definition.
*/

package scrabble;

public class Tile{
    //Instance variables
    char letter;
    int value;
    
    //This is a constructor that sets the instance variables.
    public Tile(char letter, int value){
        this.letter = letter;
        this.value = value;
    }
    
    /**
     * This method prints the given Tile.
     * @param tile used to print the Scrabble letter and value.
     */
    public static void printTile(Tile tile){
        System.out.println(tile.letter + ", " + tile.value);
    }
    
}