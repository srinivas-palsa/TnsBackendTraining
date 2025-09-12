package com.tnsif.MultiThreading;
public class MainThread {

	public static void main(String args[]){
		
		UsingThreadClass obj = new UsingThreadClass();
		
		Thread t1 = new Thread() {
			public void run() {
				obj.multiplication(5);
				
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				obj.multiplication(3);
			}
		};
		t1.start();
		t2.start();
		
	}
}