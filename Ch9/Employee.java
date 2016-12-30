package Ch9;
/**********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Extra Credit
Submission Date: 10:00 pm, Wed (12/07)
Brief Description: Employee class that uses printable and employee type interfaces
***********************************************************************************/ 

import java.text.*;
import java.util.*;

public class Employee implements Printable, EmployeeType {
   private String name;
   private int employeeType;
   private double salary;

   // Constructor
   public Employee(String name, int employeeType, int salary ) {
      this.name = name;
      this.employeeType = employeeType;
      this.salary = salary;
   }

   public String getName()
      { return name; }

   public double salary(){return 0.0;}

   public void print() {		//implements print()
	   if (employeeType == 1)
		   System.out.print("Name: " + name + "\t" + "Employee Type: Faculty \t" + "Salary: " + salary + "\t");
	   else
		   System.out.print("Name: " + name + "\t" + "Employee Type: Classified \t" + "Salary: " + salary + "\t");	   
   	}
   
   public NumberFormat currencyFormat(Locale locale) {	//implements currencyFormat()
	   NumberFormat currency = NumberFormat.getCurrencyInstance(locale);
	   return currency;
   }
}
