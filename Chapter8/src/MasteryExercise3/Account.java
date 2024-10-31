package MasteryExercise3;

/**
 * Account class.
 */
 
import java.text.NumberFormat;

public abstract class Account {
	private double balance;
	private Customer cust;
	private String acctID;
	
		
	
	/**
	 * constructor
	 * pre: none
	 * post: An account has been created. Balance and 
	 * customer data has been initialized with parameters.
	 */
	public Account(double bal, String fName, String lName, String st, String c, String p, String pC)//include street, city, province or state, postal code or zip code - DONE
	 {
		balance = bal;
		cust = new Customer(fName, lName, st, c, p, pC);//this constructor should reflect the new additions above, street, city, province, postal code - DONE
		acctID = fName.substring(0,1) + lName;
	}
	

	/**
	 * constructor
	 * pre: none
	 * post: An empty account has been created with the specified account ID.
	 */
	public Account(String ID) {
		balance = 0;
		cust = new Customer("", "", "", "", "", "");
		acctID = ID;
	}


	/** 
	 * Returns the account ID.
	 * pre: none
	 * post: The account ID has been returned.
	 */
	public String getID() {
	 	return(acctID);
	}


	/** 
	 * Returns the current balance.
	 * pre: none
	 * post: The account balance has been returned.
	 */
	public double getBalance() {
	 	return(balance);
	}


	/** 
	 * A deposit is made to the account.
	 * pre: none
	 * post: The balance has been increased by the amount of the deposit.
	 */
	public void deposit(double amt) {
	 	balance += amt;
	}

	
	/** 
	 * A withdrawal is made from the account if there is enough money.
	 * pre: none
	 * post: The balance has been decreased by the amount withdrawn.
	 */
	public void withdrawal(double amt) {
	 	if (amt <= balance) {
	 		balance -= amt;
	 	} else {
	 		System.out.println("Not enough money in account.");
	 	}
	}



	//Create a changeAddress() method that calls the cust object from above in order to change - DONE
	//Street, city, province, postalCode - DONE
	
	public void changeAddress(String st, String c, String p, String pC)
	{
		cust.changeStreet(st);
		cust.changeCity(c);
		cust.changeProvince(p);
		cust.changePostalCode(pC);
	}
	
	/** 
	 * Returns a true when objects have matching account ids.
	 * pre: none
	 * post: true has been returned when the objects are equal,
	 * false returned otherwise.
	 */
	public boolean equals(Object acct) {
		Account testAcct = (Account)acct;
		if (acctID.equals(testAcct.acctID)) {
				return(true);
			} else {
				return(false);
			}
	}


	/** 
	 * Returns a String that represents the Account object.
	 * pre: none
	 * post: A string representing the Account object has 
	 * been returned.
	 */
	public String toString() {
		String accountString;
		NumberFormat money = NumberFormat.getCurrencyInstance();

		accountString = acctID + "\n";
		accountString += cust.toString();
		accountString += '\n' + "Current balance is " + money.format(balance);
	 	return(accountString);
	}
}

