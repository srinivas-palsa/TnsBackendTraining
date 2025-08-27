
public class MainThread {

	public static void main(String args[]){
		
		UsingThreadClass obj = new UsingThreadClass();
		
		Using2ndThreadClass obj2 = new Using2ndThreadClass();
		
		obj.start();
		obj2.start();
		obj.run(5);
		obj2.running(3);
		
	}
}
