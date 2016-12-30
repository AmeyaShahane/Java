/********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Lab 4 (Ch14 #5)
Submission Date: 10:00 pm, Wed (11/23) 
Brief Description:  Driver code for Thread application
*********************************************************************************/ 
public class ThreadApp { // class name
	public static void main(String[] args) { // main method
		Thread thread1 = new PrintOddNumber(); // Initiate first thread
		Thread thread2 = new PrintEvenNumber(); // Initiate second thread
		thread1.start(); // start first thread
		thread2.start(); // start second thread
	} // end of method
}  // end of class

