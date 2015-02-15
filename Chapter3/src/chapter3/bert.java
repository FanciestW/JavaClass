/*  //Was missing the opening slash to the multi-line comment
 Chapter 3 Debugging Assignment
 Programmer: William Lin
 Date: 2/15/15
 Program Name: Bert.java    //Program name should have .java extension
 Purpose:
*/
package chapter3; //Package was required for Netbeans to run program
import java.util.Scanner;
 
public class bert
{
    public static void main(String[] args)
    {

        //Declaring Variables
        int price, downPayment, tradeIn, months;
 	double annualInterest, payment;
        String custName;

        Scanner reader = new Scanner (System.in);

        //Get Input from User
        System.out.println("What is your first name? ");
        custName = reader.next();
        System.out.print("What is the price of the car? ");
        price = reader.nextInt(); //Missing semi-colon
        System.out.print("What is the downpayment? ");
        downPayment = reader.nextInt();     //The i in int has to be capitalized
        System.out.print("What is the trade-in value? ");
        tradeIn = reader.nextInt(); //The i in int has to be capitalized
        System.out.print("For how many months is the loan? ");
        months = reader.nextInt();
        System.out.print("What is the decimal interest rate? ");
        annualInterest = reader.nextDouble();

        //Output
        calculatePayment(price, downPayment, tradeIn, months, annualInterest); //method parameters months and annualInterests were switched.
   }

    public static void calculatePayment(int price, double downPayment, int tradeIn,
            int months, double annualInterest)
    {
        double interest; //Made interest interest so line 49 calculation is possible.
        double loanAmt; //loanAmt was made into a double to work with calculation on line 50
 	double payment;

	//Calculations
        interest = annualInterest/12; //interest was made into a double to be compatible with annualInterest which is a double type
	loanAmt = price-downPayment-tradeIn; //Variable downPayment was spelled with a lowercase 'p' And it needs to exact variable name. Also loan amount was made into a double to be compatible.
	payment = loanAmt/((1/interest)-(1/(interest * (Math.pow(interest, months)+1)))); //Correct parameters for Math.pow and fixed placements of parenthesises.


	System.out.print("The monthly payment for " + custName + " is $");
	System.out.println(payment);

        return;
    }
}