/*
Fraction.java
By: William Lin
This program uses the Rational class definition. This program creates rational numbers 
and modifies them.
*/

package rational;

public class Fractions{
    
    public static void main(String[] args){
        Rational rat1 = new Rational(4,5);
        Rational rat2 = new Rational();
        rat2.num = 5;
        rat2.den = 4;
        System.out.print(rat1.num + "/" + rat1.den + " + " + rat2.num + "/" + rat2.den + " = ");
        Rational rat3 = Rational.add(rat1, rat2);
        Rational.printRational(rat3);
        System.out.print(rat3.num + "/" + rat3.den + " = ");
        Rational.reduce(rat3);
        Rational.printRational(rat3);
        System.out.print("Inverted: ");
        Rational.invert(rat3);
        Rational.printRational(rat3);
        System.out.print("Negated: ");
        Rational.negate(rat3);
        Rational.printRational(rat3);
    }
}