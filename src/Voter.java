
public class Voter {
	
	void ValidateMinor(int EnteredAge) throws MinorAgeException{
		
		if(EnteredAge < 18) {
			throw new MinorAgeException("You are minor..."
					+ "You are not eligible to cast your vote");
		}
		else if(EnteredAge>100) {
			System.out.println("You are DEAD");
		}
		
		else {
			System.out.println("You can cast your vote");
		}
	}

}
