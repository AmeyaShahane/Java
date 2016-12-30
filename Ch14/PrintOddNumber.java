package Ch14;
/********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Extra Credit
Submission Date: 10:00 pm, Wed (12/07)
Brief Description:  class to print odd number in thread
*********************************************************************************/ 
public class PrintOddNumber extends Thread { // class name extends thread
  
	public  void run() { // main method
        
        for(int i=1; i <= 50; i++){    // repeat for 1 to 50    
	        if( i % 2 != 0){ // identify if number is odd
	        	System.out.print("Thread Name: " + this.getName() + " Odd  Number: " + i + "\n");  // display thread name and odd number
	        	Thread.yield();
	        }
        }
	} // end of method
} // end of class