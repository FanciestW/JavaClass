/*
Name.java
By: William Lin
This program converts name in non standard form to stardard form.
And if a name is inputted in standard form, it does not do anything to it.
*/
package chapter7;

import javax.swing.JOptionPane;

public class Name{
    
    public static void main(String[] args){
        while(true){
            String name = JOptionPane.showInputDialog("First and Last Name Please:");
            if(name.length() > 0){
                JOptionPane.showMessageDialog(null, convertName(name));
            }
            else{
                break;
            }
        }
        JOptionPane.showMessageDialog(null, "You can not leave the field blank.");
    }
    
    /**
     * This method checks whether or not the parameter name has a comma in it or not.
     * @param name A string that is going to be checked for any commas.
     * @return true if name has a comma and false if it doesn't
     */
    public static boolean hasComma(String name){
        if(name.indexOf(',') > -1){
            return(true);
        }
        else{
            return(false);
        }
    }
    
    /**
     * This method check the name and converts names into standard form if it is not in standard form.
     * @param name The string that contains that name that is to be checked and converted.
     * @return The name in standard form. If it does not have a space the program
     * will assume there is no last name and first name so it will say "Please enter First and Last Name"
     */
    public static String convertName(String name){
        if(hasComma(name)){
            return(name);
        }
        else if(name.indexOf(' ') > -1){
            int space = name.indexOf(' ');
            String firstName = name.substring(0, space);
            String lastName = name.substring(space + 1, name.length());
            return(lastName + ", " + firstName);
        }
        else{
            return("Please enter First and Last Name");
        }
    }
}