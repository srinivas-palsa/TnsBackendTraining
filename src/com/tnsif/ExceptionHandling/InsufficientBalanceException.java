package com.tnsif.ExceptionHandling;

public class InsufficientBalanceException extends Exception {
	
	InsufficientBalanceException(String mesg){
		
		super(mesg);
	}
}
