package Ch13;
/********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Extra Credit
Submission Date: 10:00 pm, Wed (12/07)
Brief Description:  Driver code for Transcript application
*********************************************************************************/ 
import java.io.*; //import java.io library
import javax.swing.JOptionPane; //import JOptionPane library

public class TranscriptApp { // class name
	public static void main(String[] args) throws IOException{ // main method
		String again = "y"; // user input to indicate continue use of application

		Transcript transcript = new Transcript(); // create instance of Transcript class 
		while(again.matches("[y|Y]")) { // repeat until y/Y
			String choice = transcript.makeChoice();  // store choice
			switch (Integer.parseInt(choice)) { // switch to repeat options

				case 1: transcript.addRecord(); // add a record
						break;
				case 2: transcript.searchRecord(); // search a record based on course title
						break;
				case 3: transcript.removeRecord(); // remove a record based on course title
						break;
				case 4: transcript.sortRecord(); // sort records
						break;
				case 5: transcript.printRecord(); // print record
						break;
				case 6: transcript.goodBye(); // say good bye
		 	}
		again = JOptionPane.showInputDialog(null, "Do you want to continue using the Transcript Application? (y/n): ");
	 	}
	 	transcript.goodBye(); // good bye
  	} // end of method
}  // end of class

