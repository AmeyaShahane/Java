package Ch15;
/**********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Extra Credit
Submission Date: 10:00 pm, Wed (12/07)
Brief Description: count words in text area
***********************************************************************************/ 

import javax.swing.*;
import java.awt.*;

class TextAreaFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension d = tk.getScreenSize();
	public TextAreaFrame() {
		setTitle("TextArea Test");
		setSize(280, 200);							//Size of the frame
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		centerWindow(this);						//Center display
		JPanel panel = new TextAreaPanel();		//Call method
		this.add(panel);						//Add the panel
		}
	private void centerWindow(JFrame frame) {		//Method
		int centeredWidth = ((int)d.getWidth() - frame.getWidth())/2;
		int centeredHeight = ((int)d.getHeight() - frame.getHeight())/3;
		setLocation(centeredWidth, centeredHeight);
	}
}
