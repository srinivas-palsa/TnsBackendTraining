
public class Using2ndThreadClass extends Thread{
	
	void running(int num2) {
		
		for(int j=0; j<=5;j++) {
			
			System.out.println(num2*j);
		}
	}

}
