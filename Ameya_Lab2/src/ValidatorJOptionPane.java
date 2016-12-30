/********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Lab 2 (Ch5 #25)
Submission Date: 10:00 pm, Wed (10/05) 
Brief Description:  class to validate the input values using JOptionPane
*********************************************************************************/ 

import javax.swing.JOptionPane; // import JOptionPane libararies

//Example of validation class with verfication of the integer range

public class ValidatorJOptionPane { // class to validate input values
	public static double validateDouble(Double data, String prompt, double minAmt, double maxAmt) { // method to validate double
		boolean isValid = false; // set flag to check valid value

		while(!isValid) { // repeat until data is valid
			
			try { // try
						if (inRange(data, minAmt, maxAmt))		//In the right range
					         isValid = true;
				      		else
					         throw new Exception();  //Out of range
			 }								//End of try

			catch (Exception e) { // catch the exception
				String str = JOptionPane.showInputDialog(prompt+"Data input out range.  Please enter between "+minAmt+" and "+maxAmt);
				data = Double.parseDouble(str); // convert input to double
			 }
			} //End of while
			return data; // return valid value
		}	//End of validateDouble()

	//Method of validateInt()with range
	public static int validateInt(Integer data, String prompt, int min, int max) { // method to validate integer
		boolean isValid = false; // flag to check if input data is valid
		
		 while(!isValid) { // repeat until input is valid
		  try { // try
	 		System.out.print(prompt); // show prompt
				if (data < min) 				//less than min
					throw new Exception();		//Throw the exception
				else if (data > max) 			//Greater than max
					throw new Exception();		//Throw the exception
				isValid = true;
		  }		//End of try
		catch (Exception e) {
			String str = JOptionPane.showInputDialog(prompt+"Data input out range.  Please enter between "+min+" and "+max);
			data = Integer.parseInt(str);
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

}			//End of ValidatorJOptionPane
