package Ch10;
//Two dimension array test

public class BookPriceQtyApp {
   public static void main( String args[] )

   {
		double[][] prices = { {10.50, 11.25}, {8.50, 20.10} };  
		int[][] quantity = { {20, 30} , {50, 10} };
		double sum = 0.0;
		double average;

		for( int row = 0; row < prices.length; row++) {			//outer loop controls rows
			 for( int col = 0; col < prices[row].length; col++) {	//inner loop controls columns
				sum += prices[row][col];
			 }
			System.out.println("\n");
			}
			average =  sum / (prices.length * prices[0].length); 
			System.out.println("Total Price: " + sum);
			System.out.println("Total Books: " + (prices.length * prices[0].length));
			System.out.println("Average Price: " + average);

		for( int row = 0; row < quantity.length; row++) {			//outer loop controls rows
			 for( int col = 0; col < quantity[row].length; col++) {	//inner loop controls columns
				sum += quantity[row][col];
			 }
			System.out.println("\n");
			}
			average =  sum / (quantity.length * quantity[0].length); 
			System.out.println("Total Quantity: " + sum);
			System.out.println("Total Books: " + (prices.length * prices[0].length));
			System.out.println("Average Quantity: " + average);
			
		
   }
   
 }