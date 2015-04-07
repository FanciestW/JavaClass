/*
Rational.java
By: William Lin
This this a class definition.
*/

package rational;

public class Rational{
    
    //Instance variables for rational numbers
    int num, den;
    
    public Rational(){
        this.num = 0;
        this.den = 0;
    }
    
    public Rational(int num, int den){
        this.num = num;
        this.den = den;
    }
    
    /**
     * This is a method and it just prints a rational in a basic form ex: 3/4
     * @param rational this is the Rational that will be printed.
     */
    public static void printRational(Rational rational){
        System.out.println(rational.num + "/" + rational.den);
    }
    
    /**
     * This is a modifier. It takes a given Rational and negates it
     * In other word, it makes a positive negative and a negative positive.
     * @param rational 
     */
    public static void negate(Rational rational){
        rational.num = -rational.num;
    }
    
    /**
     * This is a modifier that takes a given Rational and switches the numerator
     * and denominator also known as inverting the rational.
     * @param rational the given Rational that is used to find the inverse of.
     */
    public static void invert(Rational rational){
        int num = rational.num;
        int den = rational.den;
        rational.num = den;
        rational.den = num;
    }
    
    /**
     * This method returns the double value of a given Rational.
     * @param rational the Rational that is used to find the double
     * @return the double value of the given Rational.
     */
    public static double toDouble(Rational rational){
        return((double) rational.num / (double) rational.den);
    }
    
    /**
     * This is a modifier that takes a Rational and reduces it as much as possible
     * using the gcd method.
     * @param rational used to find the reduced version of the Rational.
     */
    public static void reduce(Rational rational){
        int gcd = gcd(rational.num, rational.den);
        rational.num = rational.num / gcd;
        rational.den = rational.den / gcd;
    }
    
    /**
     * This method finds the greatest common divisor of a and b.
     * @param a used to find the gcd between b
     * @param b used to find the gcd between a
     * @return the gcd
     */
    public static int gcd(int a, int b){
        int r = a % b;
        if(r != 0){
            return gcd(b, r);
        }
        else{
            return(b);
        }
    }
    
    public static Rational add(Rational rat1, Rational rat2){
        int num1 = rat1.num * rat2.den;
        int num2 = rat2.num * rat1.den;
        int num = num1 + num2;
        int den = rat1.den * rat2.den;
        return new Rational(num, den);
    }
}