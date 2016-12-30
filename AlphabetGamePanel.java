/*********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Project
Submission Date: 10:00 pm, Wed (12/07) 
Brief Description: 	Alphabet Game panel, creates all buttons and all alphabet letters
and then it defines actionlistener for each of them to listen to mouse and keyboard
*********************************************************************************/
package Ameya_Project; // package name


import Ameya_Project.AlphabetGameLetterPanel; // import letter panel

import javax.swing.*; // import java libraries
import java.awt.event.*;
import java.awt.*;
import java.net.*;
import java.io.*;
import java.applet.*;
import java.util.*;

class AlphabetGamePanel extends JPanel implements ActionListener { // main class
	private static final long serialVersionUID = 1L; // declare static final serial version uid
	long totalLetters; // count for total letters
	int  rightButton = 0, wrongButton = 0; // initialize count for right and wrong button pressed

	String player; // variable for player name
	public AlphabetGameLetterPanel gp;
	private JTextArea letterTextArea; // declare letter text area
	private JTextField rightButtonTextField, // declare button texts
					   wrongButtonTextField;
	private JLabel rightClickLabel, // declare labels for right, wrong counts
				   wrongClickLabel;

	private JButton aButton, bButton, cButton, dButton, eButton, fButton, gButton, hButton, iButton, jButton, kButton,
					lButton, mButton, nButton, oButton, pButton, qButton, rButton, sButton, tButton, uButton, vButton,
					wButton, xButton, yButton, zButton, 
					startButton, scoreButton, quitButton, stopGameButton; // declare all buttons

	private AudioClip audioClip;  // declare audio clips
			URL audioUrl;


	public AlphabetGamePanel(String player) { // main method
		this.player = player; // initialize player
		this.setLayout(new BorderLayout()); // set border layout
		JPanel buttonPanel = new JPanel(); // new panel
		buttonPanel.setBackground(Color.white); // set button panel color background
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER)); // set layout

		startButton = new JButton("Start",new ImageIcon("images/start.png")); // create start button
		startButton.addActionListener(this); // add action listener
		buttonPanel.add(startButton); // add button
		
		stopGameButton = new JButton("Stop", new ImageIcon("images/stop.gif")); // create stop button
		stopGameButton.addActionListener(this); // add action listener
		buttonPanel.add(stopGameButton); // add button

		quitButton = new JButton( "Exit",new ImageIcon("images/exit.gif")); // create exit button
		quitButton.addActionListener(this); // add action listener
		buttonPanel.add(quitButton); // add button
	
		JPanel scorePanel = new JPanel(); // create score panel
		scorePanel.setLayout(new FlowLayout(FlowLayout.CENTER)); // set layout
		buttonPanel.add(scorePanel); // add score panel

		rightClickLabel = new JLabel(new ImageIcon("images/right.jpg")); // define label for right count
		scorePanel.add(rightClickLabel); // add label
 
		rightButtonTextField = new JTextField(3); // create a text field
		rightButtonTextField.setEditable(false); // set editable and focus to false
		rightButtonTextField.setFocusable(false);
		scorePanel.add(rightButtonTextField); // add the text field

		wrongClickLabel = new JLabel(new ImageIcon("images/wrong.png")); // define label for wrong count
		scorePanel.add(wrongClickLabel); // add label

		wrongButtonTextField = new JTextField(3); // create a text field 
		wrongButtonTextField.setEditable(false); // set editable and focus to false
		wrongButtonTextField.setFocusable(false);
		scorePanel.add(wrongButtonTextField); // add the text field

		scoreButton = new JButton( "Top 5 Scores",new ImageIcon("images/top5.jpg")); // define button for Top 5 Scores
		scoreButton.addActionListener(this); // add action listener
		buttonPanel.add(scoreButton); // add Top 5 score button

		this.add(buttonPanel, BorderLayout.NORTH); // set position for button panel

		JPanel lettersPanel = new JPanel(); // create new panel for letters to be showed 
		lettersPanel.setBackground(Color.white); // set background color
		lettersPanel.setLayout(new BorderLayout()); // set layout
		
		JPanel firstPanel = new JPanel();  // define first panel
		firstPanel.setBackground(Color.white);
		JPanel secondPanel = new JPanel(); // define second panel
		secondPanel.setBackground(Color.white);
		JPanel thirdPanel = new JPanel();  // define third panel
		thirdPanel.setBackground(Color.white);

		// create all letter buttons
		aButton = new JButton(new ImageIcon("images/a.gif"));
		bButton = new JButton(new ImageIcon("images/b.gif"));
		cButton = new JButton(new ImageIcon("images/c.gif"));
		dButton = new JButton(new ImageIcon("images/d.gif"));
		eButton = new JButton(new ImageIcon("images/e.gif"));
		fButton = new JButton(new ImageIcon("images/f.gif"));
		gButton = new JButton(new ImageIcon("images/g.gif"));
		hButton = new JButton(new ImageIcon("images/h.gif"));
		iButton = new JButton(new ImageIcon("images/i.gif"));
		jButton = new JButton(new ImageIcon("images/j.gif"));
		kButton = new JButton(new ImageIcon("images/k.gif"));
		lButton = new JButton(new ImageIcon("images/l.gif"));
		mButton = new JButton(new ImageIcon("images/m.gif"));
		nButton = new JButton(new ImageIcon("images/n.gif"));
		oButton = new JButton(new ImageIcon("images/o.gif"));
		pButton = new JButton(new ImageIcon("images/p.gif"));
		qButton = new JButton(new ImageIcon("images/q.gif"));
		rButton = new JButton(new ImageIcon("images/r.gif"));
		sButton = new JButton(new ImageIcon("images/s.gif"));
		tButton = new JButton(new ImageIcon("images/t.gif"));
		uButton = new JButton(new ImageIcon("images/u.gif"));
		vButton = new JButton(new ImageIcon("images/v.gif"));
		wButton = new JButton(new ImageIcon("images/w.gif"));
		xButton = new JButton(new ImageIcon("images/x.gif"));
		yButton = new JButton(new ImageIcon("images/y.gif"));
		zButton = new JButton(new ImageIcon("images/z.gif"));

		firstPanel.add(qButton); // show the buttons as in QWERTY keyboard layout
		firstPanel.add(wButton);
		firstPanel.add(eButton);
		firstPanel.add(rButton);
		firstPanel.add(tButton);
		firstPanel.add(yButton);
		firstPanel.add(uButton);
		firstPanel.add(iButton);
		firstPanel.add(oButton);
		firstPanel.add(pButton);

		secondPanel.add(aButton); // show the buttons as in QWERTY keyboard layout
		secondPanel.add(sButton);
		secondPanel.add(dButton);
		secondPanel.add(fButton);
		secondPanel.add(gButton);
		secondPanel.add(hButton);
		secondPanel.add(jButton);
		secondPanel.add(kButton);
		secondPanel.add(lButton);

		thirdPanel.add(zButton); // show the buttons as in QWERTY keyboard layout
		thirdPanel.add(xButton);
		thirdPanel.add(cButton);
		thirdPanel.add(bButton);
		thirdPanel.add(nButton);
		thirdPanel.add(mButton);

		// add all letter panels 
		lettersPanel.add(firstPanel, BorderLayout.NORTH);
		lettersPanel.add(secondPanel, BorderLayout.CENTER);
		lettersPanel.add(thirdPanel, BorderLayout.SOUTH);


		// add letters panel
		this.add(lettersPanel, BorderLayout.SOUTH);

		aButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter(); 
						matchingLetter(rl, "A");	
						}
				}
			);
			bButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "B");
					}
				}
			);
			cButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "C");
					}
				}
			);
			dButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter(); 
						matchingLetter(rl, "D");	
					}
				}

			);
			eButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "E");
					}
				}
			);
			fButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "F");
					}
				}
			);
			gButton.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter(); 
						matchingLetter(rl, "G");	
					}
				}

			);
			hButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "H");
					}
				}
			);
			iButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "I");
					}
				}
			);
			jButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter(); 
						matchingLetter(rl, "J");	
					}
				}

			);
			kButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "K");
					}
				}
			);
			lButton.addActionListener(
							new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									String rl = gp.getLetter();
									matchingLetter(rl, "L");
								}
							}
			);
			mButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "M");
					}
				}
			);
			nButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter(); 
						matchingLetter(rl, "N");	
					}
				}
			);
			oButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "O");
					}
				}
			);
			pButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "P");
					}
				}
			);
			qButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter(); 
						matchingLetter(rl, "Q");	
					}
				}

			);
			rButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "R");
					}
				}
			);
			sButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "S");
					}
				}
			);
			tButton.addActionListener(
					new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter(); 
						matchingLetter(rl, "t");	
					}
				}

			);
			uButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "U");
					}
				}
			);
			vButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "V");
					}
				}
			);
			wButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter(); 
						matchingLetter(rl, "W");	
					}
				}
			);
			xButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "X");
					}
				}
			);
			yButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "Y");
					}
				}
			);
			zButton.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String rl = gp.getLetter();
						matchingLetter(rl, "Z");
					}
				}
			);



		// add keyboard Listeners for each button through keyStup function
			
		listnerForKey(aButton);
		listnerForKey(bButton);
		listnerForKey(cButton);
		listnerForKey(dButton);
		listnerForKey(eButton);
		listnerForKey(fButton);
		listnerForKey(gButton);
		listnerForKey(hButton);
		listnerForKey(iButton);
		listnerForKey(jButton);
		listnerForKey(kButton);
		listnerForKey(lButton);
		listnerForKey(mButton);
		listnerForKey(nButton);
		listnerForKey(oButton);
		listnerForKey(pButton);
		listnerForKey(qButton);
		listnerForKey(rButton);
		listnerForKey(sButton);
		listnerForKey(tButton);
		listnerForKey(uButton);
		listnerForKey(vButton);
		listnerForKey(wButton);
		listnerForKey(xButton);
		listnerForKey(yButton);
		listnerForKey(zButton);
		
		listnerForKey(startButton);
		// display dropping alphabets
		JPanel displayPanel = new JPanel();
		displayPanel.setBackground(Color.white);
		displayPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

		// letter text field on display panel
		letterTextArea = new JTextArea(350,50);
		letterTextArea.setBackground(Color.white);
		letterTextArea.setEnabled(false);
		displayPanel.add(letterTextArea);
		this.add(displayPanel, BorderLayout.CENTER);
	}
	
	public void matchingLetter(String droppingLetter, String buttonLetter) { // method to check matching letter
		if(droppingLetter.equalsIgnoreCase(buttonLetter)) { // check if dropping letter is same as keyed letter

			try { // play cheer audio if correct key is pressed
					   audioUrl=new URL("file:" + new File(".").getCanonicalPath()
					                                 + "//audios//cheer.wav");
			           audioClip=Applet.newAudioClip(audioUrl);
			           audioClip.play();
				}
			catch(Exception e)
				{
			            System.out.println(e.toString());
			    }

			JOptionPane.showMessageDialog(null, "Hurray! right key is pressed!"); // display message to indicate correct key
			rightButton += 1; // add count of right key pressed
			rightButtonTextField.setText(Integer.toString(rightButton)); // set count of right button
		}
		else { // else play error audio
			try {
					   audioUrl=new URL("file:" + new File(".").getCanonicalPath()
					                                 + "//audios//error.wav");
			           audioClip=Applet.newAudioClip(audioUrl);
			           audioClip.play();
			   	}
			catch(Exception e)
				{
			            System.out.println(e.toString());
			    }
			JOptionPane.showMessageDialog(null, "Oops, wrong letter key pressed!"); // display message to indicate wrong key
			wrongButton += 1; // add count of wrong key pressed
			wrongButtonTextField.setText(Integer.toString(wrongButton)); // set count of wrong button
		}
	}

	public void actionPerformed(ActionEvent e) { // action performed for the start, stop, exit and score buttons
		Object source = e.getSource(); // get source of button
		if (source == quitButton) { // if quit button
			JOptionPane.showMessageDialog(null, "Thank you, saving your score!");
			writeScore(rightButton, player); // write the score in a file
			System.exit(0); // exit
		}
		else if (source == stopGameButton) { // if stop button clicked
			AlphabetGameLetterPanel.stop(); // stop the letter panel
			AlphabetGameLetterPanel.nLetterDropped = 0; // reset letter dropped count
			JOptionPane.showMessageDialog(null, "Thank you " + player + " for playing Alphabet learning game. Your Score is "
					+ rightButton + " correct and " + wrongButton + " wrong out a total of "
					+ AlphabetGameLetterPanel.nLetterDropped + " letters"); // show message of statistics 
			writeScore(rightButton, player); // write the score
			rightButton = 0; // initialize counts
			wrongButton = 0;
			rightButtonTextField.setText(Integer.toString(rightButton));
			wrongButtonTextField.setText(Integer.toString(wrongButton));
		}

		else if (source == startButton) { // if start button clicked
			gp = new AlphabetGameLetterPanel(); // create new alphabet game letter panel
			JPanel displayPanel = gp;
			displayPanel.setLayout(new FlowLayout(FlowLayout.CENTER)); // set layout
			this.add(displayPanel, BorderLayout.CENTER); // add the panel 
			Font f = new Font("Courier", Font.BOLD, 60); // define the font
			letterTextArea.setFont(f); // set the font
		}

		else if (source == scoreButton) { // if score button clicked
			readScore(); // read top 5 scores and show them
		}
    } // end of method
	
	public void writeScore(int rightButton, String player) { // method to write the scores
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter( new File("TopScores.txt"),true)));
			String text = "Score="+rightButton+", Player="+player; // create string to write
			out.println(text); // write the string
			out.close(); // close the file
			}
		catch (IOException e) // catch exception
			{
			System.out.println(e);
			}
	} // end of method
	
	public void readScore() { // read the score
	try { // try block
		ArrayList<String> rows = new ArrayList<String>(); // define an array list for records
		BufferedReader reader = new BufferedReader(new FileReader( new File("TopScores.txt"))); // read the file
		String s;
	    while((s = reader.readLine())!=null) // read lines
	        rows.add(s); // add to the array list
	    Collections.sort(rows ,Collections.reverseOrder()); // sort the array list in reverse order to get top scores
	    
	    FileWriter writer = new FileWriter("TopScoresSorted.txt"); // write a new file that contains records sorted by score
	    for(String cur: rows)
	        writer.write(cur+"\n"); // write the record
	    reader.close(); // close the reader file
	    writer.close(); // close the writer file
	    	    
		BufferedReader reader1 = new BufferedReader(new FileReader( new File("TopScoresSorted.txt"))); // define reader file
		String text = "Top 5 Scores \n";
		for (int i=0; i < 5; i++) { // read top 5 records that are sorted by scores in reverse
				s= reader1.readLine();
				if (s!=null)
					text = text + s + "\n"; // add the records to the tgext
			}
		reader1.close(); // close the reader file
		JOptionPane.showMessageDialog(null, text); // display top 5 scores
	}
	catch (IOException e) // exception block
		{
		System.out.println(e);
		}
	} // end of method

	// assign the key listener to call the matching letter 
	public void listnerForKey(Component theCandidate){
		 theCandidate.addKeyListener( new KeyAdapter() {
		      public void keyPressed( KeyEvent ke ) {
		        if (ke.getKeyCode()==KeyEvent.VK_A){matchingLetter(gp.getLetter(), "A");}
		        else if (ke.getKeyCode()==KeyEvent.VK_B){matchingLetter(gp.getLetter(), "B");}
		        else if (ke.getKeyCode()==KeyEvent.VK_C){matchingLetter(gp.getLetter(), "C");}
		        else if (ke.getKeyCode()==KeyEvent.VK_D){matchingLetter(gp.getLetter(), "D");}
		        else if (ke.getKeyCode()==KeyEvent.VK_E){matchingLetter(gp.getLetter(), "E");}
		        else if (ke.getKeyCode()==KeyEvent.VK_F){matchingLetter(gp.getLetter(), "F");}
		        else if (ke.getKeyCode()==KeyEvent.VK_G){matchingLetter(gp.getLetter(), "G");}
		        else if (ke.getKeyCode()==KeyEvent.VK_H){matchingLetter(gp.getLetter(), "H");}
		        else if (ke.getKeyCode()==KeyEvent.VK_I){matchingLetter(gp.getLetter(), "I");}
		        else if (ke.getKeyCode()==KeyEvent.VK_J){matchingLetter(gp.getLetter(), "J");}
		        else if (ke.getKeyCode()==KeyEvent.VK_K){matchingLetter(gp.getLetter(), "K");}
		        else if (ke.getKeyCode()==KeyEvent.VK_L){matchingLetter(gp.getLetter(), "L");}
		        else if (ke.getKeyCode()==KeyEvent.VK_M){matchingLetter(gp.getLetter(), "M");}
		        else if (ke.getKeyCode()==KeyEvent.VK_N){matchingLetter(gp.getLetter(), "N");}
		        else if (ke.getKeyCode()==KeyEvent.VK_O){matchingLetter(gp.getLetter(), "O");}
		        else if (ke.getKeyCode()==KeyEvent.VK_P){matchingLetter(gp.getLetter(), "P");}
		        else if (ke.getKeyCode()==KeyEvent.VK_Q){matchingLetter(gp.getLetter(), "Q");}
		        else if (ke.getKeyCode()==KeyEvent.VK_R){matchingLetter(gp.getLetter(), "R");}
		        else if (ke.getKeyCode()==KeyEvent.VK_S){matchingLetter(gp.getLetter(), "S");}
		        else if (ke.getKeyCode()==KeyEvent.VK_T){matchingLetter(gp.getLetter(), "T");}
		        else if (ke.getKeyCode()==KeyEvent.VK_U){matchingLetter(gp.getLetter(), "U");}
		        else if (ke.getKeyCode()==KeyEvent.VK_V){matchingLetter(gp.getLetter(), "V");}
		        else if (ke.getKeyCode()==KeyEvent.VK_W){matchingLetter(gp.getLetter(), "W");}
		        else if (ke.getKeyCode()==KeyEvent.VK_X){matchingLetter(gp.getLetter(), "X");}
		        else if (ke.getKeyCode()==KeyEvent.VK_Y){matchingLetter(gp.getLetter(), "Y");}
		        else if (ke.getKeyCode()==KeyEvent.VK_Z){matchingLetter(gp.getLetter(), "Z");};
		      };
		    } );
	} // end of method
} // end of class
