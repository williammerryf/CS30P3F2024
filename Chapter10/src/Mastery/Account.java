package Mastery;

import java.text.NumberFormat;

public class Account 
{

	private double balance;
	private String accID;
	private Customer cust;
	
	/**
	 * constructor
	 * pre: none
	 * post: An account has been created. Balance and 
	 * customer data has been initialized with parameters.
	 */
	
	public Account(String fN, String lN, double bal)
	{
		
		balance = bal;
		cust = new Customer(fN, lN);
		accID = fN.substring(0,1) + lN;
		
	}
	
	/**
	 * constructor
	 * pre: none
	 * post: An empty account has been created with the specified account ID.
	 */
	
	public Account(String iD)
	{
		
		balance = 0;
		cust = new Customer("", "");
		accID = iD;
	}
	
	/** 
	 * Returns the account ID.
	 * pre: none
	 * post: The account ID has been returned.
	 */
	
	public String getID() 
	{
		
		return(accID);
		
	}
	
	/** 
	 * Returns the current balance.
	 * pre: none
	 * post: The account balance has been returned.
	 */
	
	public double getBalance() 
	{
		
		return(balance);
		
	}
	
	/** 
	 * A deposit is made to the account.
	 * pre: none
	 * post: The balance has been increased by the amount of the deposit.
	 */
	
	public void deposit(double dep) 
	{
		
		balance += dep;

	}
	
	/** 
	 * A withdrawal is made from the account if there is enough money.
	 * pre: none
	 * post: The balance has been decreased by the amount withdrawn.
	 */
	
	public void withdrawal(double with) 
	{

		if (with*2 <= balance) {
	 		balance -= with;
		} else {
	 		return;
	 	}
	}
	
	/** 
	 * Returns a true when objects have matching account ids.
	 * pre: none
	 * post: true has been returned when the objects are equal,
	 * false returned otherwise.
	 */
	
	public boolean equals(Object acc) 
	{
		
		Account testAcc = (Account)acc;
		
		if(accID.equals(testAcc.accID)) 
		{
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
		
		accountString = accID + "\n";
		accountString += cust.toString();
		accountString += "current balance is " + money.format(balance);
		return(accountString);
	}
	
}
