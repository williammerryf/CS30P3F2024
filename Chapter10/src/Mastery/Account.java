package Mastery;

import java.text.NumberFormat;

public class Account 
{

	private double balance;
	private String accID;
	private Customer cust;
	
	public Account(String fN, String lN, double bal)
	{
		
		balance = bal;
		accID = fN.substring(0,1) + lN;
		cust = new Customer(fN, lN);
		
	}
	
	public Account(String iD)
	{
		
		balance = 0;
		cust = new Customer("","");
		accID = iD;
	}
	
	public String getID() 
	{
		
		return(accID);
		
	}
	
	public double getBalance() 
	{
		
		return(balance);
		
	}
	
	public void deposit(double dep) 
	{
		
		balance += dep;
		
	}
	
	public boolean withdrawal(double with) 
	{
		
		if (balance >= with) 
		{
			balance -= with;
			return(true);
			
		} else {
			
			return(false);
	
		}	
	}
	
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
	
	public String toString() {
		String accountString;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		accountString = accID + "\n";
		accountString += cust.toString();
		accountString += "current balance is " + money.format(balance);
		return(accountString);
	}
	
}
