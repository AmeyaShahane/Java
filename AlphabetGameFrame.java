/*********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Project
Submission Date: 10:00 pm, Wed (12/07) 
Brief Description: 	Alphabet Game frame class, its used by the Alphabet Game Panel. 
This frame displays welcome message and plays a welcome audio file, it creates instance for
AlphabetGamePanel
*********************************************************************************/ 

package Ameya_Project; // package name
import javax.swing.*; // import java libraries
import java.applet.*;
import java.net.*;
import java.io.*;

class AlphabetGameFrame extends JFrame { // class name extends JFrame
	
	private static final long serialVersionUID = 1L; // static serial version UID

	public AlphabetGameFrame() { // main method
		String Name = ""; // initiate player name
		AudioClip gameStartAudio; // initiate audio clip
		URL gameStartAudioURL; // define url variable
		Name = JOptionPane.showInputDialog(null,"Welcome to the Alphabet Learning Game, please enter your name: "); // display welcome message
		setSize(1000,1000); // set size
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // define exit operation
		JPanel panel = new AlphabetGamePanel(Name); // create Alphabet Game Panel for the player
		try { // try block
				gameStartAudioURL=new URL("file:" + new File(".").getCanonicalPath() + "//audios//GameStart.mid"); // define audio url
				gameStartAudio=Applet.newAudioClip(gameStartAudioURL);
				gameStartAudio.play(); // play music
	    	} 
		catch(Exception e) // exception block
			{
            	System.out.println(e.toString());
			}
		this.add(panel); // add the panel
		setLocation(0,0); // set location
  } // end of method
} // end of class