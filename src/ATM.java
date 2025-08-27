
public class ATM {
	
	double AccountBalance = 5000;
	private final int SavedPin = 6969;
	
	void validatepin(int EnteredPin) throws InvalidPinException{
		
		if(SavedPin != EnteredPin) {
			throw new InvalidPinException("The pin you entered is incorrect..."
					+ "Please enter correct pin");
		}
		else {
			System.out.println("The pin you entered is correct"
					+ "Proceed");
		}
	}
	
	void validatebalance(double WithdrawalAmount) throws InsufficientBalanceException{
		
		if(AccountBalance < WithdrawalAmount ) {
			throw new InsufficientBalanceException("Withdrawal amount is greater than Account Balance"
					+ " Insufficient Balance");
		}
		else {
			double x = AccountBalance-WithdrawalAmount;
			System.out.println(x+"is your remaining balance");
		}
	}
	

}

