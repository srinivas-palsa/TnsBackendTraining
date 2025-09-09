package com.tnsif.ExceptionHandling;

public class AtmMain {
	
	public static void main(String args[]) {
		
		ATM obj = new ATM();
		
		try {
			obj.validatepin(6969);
		} catch (InvalidPinException e) {
			e.printStackTrace();
		}
		
		try {
			obj.validatebalance(600);
		}
		catch(InsufficientBalanceException e) {
			System.out.println(e);
		}
	}
}
