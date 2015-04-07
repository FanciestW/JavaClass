/*
Scrabble.java
By: William Lin
This program used Tile.java to display a Scrabble tile.
*/

package scrabble;

public class Scrabble{
    
    public static void main(String[] args){
        Tile tile = new Tile('Z', 10);
        Tile.printTile(tile);
    }
}