package bankapplication;

public abstract class Account implements IBaseRate{

	//list common properties for Saving and Checking account
	String Name,SSN;
	double deposit;
	
	
	String accountNumber;
	int rate;
	static int  index=10000;
	
	//Constructor to set base properties and initialize the account
	public Account(String name,String SSN ,double deposit) {
		System.out.println("Name: "+name);
		
		
		this.Name=name;
		this.SSN=SSN;
		this.deposit=deposit;
		
		index++;
		
		this.accountNumber=setAccountNumber();
		//System.out.println(accountNumber);
	}
	
	protected String setAccountNumber() {
		String lastTwoSsn= SSN.substring(SSN.length()-2, SSN.length());
		int uniqueID= index;
		int random= (int)(Math.random()*Math.pow(10,3));
		//System.out.println("random  "+random);
		return lastTwoSsn+index+random;
	//Set common methods for both the functions
	}
}
