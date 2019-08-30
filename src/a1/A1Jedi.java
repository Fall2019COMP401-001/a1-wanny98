package a1;

import java.util.Scanner;
import java.util.HashMap;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//Declare hashmap of items total quantity and items total customers
		HashMap<String, Integer> item_total = new HashMap<String, Integer>();
		HashMap<String, Integer> item_cust = new HashMap<String, Integer>();
		
		//Read input of number of items in store, int
		int item_count = scan.nextInt();
		
		//Declare array of item names
		String[] item_names = new String[item_count];
		
		//Loop through each item
		for(int i=0; i<item_count; i++) {
			//Read input of name of item, 1 word, str
			String item = scan.next();	
			//Add name to hashmap with value 0
			item_total.put(item, 0);
			item_cust.put(item, 0);
			//Add name to array
			item_names[i] = item;
			//Read input of price of item, dbl			
			scan.nextDouble();
		}
		
		//Read input of total number of customers, int
		int cust_count = scan.nextInt();
		//Declare variable at same time
		
		//Loop through each customer
		for(int j=0; j<cust_count; j++) {
			//Read input of names, str
			scan.next();
			scan.next();
			//Read input of number of items the customer bought, int
			int item_quan = scan.nextInt();
			//Loop through each item
			for(int k=0; k<item_quan; k++) {
				//Read input of quantity of item for the customer, int
				int quantity = scan.nextInt();
				//Read input of name of item bought, str
				String item_name = scan.next();
				//Add quantity to value and replace in hashmap
				item_total.replace(item_name, item_total.get(item_name)+quantity);
				//Add 1 to item_cust hashmap of key: item
				item_cust.replace(item_name, item_cust.get(item_name)+1);
		
			}
		}
		
		//Print to console
		for(int a=0; a<item_names.length; a++) {
			String key = item_names[a];
			if(item_cust.get(key) == 0) {
				System.out.println("No customers bought " + item_names[a]);
			} else {
				System.out.println(item_cust.get(key) + " customers bought " + 
				item_total.get(key) + " " + item_names[a]);
			}
		}
		
		//Close scan
		scan.close();
	}
}
