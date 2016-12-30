/********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Lab 1 (Ch4 #17)
Submission Date: 10:00 pm, Wed (9/21) 
Brief Description:  The application code to run nested loop, create its object, 
	call the methods to assign and print the details. 
*********************************************************************************/ 
import javax.swing.JOptionPane;

public class NestedLoopApp {
public static void main(String[] args) {

	String  str;	   	    //declare str used to get input value
	
	Integer StartingNum, EndingNum;
	
	NestedLoop NestedLoop = new NestedLoop();  //create an object of ConvertWeight
		
		str = JOptionPane.showInputDialog("Welcome to nested loop application, that prints squares and cubes!\n\n"
				+ "Enter starting number: "); // input request
		StartingNum = Integer.parseInt(str);		//set weight

		str = JOptionPane.showInputDialog("Ending ending number: "); // input request
		EndingNum = Integer.parseInt(str);		//set weight

		System.out.print("Number\tSquare\tCube\n");
	
		for (int row = StartingNum; row <= EndingNum; row++ )
		{
			NestedLoop.computeSquareCube(row); // calculate weights in kg and lbs
			System.out.print(NestedLoop.getRowNumber()+"\t"+NestedLoop.getSquare()+"\t"+NestedLoop.getCube()+"\n");
		}
		
		System.out.println("Thank you for using the nested loop application!");


  } //end of main()
} //end of TestJOptionPaneApp