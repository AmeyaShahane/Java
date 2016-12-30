/********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Lab 4 (Ch14 #5)
Submission Date: 10:00 pm, Wed (11/23) 
Brief Description:  class to print even number in thread
*********************************************************************************/ 
public class PrintEvenNumber extends Thread { // class name extends thread
	  
	public  void run() { // main method
        
        for(int i=1; i <= 50; i++){     // create loop to run through 1 to 50    
 	        if( i % 2 == 0){ // identify if number if even
                System.out.print("Thread Name: " + this.getName() + " Even Number: " + i + "\n"); // display thread name and even number
	        	Thread.yield(); // yield for other thread
	        }
        } 
	} // end of method
} // end of class
