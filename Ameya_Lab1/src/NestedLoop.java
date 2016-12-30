/********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Lab 1 (Ch4 #17)
Submission Date: 10:00 pm, Wed (9/21) 
Brief Description:  The driver code for NestedLoopApp, calculates squares and cubes. 
*********************************************************************************/ 

public class NestedLoop { // class name
		private int  rownumber, sqr, cube;	//declarations for weight values
	
		//following are setXx() and getXxx() for class variables

		public int getRowNumber() // method to get current row number
		{
			return rownumber; // return rownumber
		}

		public int getSquare() // method to get square
		{
			return sqr; // return square
		}
			
		public int getCube() // method to get cube
		{
			return cube; // return cube
		}

		public void computeSquareCube(int row)   //method to compute
		{
			rownumber = row; // calculate current number
			sqr = row * row; // calculate square
			cube = row * row * row; // calculate cub
		}		   				//method ConvertWeightCompute end
	}	//ConvertWeight class end
