/**********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Lab 3 (Ch7 #11)
Submission Date: 10:00 pm, Wed (10/26) 
Brief Description: class extends superclass (subclass)
***********************************************************************************/ 

public class Triangle extends TriangleShape{
	protected double area1; 

	public Triangle() {
		super();			//call super class non-argument constructor
	}
	
	public Triangle(double base) {
		super(base);		//call super class one-argument constructor		
	}
	
	public void computeArea() {
		super.computeArea(); // computer area from the super class
		area1 = area; // set subclass area 
	}

	public double getArea() {
		return area1; // return area
	}
	
	public String toString() {	//override the toString() method
			 String message = "Triangle Area: " + area1 + "\n";
			 return message;
	 	  }
	 }

