/********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Lab 1 (Ch3 #31)
Submission Date: 10:00 pm, Wed (9/21) 
Brief Description:  The driver code for ConvertWeightApp, convert the weights. 
*********************************************************************************/ 

public class ConvertWeight_31 { // class name
		private double  Weight,  WeightLb = 0,	WeightKg = 0;	//declarations for weight values
		private String WeightType;
		private String WeightMessage;
	
		//following are setXx() and getXxx() for class variables

		public void setWeight(double InputWeight) // method to set weight based in user input
		{ 
			Weight = InputWeight; // set Weight
		}

		public void setWeightType(String InputWeightType)
		{
			WeightType = InputWeightType; //set WeightType
		}
		
		public String getWeightMessage() // method to get weight in kgs
		{
			return WeightMessage; // return kg weight
		}
			
		public void ConvertWeightCompute()   //method to compute
		{
			WeightKg = Weight * 2.2;
			WeightLb = Weight / 2.2;
			
			if (WeightType.charAt(0) == 'K' || WeightType.charAt(0) == 'k') // if input weight is Kg, display pounds
					WeightMessage = Weight + " Kilograms is " + WeightLb + " Pounds";
			else if (WeightType.charAt(0) == 'P' || WeightType.charAt(0) == 'p')  // if input weight is lb, display kilograms
					WeightMessage = Weight + " Pounds is " + WeightKg + " Kilograms";
			else
					WeightMessage = "Invalid Weight Type " + WeightType; // display invalid input type
			
		}		   				//method ConvertWeightCompute end
	}	//ConvertWeight class end
