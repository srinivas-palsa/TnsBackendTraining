// Demo for multi threading 
public class UsingThreadClass extends Thread{
	
	void run(int num) {
		
		for(int i=0; i<=5; i++) {
		
		System.out.println(num*i);
		}
	}

}
