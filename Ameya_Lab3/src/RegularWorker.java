
/**********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Lab 3 (Ch8 #9)
Submission Date: 10:00 pm, Wed (10/26) 
Brief Description: superclass regular worker
***********************************************************************************/ 

public class RegularWorker extends Employee {
   protected double salary, overtimePay;

   public RegularWorker( String name, double salary, double overtimePay) {
      super( name );  // call superclass constructor
      this.salary = salary;
      this.overtimePay = overtimePay;
   }

   public double earnings() { return salary + overtimePay; }	//override the method to return salary


   public String toString() {	//override the method to print the name
      return "Regular worker: " + getName();
   }
}


