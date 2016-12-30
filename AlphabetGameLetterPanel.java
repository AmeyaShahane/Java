/*********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Project
Submission Date: 10:00 pm, Wed (12/07) 
Brief Description: 	Alphabet Game letter panel, it uses threads and overwrites the 
run method to display letters panel, the letter position, color and alphabet is 
selected as random. This class is used by AlphabetGamePanel class
*********************************************************************************/

package Ameya_Project; // package name

import java.awt.*; // import java libraries
import javax.swing.*;

class AlphabetGameLetterPanel extends JPanel implements Runnable { // main class implements runnable
	private static final long serialVersionUID = 1L;  // set static serial version uid
	public static Thread letterThread = null; // declare thread
    private int y = 10; // initiate variable for positioning 
    static long nLetterDropped = 1; // variable to check number of letters dropped
	int ranNum = ranNum(); // random number
	String letter = ranNumLetter(); // random letter
	Color letterColor= ranNumColor(); // random color

	AlphabetGameLetterPanel()  { // main method to start the thread
        if (letterThread == null) { // if thread is not started
		letterThread = new Thread(this); // declare thread
		letterThread.start(); // start the thread
			} // end of if 
  	} // end of method

    public void run() {  // this method creates the thread and uses sleep to set speed of the dropped alphabet
      	Thread myThread = Thread.currentThread(); // declare thread
        while (letterThread == myThread) { // while loop
          try{
              Thread.sleep(10); // sleep 
              repaint(); // repaint
           }
           catch (InterruptedException e){}
	        } // end of while
	     } // end of method

     public void paint(Graphics g) { // this method draws the letter using random position, color and alphabet
        g.setFont(new Font("Courier", Font.BOLD+Font.ITALIC, 48)); // set alphabet font
        g.setColor(Color.white); // set alphabet color
        g.drawString(letter, ranNum, y); // draw the alphabet
        y += 3; // for speed
        Dimension d = getSize(); // get the size
        if (y > (d.width - 10)) 
           {y = 10;
           AlphabetGameLetterPanel.nLetterDropped +=1; // add counter for dropped letter
           ranNum = ranNum(); // select new random number
           this.letter = ranNumLetter(); // select new random alphabet
	   	   this.letterColor = ranNumColor(); // select new random color
           } // end of if

       	g.setFont(new Font("Courier", Font.BOLD+Font.ITALIC, 48)); // set alphabet font 
        g.setColor(letterColor); // set alphabet color
        g.drawString(letter, ranNum, y); // draw the alphabet
     	} // end of method

     public static void stop() { // method to stop the thread
        letterThread = null; // set thread to null
		} // end of method

     public String getLetter() { // method get a random letter
		return this.letter; // return a random letter
     	} // end of method
	
	public int ranNum() { // method to generate random number
		int ranNumber = 40 + (int)(Math.random() * 640); // generate random number
		return ranNumber; // return the random number
		} // end of method
	
	public String ranNumLetter() { // method to generate random letter
		int ranNumLetter = 0 + (int)(Math.random() * 26); // generate random number
		String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXZY"; // declare all alphabets in string
		String letter = alphabet.substring(ranNumLetter, ranNumLetter+1); // select a random alphabet from the string
		return letter; // return the alphabet
		} // end of method
	
	public Color ranNumColor() { // method to generate random color, as a combination of RGB
		int ranColorRed = 0 + (int)(Math.random() * 256); // generate random red
		int ranColorBlue = 0 + (int)(Math.random() * 256); // generate random blue
		int ranColorGreen = 0 + (int)(Math.random() * 256); // generate random green
    	Color  c = new Color(ranColorRed, ranColorBlue, ranColorGreen); // generate random color
    	return c; // return the color
    	} // end of method
  } //end of class
