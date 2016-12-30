/**********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Lab 3 (Ch8 #9)
Submission Date: 10:00 pm, Wed (10/26) 
Brief Description: superclass manager
***********************************************************************************/ 

public class Manager extends Employee {
   protected double salary;

   public Manager( String name, double salary) {
      super( name );  // call superclass constructor
      this.salary = salary;
   }

   public double earnings() { return salary; }	//override the method to return salary


   public String toString() {	//override the method to print the name
      return "Manager: " + getName();
   }
}

