/********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Lab 1 (Ch3 #31)
Submission Date: 10:00 pm, Wed (9/21) 
Brief Description:  The application code to run ConvertWeight, create its object, 
	call the methods to assign and display the Weights. 
*********************************************************************************/ 
import javax.swing.JOptionPane;  // import javax JOptionsPane

public class ConvertWeightApp_31 { // class name
public static void main(String[] args) { // main method

	String choice = "y",		//loop control initial value
			   str,	   		    //declare str used to get input value
			   WeightType;		//declare WeigthType
	
	ConvertWeight_31 ConvertWeight_31 = new ConvertWeight_31();  //create an object of ConvertWeight
		
	while(choice.equalsIgnoreCase("y")) { // while loop for conversion of weights

		str = JOptionPane.showInputDialog("Welcome to weight conversion application!\n\n"
				+ "enter the weight: "); // input request
		ConvertWeight_31.setWeight(Double.parseDouble(str));		//set weight

		WeightType = JOptionPane.showInputDialog("Enter type of weight to be converted (K)ilogram or (P)ound: "); // input request
		ConvertWeight_31.setWeightType(WeightType);		//set weight
	
		ConvertWeight_31.ConvertWeightCompute(); // calculate weights in kg and lbs

		JOptionPane.showMessageDialog(null,// display results
									  ConvertWeight_31.getWeightMessage()
									  );

		choice = JOptionPane.showInputDialog("continue? (y/n): ");	//ask for continue or no
 	} //end of while

 	JOptionPane.showMessageDialog(null, "Thank you for using weight conversion application.");
  } //end of main()
} //end of TestJOptionPaneApp