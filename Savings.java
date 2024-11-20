package bankapplication;

public class Savings extends Account {
	
	//list properties specific to the savings account
	int safetyDepositBoxID,safetyDepositBoxKey;
	
		//Constructor to initialize savings account properties
	public Savings(String name,String SSN ,double deposit) {
		super(name,SSN,deposit);
		System.out.println("Savings Account");
		accountNumber=1+setAccountNumber();
		System.out.println("Account Number : "+accountNumber);
		
	}
		//list methods specific to savings account
	
	}

