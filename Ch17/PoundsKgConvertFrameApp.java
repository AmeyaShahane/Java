package Ch17;
/**********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Extra Credit
Submission Date: 10:00 pm, Wed (12/07)
Brief Description: Jslider app to conver weight
***********************************************************************************/ 

//package ch17;

//Use of JSliders to convert temperatures
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.*;

class PoundsKmConvertFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	JSlider kSlider, pSlider;
	Border loweredBorder, raisedBorder;
	JPanel pSliderPanel, kSliderPanel;
	double cWeight, fWeight;
	PoundsKmConvertFrame() {
		super("Weight Conversion");
		loweredBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
		raisedBorder = BorderFactory.createBevelBorder(BevelBorder.RAISED);

		pSliderPanel = new JPanel();
		pSliderPanel.setLayout(new BoxLayout(pSliderPanel, BoxLayout.Y_AXIS));

		pSlider= new JSlider (0, 100);
		pSlider.setMinorTickSpacing(1);
		pSlider.setMajorTickSpacing(5);
		pSlider.setPaintTicks(true);
		pSlider.setPaintLabels(true);
		pSlider.setBorder(BorderFactory.createTitledBorder(raisedBorder, "Kilogram: " + 10));
		ChangeListener  changeListener = new SliderChangeListener();
		pSlider.addChangeListener(changeListener);
		pSliderPanel.add (pSlider);
		add(pSliderPanel, BorderLayout.NORTH);

		kSliderPanel = new JPanel();
		kSliderPanel.setLayout(new BoxLayout(kSliderPanel, BoxLayout.Y_AXIS));
		kSlider= new JSlider (0, 100);
		kSlider.setMinorTickSpacing(1);
		kSlider.setMajorTickSpacing(5);
		kSlider.setPaintTicks(true);
		kSlider.setPaintLabels(true);
		kSlider.setBorder(BorderFactory.createTitledBorder(loweredBorder, "Pounds: " + 50));
		changeListener = new SliderChangeListener();
		kSlider.addChangeListener(changeListener);
		kSliderPanel.add (kSlider);
		add(kSliderPanel, BorderLayout.SOUTH);
	}
	class SliderChangeListener implements ChangeListener {
	  public void stateChanged(ChangeEvent e) {
	    Object source = e.getSource();
	     if (source == kSlider) {
			 if (!pSlider.getValueIsAdjusting()) {
	          cWeight = pToKConvert(kSlider.getValue());
	          pSlider.setValue((int)cWeight);
	          pSlider.setBorder(BorderFactory.createTitledBorder(raisedBorder, "Kilogram: " + cWeight));
	          kSlider.setBorder(BorderFactory.createTitledBorder(loweredBorder, "Pounds: " + kSlider.getValue()));
			}
		}
		else if (source == pSlider) {
			if (!kSlider.getValueIsAdjusting()) {
				fWeight = kToPConvert(pSlider.getValue());
				kSlider.setValue((int)fWeight);
				kSlider.setBorder(BorderFactory.createTitledBorder(loweredBorder, "Pounds: " + fWeight));
				pSlider.setBorder(BorderFactory.createTitledBorder(raisedBorder, "Kilogram: " + pSlider.getValue()));
		    }
		}
	  }
	}
	double kToPConvert(int cWeight) {
		return 2.2*cWeight;
	}
	double pToKConvert(int fWeight) {
		return 0.45*fWeight;
	}
}

public class PoundsKgConvertFrameApp {
  public static void main(String args[]) {
    JFrame f = new PoundsKmConvertFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize (600, 200);
	f.setVisible (true);
  }
}