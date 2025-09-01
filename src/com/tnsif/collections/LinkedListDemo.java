package com.tnsif.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.addFirst(1);
		ll.add(2);
		ll.add(3);
		ll.add(3);
		ll.addLast(4);
		
		System.out.println("Students ID: ");
		for(int i:ll) {
			System.out.println(i);
		}

		
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.addFirst("Srinivas");
		ll2.add("Upendra");  // LinkedList allows duplicates
		ll2.add("Vivek");
		ll2.add("Vivek");
		ll2.addLast("Srikanth");

		System.out.println("Name of the Students: ");
		
		for(String s:ll2) {
			System.out.println(s);
		}
		System.out.println("Topper student:"+ll.get(0) +ll2.get(0)); // Returning data using get method

		ll.clear();
		ll2.clear();
		
		

	}

}
