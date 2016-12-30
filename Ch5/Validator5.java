/**********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Extra Credit
Submission Date: 10:00 pm, Wed (12/07)
***********************************************************************************/ 

package Ch5;
import java.util.Scanner;

public class Validator5 {

	public static double checkRange(Scanner sc, String prompt, double minAmt, double maxAmt) { // validate Double method
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

	//Method of inRange()
	private static boolean inRange(double num, double minAmt, double maxAmt) {
		if (num >= minAmt && num <= maxAmt)
			return true;
		else
			return false;
	}
	
	public static double validateDouble(Scanner sc, String prompt) {
		boolean isValid = false;
		double data = 0.0;

		while(!isValid) {
			try {
		 		System.out.print(prompt);
				if ( !sc.hasNextInt() )					//Illegal integer
				   throw new NumberFormatException();	//Throw the exception
				data = sc.nextInt();
				isValid = true;

				}								//End of try
			catch ( NumberFormatException e) {
				 System.out.println("\nInput data error! Please enter a decimal data...");
				 sc.nextLine();					//Clear the buffer
				}							//End of catch
			} 	//End of while
			return data;
		}

	//Validate integer
	public static int validateInt(Scanner sc, String prompt) {
		boolean isValid = false;
		int data = 0;

		 while(!isValid) {
		  try {
	 		System.out.print(prompt);
			if (!sc.hasNextInt())
				throw new NumberFormatException();
			data = sc.nextInt();  //else
			isValid = true;

		  }		//End of try
		catch (NumberFormatException e) {
			System.out.println("\nInput data error.  Please enter an integer...");
			sc.nextLine();		//Clear buffer
		 }
		} 						//End of while
		return data;
	 }	//End of validateInt()
}		//End of Validator2
