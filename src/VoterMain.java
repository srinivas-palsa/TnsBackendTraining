
public class VoterMain {
	public static void main(String args[]) {
	
	Voter object = new Voter();
	
	try {
		object.ValidateMinor(21);
	}
	catch(MinorAgeException e) {
		System.out.println(e);
	}
}
}