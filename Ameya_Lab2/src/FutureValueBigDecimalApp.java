/********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Lab 2 (Ch5 #24)
Submission Date: 10:00 pm, Wed (10/05) 
Brief Description:  Application to get future value of investment using Big Decimal
*********************************************************************************/ 

import java.util.*; // import java util library
import java.math.*; // import java math library
import java.text.*; // import java text library

public class FutureValueBigDecimalApp {  // main class name 
public static void main(String[] args) { // main method

		String choice = "y", // string used to store choice
			   userName; // username 
		double monthlyInvestment, // declaration for monthly investment, yearly return rate
		       yearlyReturnRate; 
		int    investYears; // declaration for investment years
		final int minYear = 1, // final values to validate the range of input values
				  maxYears = 120;
		final double minAmt = 1.00,
					 maxAmt = 1000000.00,
					 minRtnRate = 0.1,
					 maxRtnRate = 35;
	
	String 	investStr; // store investment

	Scanner sc = new Scanner(System.in); // initiate scanner class
	FutureValue futureValue = new FutureValue();  //Create the object

	while(choice.equalsIgnoreCase("y")) { // run while user enters y as a choice

		System.out.print("Please enter your name: "); // prompt to get user name
		userName = sc.next();						 // read input for username
		futureValue.setName(userName);				//Set name
		sc.nextLine();

		monthlyInvestment = Validator.validateDouble(sc, "Your monthly invest: ", minAmt, maxAmt); // validate monthly invest values
		futureValue.setMonthlyInvest(monthlyInvestment); // set monthly investment

		yearlyReturnRate = Validator.validateDouble(sc, "Interest rate: ", minRtnRate, maxRtnRate); // validate interest rate
		futureValue.setYearlyRate(yearlyReturnRate); // set yearly rate 

		investYears = Validator.validateInt(sc, "Invest years: ", minYear, maxYears); // vaidate invest years 
		futureValue.setYears(investYears); // set invest years

		futureValue.futureValueCompute(); // calculate the future value

		//Formatted output for currency
		NumberFormat currency = NumberFormat.getCurrencyInstance(); // current format
		investStr = currency.format(futureValue.getMonthlyInvest()); // set monthly investment currency format
		BigDecimal bigFutureValueStr = new BigDecimal(futureValue.getFutureValue()); // convert using BigDecimal

		//Formatted output for percent
		NumberFormat percent = NumberFormat.getPercentInstance(); // format for percent
		percent.setMinimumFractionDigits(2); // set minimum fraction
		percent.setMaximumFractionDigits(3); // set maximum fraction
		currency.setMaximumFractionDigits(3); // set maximum fraction
		BigDecimal bigGetYearlyRate = new BigDecimal(futureValue.getYealyRate()); // set big yearly rate
		BigDecimal bigHundred = new BigDecimal(100); // set constant value as big decimal
		BigDecimal bigYearlyRate = bigGetYearlyRate.divide(bigHundred); // set bug yearly rate
		
		System.out.println("Your name: " + futureValue.getName()); // show outputs 
		System.out.println("Invest amount: " + investStr);
		System.out.println("interest rate: " + percent.format(bigYearlyRate));
		System.out.println("Invest years: " + futureValue.getYears());
		System.out.println("Future value: " + currency.format(bigFutureValueStr));
		
		do	{
			System.out.println("Contine?(y/n only): "); // accept choice as y or n only
			choice = sc.next();
			} while (!choice.equalsIgnoreCase("y") && !choice.equalsIgnoreCase("n") );
	 			
		sc.nextLine();		//Clear the buffer
 	} //End of while

 	System.out.println("Good bye!");
  } //End of main()
} //End of FutureValueBigDecimalApp