package Ch17;

/**********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Extra Credit
Submission Date: 10:00 pm, Wed (12/07)
Brief Description: jslider app to conver distance
***********************************************************************************/ 
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.*;

class MilesKmConvertFrame extends JFrame {
	private static final long serialVersionUID = 1L;
	JSlider kSlider, mSlider;
	Border loweredBorder, raisedBorder;
	JPanel mSliderPanel, kSliderPanel;
	double cDistance, fDistance;
	MilesKmConvertFrame() {
		super("Distance Conversion");
		loweredBorder = BorderFactory.createBevelBorder(BevelBorder.LOWERED);
		raisedBorder = BorderFactory.createBevelBorder(BevelBorder.RAISED);

		mSliderPanel = new JPanel();
		mSliderPanel.setLayout(new BoxLayout(mSliderPanel, BoxLayout.Y_AXIS));

		mSlider= new JSlider (0, 100);
		mSlider.setMinorTickSpacing(1);
		mSlider.setMajorTickSpacing(5);
		mSlider.setPaintTicks(true);
		mSlider.setPaintLabels(true);
		mSlider.setBorder(BorderFactory.createTitledBorder(raisedBorder, "Kilometer: " + 10));
		ChangeListener  changeListener = new SliderChangeListener();
		mSlider.addChangeListener(changeListener);
		mSliderPanel.add (mSlider);
		add(mSliderPanel, BorderLayout.NORTH);

		kSliderPanel = new JPanel();
		kSliderPanel.setLayout(new BoxLayout(kSliderPanel, BoxLayout.Y_AXIS));
		kSlider= new JSlider (0, 100);
		kSlider.setMinorTickSpacing(1);
		kSlider.setMajorTickSpacing(5);
		kSlider.setPaintTicks(true);
		kSlider.setPaintLabels(true);
		kSlider.setBorder(BorderFactory.createTitledBorder(loweredBorder, "Miles: " + 50));
		changeListener = new SliderChangeListener();
		kSlider.addChangeListener(changeListener);
		kSliderPanel.add (kSlider);
		add(kSliderPanel, BorderLayout.SOUTH);
	}
	class SliderChangeListener implements ChangeListener {
	  public void stateChanged(ChangeEvent e) {
	    Object source = e.getSource();
	     if (source == kSlider) {
			 if (!mSlider.getValueIsAdjusting()) {
	          cDistance = mToKConvert(kSlider.getValue());
	          mSlider.setValue((int)cDistance);
	          mSlider.setBorder(BorderFactory.createTitledBorder(raisedBorder, "Kilometer: " + cDistance));
	          kSlider.setBorder(BorderFactory.createTitledBorder(loweredBorder, "Miles: " + kSlider.getValue()));
			}
		}
		else if (source == mSlider) {
			if (!kSlider.getValueIsAdjusting()) {
				fDistance = kToMConvert(mSlider.getValue());
				kSlider.setValue((int)fDistance);
				kSlider.setBorder(BorderFactory.createTitledBorder(loweredBorder, "Miles: " + fDistance));
				mSlider.setBorder(BorderFactory.createTitledBorder(raisedBorder, "Kilometer: " + mSlider.getValue()));
		    }
		}
	  }
	}
	double kToMConvert(int cDistance) {
		return 0.62*cDistance;
	}
	double mToKConvert(int fDistance) {
		return 1.6*fDistance;
	}
}

public class MilesKmConvertFrameApp {
  public static void main(String args[]) {
    JFrame f = new MilesKmConvertFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize (600, 200);
	f.setVisible (true);
  }
}