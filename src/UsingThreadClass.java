// Demo for multi threading 
public class UsingThreadClass extends Thread{
	
	public synchronized void multiplication(int num) {
		
		for(int i=0; i<=5; i++) {
		
		System.out.println(num*i);
		}
	}

}
