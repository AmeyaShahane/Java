package Ch13;
/********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Extra Credit
Submission Date: 10:00 pm, Wed (12/07)
Brief Description: validator class to validate user inputs. 
*********************************************************************************/ 

import javax.swing.JOptionPane; // import JOptionPane libraries

//Example of validation class with verification of the integer range

public class Validator { // class to validate input values

	//Method of validateInt()with range
	public static int validateCredit(Integer data, String prompt, int min, int max) { // method to validate integer
		boolean isValid = false; // flag to check if input data is valid
		
		 while(!isValid) { // repeat until input is valid
		  try { // try
				if (data < min) 				//less than min
					throw new Exception();		//Throw the exception
				else if (data > max) 			//Greater than max
					throw new Exception();		//Throw the exception
				isValid = true;
		  }		//End of try
		catch (Exception e) {
			String str = JOptionPane.showInputDialog(prompt+"Value of credit is out range.  Please enter between "+min+" and "+max);
			data = Integer.parseInt(str);
		 }
		} 						//End of while
		return data;
	 }	//End of validateInt()

	public static String validateGrade(String grade, String prompt) { // method to validate integer
		boolean isValid = false; // flag to check if input data is valid
		
		 while(!isValid) { // repeat until input is valid
		  try { // try
	 		int gradelength = grade.length();	 	
				if (gradelength < 1 || gradelength > 2) 				//less than min
					throw new Exception();		//Throw the exception
				else if (!grade.matches("[A|B|C|D|E|F]") ) 			//Greater than max
					throw new Exception();		//Throw the exception
				isValid = true;
		  }		//End of try
		catch (Exception e) {
			String str = JOptionPane.showInputDialog(prompt+"Data input invalid, please enter valid grade [A-F]");
			grade = (str);
		 }
		} 						//End of while
		return grade;
	 }	//End of validateInt()

}			//End of Validator
