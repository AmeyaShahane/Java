package Ch7;
/**********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Extra Credit
Submission Date: 10:00 pm, Wed (12/07)
Brief Description: subclass class trivertebral inherites Triangle
***********************************************************************************/ 

public class Trivertebral extends Triangle{

	private double area1;

	public Trivertebral() {
		super();			//call super class non-argument constructor
	}
	public Trivertebral(double base) {
		super(base);		//call super class one-argument constructor
	}

	public void computeArea() {		//compute trivertebral's area
		super.computeArea();		//call super class' method
		area1 = 4 * area; // three side triangles + one base triangle
	}

	public double getArea() {
		return area1; // get area
	}

	public String toString() {	//override the toString() method
		 String message = "Tri-vertebral Area: " + area1 + "\n";
		 return message;
	  }
}
