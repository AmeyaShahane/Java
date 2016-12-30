package Ch7;
/**********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Extra Credit
Submission Date: 10:00 pm, Wed (12/07)
Brief Description: Driver code for Triangleshapes
***********************************************************************************/ 
import javax.swing.JOptionPane; // import JoptionPane library

public class TriangleShapeApp{ // class name

	public static void main(String[] args) { //main method

		double baselength = 0.0;		// initialize base length
		String str = JOptionPane.showInputDialog("Welcome to TriangleShapeApp \nEnter Base length of the triangle: "); //accept base length
		baselength = Double.parseDouble(str); // set base length
		
		Triangle triangle = new Triangle(baselength); // instance for triangle class
		triangle.computeArea(); //compute area
		
		Trivertebral trivertebral = new Trivertebral(baselength); //instance for trivertebral
		trivertebral.computeArea(); // compute area

		// show result
		JOptionPane.showMessageDialog(null, "Base length: " + baselength + "\n\n" + 
											(triangle) + "\n" +
											(trivertebral)); // show result

 	}

}