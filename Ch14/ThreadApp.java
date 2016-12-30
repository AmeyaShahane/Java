package Ch14;
/********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Extra Credit
Submission Date: 10:00 pm, Wed (12/07)
Brief Description:  Driver code for Thread application
*********************************************************************************/ 
public class ThreadApp { // class name
	public static void main(String[] args) { // main method
		Thread thread1 = new PrintOddNumber(); // Initiate first thread
		Thread thread2 = new PrintEvenNumber(); // Initiate second thread
		thread1.setPriority(30);
		thread2.setPriority(90);
		thread1.start(); // start first thread
		thread2.start(); // start second thread
	} // end of method
}  // end of class

