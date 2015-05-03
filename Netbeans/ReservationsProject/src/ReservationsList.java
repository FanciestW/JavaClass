/*
ReservationsList.java
Group Members: Cameron Sheedy, Rahul Malhotra, William Lin, Anand Kumar, Briana Schmidt
ReservationList class is by Cameron Sheedy
Edited by William Lin
This class will create an array of reservation objects and a capability to sort the array based on the time of the reservations.
This program is assuming all times are in military format (00:00) to differentiate am and pm
 */

public class ReservationsList {
    Reservation [] reservationsArray;
    
    public ReservationsList (int length) {
        Reservation blank = new Reservation("","","",0);
        this.reservationsArray = new Reservation[length];
        for(int i = 0; i < this.reservationsArray.length; i++){
            this.reservationsArray[i] = blank;
        }
    }
    
    public void addArrayItem (int index, String name, String phone, String time, int numInParty) {
        //William: I changed the old code to make it like this. It works the same way.
        reservationsArray[index] = new Reservation (name, phone, time, numInParty);
    }

   //Finds the hour of the string and returns a comparable int value
    private static int returnHourInt (Reservation a) {
        /*
        William: Simplified the method to find where the ':' of the time is
        and make it return the int value of whatever is to the left of the ':'
        */
        String time = a.time;
        if(!time.equals("")){
            return Integer.parseInt(time.substring(0, time.indexOf(":")));
        }
        return 24;
    }

    //Finds the minute of the string and returns a comparable int value
    private static int returnMinuteInt (Reservation a) {
        /*
        William: Simplified the method to find where the ':' is in the time string
        and made it return the int value that is after the ':'
        */
        String time = a.time;
        if(!time.equals("")){
            return Integer.parseInt(time.substring(time.indexOf(":") + 1, time.length() - 1));
        }
        return 59;
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
        //William: Changed 2400 to 1440 because there's 1440 minutes in a 24hr day.
        int minTime = 1440;  //Highest possible time so we can keep undercutting it until we reach the minimum
        int i = startIndex;
        while (i <= list.length - 1) { //We do need to subtract 1 because it is <=
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
                
        for (int i = 0; i <= reservationsArray.length - 1; i++) {
            //William: I Deleted: int swapIndex = 0; we should just use i since it keeps the same value as swapIndex.
            int minTimeIndex = indexOfMinInRange(reservationsArray, i);
            swapElement(reservationsArray, i, minTimeIndex);
        }
    } 

}
