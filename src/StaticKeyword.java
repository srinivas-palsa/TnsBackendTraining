// Demonstration of static variable using the example of student details

public class StaticKeyword {
	
	int rollno;
	String studentname;
	String branch;
	static String collegename = "KPRIT";
	
	
	void print() {
		System.out.println("The Details of student are : "
				+ rollno + " "
				+ studentname + " "
				+ branch+" "
				+collegename);
	}

	public static void main(String args[]) {
		StaticKeyword obj = new StaticKeyword();
		
		obj.rollno = 101;
		obj.studentname = "Srinivas";
		obj.branch = "CSE";
		obj.print();
		
		obj.rollno = 102;
		obj.studentname = "Srinu";
		obj.branch = "AIML";
		obj.print();
		
		obj.rollno = 103;
		obj.studentname = "Seenu";
		obj.branch = "DS";
		obj.print();
	}
}
