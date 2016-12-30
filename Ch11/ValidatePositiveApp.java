package Ch11;
//Demo:  exception handling in array uses with specially designed validation class

import java.util.*;

public class ValidatePositiveApp {
  public static void main(String[] args) {

	  String choice = "y";
	  int testInt = 0;
	  double testDouble = 0.0;
	  int numInt = -2;
	  double numDouble = -2.2;

	  Scanner sc = new Scanner(System.in);

	  while (choice.equals("y")) {
		  	testInt = Validator4.validatePositiveInt(sc, "Please enter an integer: ", numInt);
		  	testDouble = Validator4.validatePositiveDouble(sc, "Please enter a double: ",  numDouble);
		  	System.out.print("Valid Integer entered is: "+testInt + ", Valid Double entered is: " + testDouble);
		  		  
		  	System.out.print("Continue? (y/n): ");
		   choice = sc.next();
		//count = 0;								//reset count
     }
  }
}