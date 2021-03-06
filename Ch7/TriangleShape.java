package Ch7;
/**********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Extra Credit
Submission Date: 10:00 pm, Wed (12/07)
Brief Description: superclass Triangleshape 
***********************************************************************************/ 
public class TriangleShape {
	protected double area, base;
	public TriangleShape() { //constructor
		area = 0.0;
		base = 0.0;
	}
	public TriangleShape(double base) { //set base length
			this.base = base;
		}
	public void setArea(double area) { //set Area
		this.area = area;
		}
	public double getArea() { //get area
			return area;
		}
	public void computeArea() { //compute area
			// Area of triangle = sqr(base) * (sqrt(3) / 4)
			area = (base * base) * (Math.sqrt(3) / 4);
	}
}
