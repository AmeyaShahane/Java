/**********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Lab 3 (Ch9 #4)
Submission Date: 10:00 pm, Wed (10/26) 
Brief Description: Driver to test interface as return type and argument
***********************************************************************************/ 
public class BusinessAccountApp {
	public static void main(String args[]) {

		  BusinessAccount  BusinessAccount1 = new BusinessAccount(1000.00, 5000.00);
		  System.out.println(BusinessAccount1);

		  BusinessAccount  BusinessAccount2 = new BusinessAccount(100.00, 250.00);
		  System.out.println(BusinessAccount2);

	}
}