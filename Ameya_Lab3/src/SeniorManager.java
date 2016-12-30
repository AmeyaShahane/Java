/**********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Lab 3 (Ch8 #9)
Submission Date: 10:00 pm, Wed (10/26) 
Brief Description: superclass senior manager
***********************************************************************************/ 

public final class SeniorManager extends Manager {
   private double meritPay;

   public SeniorManager( String name, double salary, double meritPay) {
      super( name, salary );  // call superclass constructor
      this.meritPay = meritPay;
   }

   public double earnings() { return salary + meritPay; }	//override the method to return salary


   public String toString() {	//override the method to print the name
      return "Senior Manager: " + getName();
   }
}