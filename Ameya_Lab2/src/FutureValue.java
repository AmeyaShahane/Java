/********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Lab 2 (Ch5 #24 and #25)
Submission Date: 10:00 pm, Wed (10/05) 
Brief Description:  class to calculate future value of investment 
*********************************************************************************/ 

public class FutureValue { // class name
		private String name;			// declare instance variables
		private int years;				// declare years of investment
		private double  monthlyInvest,  // declare monthly investment, yearly rate and future value
			 	yearlyRate,
			 	futureValue;

		//following are setXx() and getXxx() for class variables
		
		public void setName(String userName) { // set name
					name = userName;
				}
		
		public String getName() { // get name
					return name;
				}

		public void setMonthlyInvest(double monthlyInvestment) { // set monthly investment
					monthlyInvest = monthlyInvestment;
				}
		public double getMonthlyInvest() { // get monthly investment
					return monthlyInvest;
				}
		public void setYearlyRate(double yearlyReturnRate) { // set yearly rate
					yearlyRate = yearlyReturnRate;
				}
		public double getYealyRate() { // get yearly rate
					return yearlyRate;
				}
		public void setYears(int investYears){ // set investment years
					years = investYears;
				}
		public int getYears() { // get investment years
					return years;
				}
		public double getFutureValue() { // get future value of investment
					return futureValue;
				}
		public void futureValueCompute() {  //Method to compute the future value
					double monthlyReturnRate = yearlyRate/12/100;
					int months = years * 12;
					int i = 1;
					do  {
						futureValue = (futureValue + monthlyInvest) *
									  (1 + monthlyReturnRate);
						i++;
			 		}	while (i <= months);		//End of do-while
		}		   				//End of the method
	}	//End of FutureValue class
