package Ch6;
/**********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Extra Credit
Submission Date: 10:00 pm, Wed (12/07)
Brief Description:  Application to convert time entered in seconds, minutes 
	and hours using constructor, method overloading, static data and static methods
***********************************************************************************/ 

import javax.swing.JOptionPane; // import JoptionPane library

public class ConvertTimeToDaysApp {  // main class name 

	public static void main(String[] args) { // main method
	
		Character choice = 'y', MinuteChoice = 'y', SecondsChoice = 'y'; // string used to store choice
		int    Hours = 0, Minutes =0, Seconds = 0; // declaration for time variables		
		String 	str; // store user input
	
		while(choice == 'y' || choice == 'Y') { // repeat if user want to continue
	
			str = JOptionPane.showInputDialog("Welcome to ConverTimeToDaysApp \nEnter Hours: "); //accept hours
			Hours = Integer.parseInt(str); // set hours
	
		    str = JOptionPane.showInputDialog("Do you want to enter Minutes?(y/n)"); // if user want to enter minutes
			MinuteChoice=str.charAt(0); // set minutes
			if (MinuteChoice == 'y' || MinuteChoice == 'Y') //  if use want to enter minutes
				{
					str = JOptionPane.showInputDialog("Enter Minutes: "); //accept minutes
					Minutes = Integer.parseInt(str); // set minutes
				    str = JOptionPane.showInputDialog("Do you want to enter Seconds?(y/n)"); // if use want to enter seconds
				    SecondsChoice=str.charAt(0); // set seconds
					if (SecondsChoice == 'y' || SecondsChoice == 'Y')  // if user want to enter seconds
						{
							str = JOptionPane.showInputDialog("Enter Seconds: "); //accept seconds
							Seconds = Integer.parseInt(str); // set seconds
						}
				}
	
			ConvertTimeToDays ConvertTimeToDays = new ConvertTimeToDays(Hours, Minutes, Seconds);  //Create the object
			if (SecondsChoice == 'y' || SecondsChoice == 'Y') // if user entered seconds
				ConvertTimeToDays.ComputeDaysWeeks(Hours, Minutes, Seconds); // calculate days and weeks, METHOD OVERLOADING
			else if (MinuteChoice == 'y' || MinuteChoice == 'Y')  // if user entered minutes and hours
				ConvertTimeToDays.ComputeDaysWeeks(Hours, Minutes); // calculate days and weeks, METHOD OVERLOADING
			else
				ConvertTimeToDays.ComputeDaysWeeks(Hours); // calculate days and weeks if use entered hours only, METHOD OVERLOADING
				
			
			do	{
			    str = JOptionPane.showInputDialog("Contine?(y/n only)"); // repeat until user selects y or n
				choice=str.charAt(0);
				} while (choice != 'y' && choice != 'Y' && choice != 'n' && choice != 'N');
		 			
	 	} //End of while
	
		JOptionPane.showMessageDialog(null, "Good bye!");

	} //End of main()

} //End of ConvertTimeToDaysApp