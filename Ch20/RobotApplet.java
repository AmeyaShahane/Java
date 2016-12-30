package Ch20;
/**********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Extra Credit
Submission Date: 10:00 pm, Wed (12/07)
Brief Description: draw a robot
***********************************************************************************/ 

//package ch20;
//Demo: Test shapes in Graphics2D

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class RobotApplet extends JApplet {
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g) {
		Graphics2D gg = (Graphics2D) g;
		Shape e = new Ellipse2D.Double(30, 30, 150, 85);

		gg.setPaint(new GradientPaint(30, 30, Color.red, 80, 50, Color.yellow,
				true));
		gg.fill(e);
		gg.setPaint(Color.BLUE);
		gg.setStroke(new BasicStroke(6.0f));

		gg.draw(new Rectangle2D.Double(20, 20, 170, 105));
		gg.draw(new Line2D.Double(105, 120, 105, 150));
		gg.draw(new Rectangle2D.Double(60, 150, 90, 170));
		gg.draw(new Line2D.Double(150, 170, 180, 250));
		gg.draw(new Line2D.Double(60, 170, 20, 250));
		gg.draw(new Line2D.Double(80, 300, 80, 400));
		gg.draw(new Line2D.Double(120, 300, 120, 400));
	}
}
