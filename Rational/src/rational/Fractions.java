/*
Fraction.java
By: William Lin

*/

package rational;

public class Fractions{
    
    public static void main(String[] args){
        Rational rat1 = new Rational(3,6);
        Rational rat2 = new Rational(2,5);
        Rational rat3 = Rational.add(rat1, rat2);
        Rational.printRational(rat3);
    }
}