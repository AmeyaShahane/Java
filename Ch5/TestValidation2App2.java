/**********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Extra Credit
Submission Date: 10:00 pm, Wed (12/07)
***********************************************************************************/ 

package Ch5;
import javax.swing.JOptionPane;

public class TestValidation2App2 {

	public static void main(String[] args) {
		Grade grade = new Grade();	

		int score = 0;

		String str, message;
		boolean notDone = true;
	    while (notDone) {
		  try {		//
			//ask for input score
			str = JOptionPane.showInputDialog("please enter an integer score: ");
			score = Integer.parseInt(str); //convert to int
		    notDone = false;
		    }
		  catch (NumberFormatException e ){
			JOptionPane.showMessageDialog(null, "Input error.  Enter an integer as student score.");
			continue;
		  }
	     }
		grade.setScore(score);			//call the method to set the score
		grade.assginGrade();			//call the method to assign the grade

		//build the output message
		message = "Your score is " + score + " and grade is " + grade.getGrade();

		//output the message
		JOptionPane.showMessageDialog(null, message);
	}	//end of main()
}		//end of GradeApp class
