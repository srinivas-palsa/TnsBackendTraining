package com.tnsif.ExceptionHandling;

// Demo for exception handling without using exception
public interface WithoutException {
	
	public static void main(String[] args) {
		
		int x = 9/0; // Any number can not be divisible by Zero	
		
		System.out.println("The result is :"+x);
	}

}
