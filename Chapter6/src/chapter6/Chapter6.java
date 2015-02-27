package chapter6;

public class Chapter6{
    
    public static void main(String[] args){
        int i = 1;
        while(i <= 12){
            multiples(i);
            i++;
        }
    }
    
    public static void multiples(int n){
        int i = 1;
        while(i <= 12){
            System.out.print(n * i + "  ");
            i++;
        }
        System.out.println();
    }
}