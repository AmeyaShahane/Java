/**********************************************************************************
Name: Ameya Shahane 
Course: CS170-02
Lab #: Lab 3 (Ch9 #4)
Submission Date: 10:00 pm, Wed (10/26) 
Brief Description: class that implements interface BusinessTransaction 
***********************************************************************************/ 

public class BusinessAccount implements BusinessTransaction { //class name that implements interface
  private double amountPaid, amountReceived; // private variables

  public BusinessAccount(double amountPaid, double amountReceived ) { // constructor
	  this.amountPaid = amountPaid;
	  this.amountReceived = amountReceived;
  }
  
  //method with interface return type and argument type
  public BusinessTransaction businessTransaction(double amountPaid, double amountReceived){
	  this.setamountPaid(amountPaid); //set amount
	  this.setamountReceived(amountReceived); //set amount
	  return this;
  }

  public void withdraw(double amountPaid){ //withdraw method from the inteface
	  this.amountPaid =  amountPaid;
	  }

  public double getPayment() { // method from the interface
	  	return amountReceived - amountPaid; //return balance
	  }

  public void deposit(double amountReceived) { //method from the interface
	  	this.amountReceived = amountReceived;
	  }
  
  public void setamountPaid(double amountPaid) { // set amount paid
	  this.amountPaid = amountPaid;
  }
  public void setamountReceived(double amountReceived) { //set amound received
	  this.amountReceived = amountReceived;
  }
  public String toString() { //toString method 
	  String message = "Amount Received is " + amountReceived + "\n"
	  				  + "Amount Paid is  " + amountPaid + "\n"
	  				  + "Balance is " + (getPayment()) + "\n";
	  return message; //return message
  }
}