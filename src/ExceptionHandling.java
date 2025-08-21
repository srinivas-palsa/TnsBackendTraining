
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
