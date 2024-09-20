package Mastery;

public class Account 
{

	private double balance;
	private String firstN, lastN, accID;
	
	public Account(String fN, String lN, double bal)
	{
		
		balance = bal;
		accID = fN.substring(0,1) + lN;
		firstN = fN;
		lastN = lN;
		
	}
	
	public Account(String iD)
	{
		
		balance = 0;
		firstN = "";
		lastN = "";
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
	
}
