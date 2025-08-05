
public class TypesOfVariables {

	// Instance variable 
	String firstname;
	
	// static variable
	static String secondname = " Palsa";
	
	
	void display() {
		
		// Local variable 
		String college = "KPRIT";
		System.out.println(college);
	
	}
	
	public static void main(String args[]) {
	
	TypesOfVariables obj = new TypesOfVariables();
	
	System.out.print(obj.firstname="Srinivas");
	System.out.println(TypesOfVariables.secondname);
	obj.display();
}
}