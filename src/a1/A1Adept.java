package a1;

import java.util.Scanner;
import java.util.Hashtable;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Read input of total number of items
		int item_count = scan.nextInt();
		
		//Declare final output elements
		double biggest_amount = 0;
		double smallest_amount = 0;
		
		//Declare map of size item_count for holding prices
		Hashtable<String, Double> items = new Hashtable<String, Double>();
		
		//Loop through each item
		for(int i=0; i<item_count; i++) {
			//Read input of item name, str, one work
			String item_name = scan.next();
			//Read input of item price, dbl
			double item_price = scan.nextDouble();
			//Map key:name, element:price
			items.put(item_name, item_price);
		}
		
		//Read input of total number of customers
		int cust_count = scan.nextInt();
		//Declare totals array of size cust_count
		double totals[] = new double[cust_count];
		//Declare two name arrays of size cust_count
		String fname[] = new String[cust_count];
		String lname[] = new String[cust_count];

		//Loop through each customer
		for(int j=0; j<cust_count; j++) {				
			//Declare total, dbl, placeholder for cust total 0
			double total = 0;
			//Read input of cust first and last name
			String f_name = scan.next();
			String l_name = scan.next();
			//Put names in respective arrays
			fname[j] = f_name;
			lname[j] = l_name;
			//Read input of items bought by customer
			int items_bought = scan.nextInt();
			//Inner loop through each item
			for(int k=0; k<items_bought; k++) {
				//Read input of quantity of item bought
				int item_quantity = scan.nextInt();
				//Read input of name of item
				String item = scan.next();
				//Get item price
				double price = items.get(item);
				//Calculate amount total for item
				double amount = item_quantity * price;
				total += amount;				
			}
			//Add complete total to totals array
			totals[j] = total;
		}
		
		//Determine average
		double average_amount = add(totals) / totals.length;
		
		scan.close();
		
		//Print to console results
		int big = bigIndex(totals);
		int small = smallIndex(totals);
		
		System.out.println("Biggest: " + fname[big] + " " + 
		lname[big] + " (" + String.format("%.2f", (double) totals[big]) + 
		")");

		System.out.println("Smallest: " + fname[small] + " " + 
		lname[small] + " (" + String.format("%.2f", (double) totals[small]) + 
		")");
		
		System.out.println("Average: " + String.format("%.2f", (double) average_amount));
	}
	
	//Adding array method
	public static double add(double[] a) {
		double sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
	
	public static int bigIndex(double[] b) {
		double biggest = b[0];
		int index = 0;
		for(int i=1; i<b.length; i++) {
			if(biggest<b[i]) {
				biggest = b[i];
				index = i;
			}
		}		
		return index;
	}
	
	public static int smallIndex(double[] s) {
		double smallest = s[0];
		int index = 0;
		for(int i=1; i<s.length; i++) {
			if(smallest>s[i]) {
				smallest = s[i];
				index = i;
			}
		}		
		return index;
	}
}
