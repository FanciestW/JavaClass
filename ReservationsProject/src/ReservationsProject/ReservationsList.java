/*
ReservationsList.java
Group Members: Cameron Sheedy, Rahul Malhotra, William Lin, Anand Kumar, Briana Schmidt
ReservationList class is by Cameron Sheedy
Edited by William Lin
This class will create an array of reservation objects and a capability to sort the array based on the time of the reservations.
This program is assuming all times are in military format (00:00) to differentiate am and pm
 */
package reservationslist;

public class ReservationsList {
    Reservation [] reservationsArray;
    
    public ReservationsList (int length) {
    this.reservationsArray = new Reservation[length];
    
}
    public void addArrayItem (int index, String name, String phone, String time, int numInParty) {
        Reservation r1 = new Reservation (name, phone, time, numInParty);
        reservationsArray[index] = r1;
    }

   //Finds the hour of the string and returns a comparable int value
    private static int returnHourInt (Reservation a) {
        /*
        William: Simplified the method to find where the ':' of the time is
        and make it return the int value of whatever is to the left of the ':'
        */
        return Integer.parseInt(time.substring(0, time.indexOf(":"))); 
    }

    //Finds the minute of the string and returns a comparable int value
    private static int returnMinuteInt (Reservation a) {
        /*
        William: Simplified the method to find where the ':' is in the time string
        and made it return the int value that is after the ':'
        */
        return Integer.parseInt(time.substring(time.indexOf(":") + 1, time.length()));
    }

    //Takes the hour and minutes ints and creates a four digit int to create one comparable time int
    private static int time (Reservation a ) {
        int hour = returnHourInt(a);
        int min = returnMinuteInt(a);
        int timeInMin = (hour * 60) + min;  //William: Changed 'hour * 100' to 'hour * 60' so hours are changed to minutes.
        return timeInMin;   //William: Changed variable name to better respressent what variable is storing.
    }

    //Swaps elements int the array
    private static void swapElement (Reservation[] list, int index1, int index2) {
        Reservation firstValue = list[index1]; 
        Reservation secondValue = list[index2];
        list[index1] = secondValue;
        list[index2] = firstValue;      
    }

    //Finds the index of the Reservation object with the smallest time
    private static int indexOfMinInRange (Reservation[] list, int startIndex) {
        int minIndex = 0;
        int minTime = 2400;  //Highest possible time so we can keep undercutting it until we reach the minimum
        int i = startIndex;
        while (i <= list.length-1) {
            int time = time(list[i]);
            if (time <= minTime) {
                minIndex = i;
                minTime = time;
            }
            i++;
        }
        return minIndex;     
    }

    //Sorts the array based on time
    public static void sortArray (Reservation[] reservationsArray) { 
                
        for (int i=0; i<=reservationsArray.length-1; i++) {
            int swapIndex = 0;
            int minTimeIndex = indexOfMinInRange(reservationsArray, swapIndex);
            swapElement(reservationsArray, swapIndex, minTimeIndex);
            swapIndex++;
        }
    } 

}
