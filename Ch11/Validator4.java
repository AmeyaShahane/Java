package Ch11;
//Utility class for validation using exception handling

import java.util.*;

public class Validator4 {
	public static int validatePositiveInt(Scanner sc, String prompt, int num) {
		boolean isValid = false;
		int data = 0;

		while(!isValid) {
			try {
		 		System.out.print(prompt);
				if (!sc.hasNextInt() )
					throw new NumberFormatException();
				else {
					data = sc.nextInt();
					isValid = true;
				}
				if (num < 0)
					throw new InputMismatchException();
				else {
					num = sc.nextInt();
					isValid = true;
				}
			  }			
			catch (NumberFormatException e) {
					System.out.println(e);
					System.out.println("\nInput error: Data must be positive integer, please re-enter Data...");
					sc.nextLine();		//Clear buffer
				 }
			catch (InputMismatchException e) {
					System.out.println(e);
					System.out.println("\nInput error: Passed Num must be positive integer, please re-enter Num...");
					sc.nextLine();		//Clear buffer
			 }
			}
			return data;
		}
	
	public static double validatePositiveDouble(Scanner sc, String prompt, double num) {
		boolean isValid = false;
		double data = 0.0;

		while(!isValid) {
			try {
		 		System.out.print(prompt);
				if (!sc.hasNextDouble() )
					throw new NumberFormatException();
				else {
					data = sc.nextDouble();
					isValid = true;
				}
				if (num < 0.0)
					throw new InputMismatchException();
				else {
					num = sc.nextDouble();
					isValid = true;
				}
			  }			
			catch (NumberFormatException e) {
					System.out.println(e);
					System.out.println("\nInput error: Data must be positive Double, please re-enter Data...");
					sc.nextLine();		//Clear buffer
				 }
			catch (InputMismatchException e) {
					System.out.println(e);
					System.out.println("\nInput error: Passed Num must be positive Double, please re-enter Num...");
					sc.nextLine();		//Clear buffer
				 }
			}
			return data;
		}
	

	public static int validateInt(Scanner sc, String prompt) {
		boolean isValid = false;
		int data = 0;

		 while(!isValid) {
		  try {
	 		System.out.print(prompt);
			if (!sc.hasNextInt())
				throw new NumberFormatException();
			else {
				data = sc.nextInt();
				isValid = true;
			}
		  }		//try
		catch (NumberFormatException e) {
			System.out.println("\nInput error: Data must be a whole number...");
			sc.nextLine();
		 }
		}
		return data;
	 }

	public static int arraySize(Scanner sc, String prompt) {
			boolean done = false;
			int count = 0;
			int size = 0;
			while (!done) {
	          try {
	             System.out.print(prompt );
	             size = sc.nextInt();  					//May throw InputMismatchExceptionÒì³£
	             if (size < 0) 							//negative array size
		           throw new NegativeArraySizeException();

	          	 System.out.println();
				 done = true;
	       	   }
	          catch (InputMismatchException e) {			//Handle InputMismatchException
				System.out.println("You must enter an integer for array size....");
				count++;								//Increase count
				sc.nextLine();							//Clear buffer
				continue;
			  }
			  catch (NegativeArraySizeException e) {		//Handle NegativeArraySizeException
				System.out.println("You must enter an positive integer for array size....");
				count++;
				sc.nextLine();
				continue;
			  }
			  finally { 	//count >= 3
				if (count >= 3) {
					System.out.println("You¡¯ve entered 3 times wrong entries....");
					System.out.println("System default array size 100 has assigned to the element¡­");
					size = 100;
					break;
	 			}
			  }
		 	}
		   return size;
	 	}
}
