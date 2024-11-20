package bankapplication;

public class Checking extends Account{
	
	//list properties specific to the checking accc
	int debitCardNumber, debitCardPin;
	//Constructor to initialize checking account properties
	
	public Checking(String name,String SSN ,double deposit) {
		super(name,SSN,deposit);
		System.out.println("Checking Account");
		accountNumber=2+setAccountNumber();
		System.out.println("Account Number : "+accountNumber);
	}
	
	//list methods specific to checking account
	
	
}
