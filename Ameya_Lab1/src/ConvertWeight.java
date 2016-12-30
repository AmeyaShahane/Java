/********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Lab 1 (Ch 3 # 30)
Submission Date: 10:00 pm, Wed (9/21) 
Brief Description:  The driver code for ConvertWeightApp, convert the weights. 
*********************************************************************************/ 

public class ConvertWeight { // class name
		private double  Weight,  WeightLb = 0,	WeightKg = 0;	//declarations for weight values

		//following are setXx() and getXxx() for class variables

		public void setWeight(double InputWeight) // method to set weight based in user input
		{ 
			Weight = InputWeight; // set Weight
		}

		public double getWeightKg() // method to get weight in kgs
		{
			return WeightKg; // return kg weight
		}

		public double getWeightLb() // method to get weight in lbs
		{
			return WeightLb; // return lb weight
		}
			
		public void ConvertWeightCompute()   //method to compute
		{
			WeightKg = Weight / 2.2; // calculate kg weight
			WeightLb = Weight * 2.2; // calculate lb weight
		}		   				//method ConvertWeightCompute end
	}	//ConvertWeight class end
