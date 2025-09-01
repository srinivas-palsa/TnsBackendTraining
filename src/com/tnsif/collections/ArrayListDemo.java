package com.tnsif.collections;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String args[]) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();   /// Using generic keywords
		
		al.add(2);
		al.add(2);  // ArrayList allows duplicates
		al.add(3);
		al.add(15);
		al.add(22);
		al.add(5,18);  // Adding value at 5th index 
		
		System.out.println("Elements in the ArrayList: "+ al); // Returns as the list 
		
		System.out.println("The data in ArrayList: ");
		for(int i:al) {
			
			System.out.println(i);
		}
		System.out.println("The data in ArrayList:"+ al.get(4));  // Printing specific index value
		
		al.clear();  // We cannot use ArrayList values after clearing 
	
	}
}
