package com.tnsif.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(2);
		pq.offer(23);
		pq.add(4);
		pq.offer(30);   /// "add" and "offer" works for same purpose of adding 
		
		
		Iterator it = pq.iterator();
		System.out.println("The data in queue (using iterator keyword) is:");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("The data in queue (using for-each loop) is: ");
		for(int i:pq) {
			System.out.println(i);  //// order is not guaranteed
		}
		
		System.out.println("\nThe data in queue (using poll - sorted order): ");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());  // prints in ascending order
        }
	}

}
