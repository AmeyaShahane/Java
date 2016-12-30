/**********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Lab 3 (Ch8 #9)
Submission Date: 10:00 pm, Wed (10/26) 
Brief Description: driver for employee earnings, modified as per the requirement
***********************************************************************************/ 
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class PolymorphismApp {
   public static void main( String[] args )
   {
      Employee[] ref = new Employee[5];  // superclass reference increase array
      String output = "";

      Manager manager = new Manager( "Wang", 5800.00 );
      SeniorManager senior = new SeniorManager( "Smith", 6250.0, 1500.0);
      RegularWorker regular = new RegularWorker( "Lee", 2980.00, 270.0);
      SeniorWorker seniorworker1 = new SeniorWorker( "Ameya", 3980.00, 370.0); //add new senior worker 1
      SeniorWorker seniorworker2 = new SeniorWorker( "Anuj", 4980.00, 470.0); // add new senior worker 2
      

      DecimalFormat precision2 = new DecimalFormat( "0.00" );

      ref[0] = manager;  // Employee reference to a manager

      ref[1] = senior;  // Employee reference to a senior manager

      ref[2] = regular;  // Employee reference to a regular Worker

      ref[3] = seniorworker1;  // Employee reference to a senior Worker1

      ref[4] = seniorworker2;  // Employee reference to a senior Worker2

      for(int i = 0; i < 5; i++)  //polymorphically form output for different objects
        output += ref[i].toString() + " earned $" +
                precision2.format( ref[i].earnings() ) + "\n";

      JOptionPane.showMessageDialog( null, output,
         "Demonstrating Polymorphism",
         JOptionPane.INFORMATION_MESSAGE );
   }
}
