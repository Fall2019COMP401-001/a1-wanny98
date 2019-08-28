package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		// Set up scanner object to read space-separated values
		// from console input
		Scanner scan = new Scanner(System.in);

		
		// Read in number of customers to proceed
		int cust_count = scan.nextInt();
		
		// Create string arrays for names
		String[] names = new String[cust_count*2];
		
		// Create while loop until all customer info is inputed
		int i = 0;
		int j = 0;
		int k = 0;
		double totals = 0;
		while (i<cust_count) {
			String fname = scan.next();
			System.out.print(fname.charAt(0) + ". ");

			String lname = scan.next();
			System.out.print(lname + ": ");

			int item_count = scan.nextInt();
			while (k<item_count) {
				int quantity = scan.nextInt();
				scan.next();
				double price = scan.nextDouble();
				
				double total = quantity * price;
				totals += total;
				
				k++;
			}
			System.out.print(String.format("%.2f", ((double) totals)));
			
			i++;
		}
				
		// Close scan
		scan.close();
		
	}
}
