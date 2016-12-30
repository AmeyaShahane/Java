/********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Lab 2 (Ch5 #24)
Submission Date: 10:00 pm, Wed (10/05) 
Brief Description:  class to validate the input values 
*********************************************************************************/ 

import java.util.Scanner; // import scanner util library

public class Validator { // class name
	public static double validateDouble(Scanner sc, String prompt, double minAmt, double maxAmt) { // validate Double method
		boolean isValid = false; // boolean flag to check if input is valid
		double data = 0.0; // initialize data 
		sc.nextLine();								//Clear the buffer

		while(!isValid) { // repeat until data is valid
			try { // try
				   System.out.print(prompt); // show prompt

				   if (!sc.hasNextDouble())     //Not a double
				    {   
						throw new NumberFormatException(); // throw exception
					}
				   else {
						data = sc.nextDouble();	//Receive double

						if (inRange(data, minAmt, maxAmt))		//In the right range
					         isValid = true; // set valid flag to true
				      		else
					         throw new Exception();  //Out of range
				   }
			 }								//End of try

			catch (NumberFormatException e) {
				System.out.println("\nData input error.  Please enter a decimal data..."); // show error message
				sc.nextLine();		//Clear buffer
			 }						//End of catch
			catch (Exception e) {
				System.out.println("\nData input out range.  Please enter between "+minAmt+" and "+maxAmt); // show exception
				sc.nextLine(); // skip a line
			 }
			} //End of while
			return data;
		}	//End of validateDouble()

	//Method of validateInt()with range
	public static int validateInt(Scanner sc, String prompt, int min, int max) { // method to validate integer
		boolean isValid = false; // flag to check valid values
		int data = 0; // initialize data
		sc.nextLine();								//Clear the buffer

		 while(!isValid) { // repeat until data is valid
		  try { // try
	 		System.out.print(prompt); // show prompt 
			if (!sc.hasNextInt()) // check if input is integer
				throw new NumberFormatException(); // throw exception
			else {
				data = sc.nextInt(); // accept new value of data

				if (data < min) 				//less than min
					throw new Exception();		//Throw the exception
				else if (data > max) 			//Greater than max
					throw new Exception();		//Throw the exception
				isValid = true;
			}
		  }		//End of try
		catch (NumberFormatException e) {
			System.out.println("\nData input error.  Please enter an integer...");
			sc.nextLine();		//Clear buffer
		 }						//End of catch
		catch (Exception e) {
			System.out.println("\nInput data out of the range error. Please check the data and try again...");
			sc.nextLine();
		 }
		} 						//End of while
		return data;
	 }	//End of validateInt()

	//Method of inRange()
	private static boolean inRange(double num, double minAmt, double maxAmt) {
		if (num >= minAmt && num <= maxAmt)
			return true;
		else
			return false;
	}

}			//End of Validator
