package com.tnsif.ExceptionHandling;

public class InvalidPinException extends Exception{
	
	InvalidPinException(String mesg){
		
		super(mesg);
	}

}
