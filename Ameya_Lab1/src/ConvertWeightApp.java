/********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Lab 1 (Ch3 #30)
Submission Date: 10:00 pm, Wed (9/21) 
Brief Description:  The application code to run ConvertWeight, create its object, 
	call the methods to assign and display the Weights. 
*********************************************************************************/ 
import javax.swing.JOptionPane; // import javax swing JoptionPane

public class ConvertWeightApp { // class name
public static void main(String[] args) { // main method

	String choice = "y",		//loop control initial value
			   str;				//declare str used to get input value
		
	ConvertWeight ConvertWeight = new ConvertWeight();  //create an object of ConvertWeight
		
	while(choice.equalsIgnoreCase("y")) { // while loop for conversion of weights

		str = JOptionPane.showInputDialog("Welcome to weight conversion application!\n\n"
				+ "enter the weight: "); // input request
		ConvertWeight.setWeight(Double.parseDouble(str));		//set weight

		ConvertWeight.ConvertWeightCompute(); // calculate weights in kg and lbs

		JOptionPane.showMessageDialog(null, Double.parseDouble(str) // display results
									  +" Kilograms is "
									  + ConvertWeight.getWeightLb()
									  +" Pounds \n\n "
									  + Double.parseDouble(str)
									  +" Pounds is "
									  + ConvertWeight.getWeightKg()
									  +" Kilograms"
									  );

		choice = JOptionPane.showInputDialog("continue? (y/n): ");	//ask for continue or no
 	} //end of while

 	JOptionPane.showMessageDialog(null, "Thank you for using weight conversion application.");
  } //end of main()
} //end of TestJOptionPaneApp