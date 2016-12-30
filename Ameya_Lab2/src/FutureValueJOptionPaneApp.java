/********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Lab 2 (Ch5 #25)
Submission Date: 10:00 pm, Wed (10/05) 
Brief Description:  Application to get future value of investment using 
	Big Decimal and JOptionPane
*********************************************************************************/ 

import java.math.*; // import java math library
import java.text.*; // import java text library
import javax.swing.JOptionPane; // import JoptionPane library

public class FutureValueJOptionPaneApp {  // main class name 
public static void main(String[] args) { // main method

		Character choice = 'y'; // string used to store choice
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

	FutureValue futureValue = new FutureValue();  //Create the object

	while(choice == 'y' || choice == 'Y') { // repeat until user choice is y

		String userName = JOptionPane.showInputDialog("Please enter your name: ");  // accept username via a dialog
		futureValue.setName(userName);				//Set user name

		String str = JOptionPane.showInputDialog("Your monthly invest: "); //accept monthly invest
		Double inputMonthlyInvestment = Double.parseDouble(str); // set monthly invest
		monthlyInvestment = ValidatorJOptionPane.validateDouble(inputMonthlyInvestment, "Your monthly invest: ", minAmt, maxAmt); // validate
	    futureValue.setMonthlyInvest(monthlyInvestment); // set monthly invest

	    str = JOptionPane.showInputDialog("Interest Rate: "); //accept interest rate
		Double inputYearlyReturnRate = Double.parseDouble(str); //set interest rate
		yearlyReturnRate = ValidatorJOptionPane.validateDouble(inputYearlyReturnRate, "Your interest rate: ", minRtnRate, maxRtnRate); // validate
		futureValue.setYearlyRate(yearlyReturnRate); // set yearly rate

		str = JOptionPane.showInputDialog("Invest Years: "); // accept invest years
		Integer inputInvestYears = Integer.parseInt(str); //set invest years
		investYears = ValidatorJOptionPane.validateInt(inputInvestYears, "Invest years: ", minYear, maxYears); // validate
		futureValue.setYears(investYears); //set invest years

		futureValue.futureValueCompute(); // calculate future value

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
	
		JOptionPane.showMessageDialog(null, "Your name: " + futureValue.getName() + "\n" + // show dialog
				"Invest amount: " + investStr + "\n" +
				"interest rate: " + percent.format(bigYearlyRate) + "\n" +
				"Invest years: " + futureValue.getYears() + "\n" +
				"Future value: " + currency.format(bigFutureValueStr));
		
		do	{
		    str = JOptionPane.showInputDialog("Contine?(y/n only)"); // repeat until user selects y or n
			choice=str.charAt(0);
			} while (choice != 'y' && choice != 'Y' && choice != 'n' && choice != 'N');
	 			
 	} //End of while

	JOptionPane.showMessageDialog(null, "Good bye!");
  } //End of main()
} //End of FutureValueJOptionPaneApp