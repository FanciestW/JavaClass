/*
Reservation.java
Group Members: Cameron Sheedy, Rahul Malhotra, William Lin, Anand Kumar, Briana Schmidt
Rahul did the Reservation class
This class will create an object that holds the information to keep track of each reservation made.
 */


public class Reservation {
    String name, phoneNum, time;
    int numInParty;
    
    // initalize with paramaters - Rahul
    public Reservation (String name, String phoneNum, String time, int numInParty) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.time = time;
        
        this.numInParty = numInParty;
    }
    
    // initalize without parameters - Rahul
    public Reservation () {
        this.name = ("");
        this.phoneNum = ("");
        this.time = ("");
        
        this.numInParty = 0;
    }
}