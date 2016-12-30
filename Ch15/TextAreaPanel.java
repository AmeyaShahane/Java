package Ch15;
/**********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Extra Credit
Submission Date: 10:00 pm, Wed (12/07)
Brief Description: count words in text area
***********************************************************************************/ 

//Example:  Use of JTextArea, JScrollPane and event handling
//Copy the content of the text area to output window of the JOptionPane

import javax.swing.*;
import java.awt.event.*;

class TextAreaPanel extends JPanel implements ActionListener{
	private static final long serialVersionUID = 1L;
	final int vScroll = JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
	          hScroll = JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS;
	private JTextArea textArea;
	private JScrollPane scroll;
	private JButton submitButton;
	public int totalWords = 0;
	public TextAreaPanel() {						//TextAreaPanel
		textArea = new JTextArea("Type whatever you wish, will show total quantity of words entered here. ", 2, 20);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		add(textArea);
		scroll = new JScrollPane(textArea, vScroll, hScroll);
		add(scroll);
		submitButton = new JButton("Submit");
		add(submitButton);
		submitButton.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {	//Event handling
		Object source = e.getSource();				//Event source
			if (source == submitButton) {		    	//If event source is the button
				      JOptionPane.showMessageDialog(null, "Total quantity of words entered is: " + String.valueOf(textArea.getText().length()));  //Copy content
				   }
			      else								//Otherwise
			         System.exit(0);				//Stop the execution
	}
}