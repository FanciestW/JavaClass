package week10;

public class Chapter9{
    
    public static void main(String[] args){
        Time t1 = new Time();
        t1.hour = 11;
        t1.minute = 38;
        t1.second = 3.14159;
        Time t2 = new Time(11, 38, 3.14159);
        System.out.println(checktime(t1, t2));
    }
    
    static boolean checktime(Time t1, Time t2){
        if(t1.hour > t2.hour) return true;
        if(t1.hour < t2.hour) return false;
        if(t1.minute > t2.minute) return true;
        if(t1.minute < t2.minute) return false;
        if(t1.second > t2.second) return true;
        return(false);
    }
}