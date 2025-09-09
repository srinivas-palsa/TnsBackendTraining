package com.tnsif.ExceptionHandling;

/*
// Using single catch block

public class ExceptionHandling {

	public static void main(String[] args) {
		
		
		try {
			
			int x = 19/0;
			System.out.println("The result is:"+x);
		}
		
		catch(ArithmeticException e) {
			
			System.err.println("You cannot divide a number by Zero"
					+ "Please change the value");
			
		}
		

	}

}

*/


/*
// Using multiple catch blocks

public class ExceptionHandling{
	
	public static void main(String args[]) {
		
		try {
			
			int x = 7/5;
			System.out.println("The result is: "+x);
			
			int arr[]= new int[5];
			arr[6] = 12;
			System.out.println("The resultant array is: "+arr[4]);
			
		}
		
		catch(ArithmeticException ae) {
			
			System.err.println("You cannot divide a number by Zero..."
					+ "Please change the value");
		}
		
		catch(ArrayIndexOutOfBoundsException ex) {
			
			System.err.println("The defined index is not valid"
					+ "Please enter a valid index");
			
		}
		
		
}
}

*/



/*
//One catch to rule them all
public class ExceptionHandling{
	
	public static void main(String args[]) {
		
		try {
			
			int x = 7/5;
			System.out.println("The result is: "+x);
			
			int arr[]= new int[5];
			arr[6] = 12;
			System.out.println("The resultant array is: "+arr[4]);
			
		}
		
		catch(ArithmeticException|ArrayIndexOutOfBoundsException ae) {
			
			System.err.println(ae);
		}
		
		
}
}

*/



