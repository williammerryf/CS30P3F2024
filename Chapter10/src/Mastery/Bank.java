package Mastery;

import java.util.ArrayList;

public class Bank 
{

	private ArrayList accs;
	
	public Bank() 
	{
		
		accs = new ArrayList();
		
	}

	public String addAcc(String fN, String lN, double bal) 
	{
		
		Account newAcc = new Account(fN, lN, bal);
		accs.add(newAcc);
		
		return("New Account created. The ID is " + newAcc.getID() + "\n" + " with a starting balance of $" + bal);
		
	}
	
	public String rmvAcc(String iD) 
	{
		
		int accIndex;
		Account match;
		
		match = new Account(iD);
		
		accIndex = accs.indexOf(match);
		if (accIndex > -1) 
		{
			
			accs.remove(accIndex);
			
			return("Account removed");
			
		} else {
			
			return("Account does not exist");
		}
			
	}
	
	public String Transaction(int transCode, String iD, double amt) {
		
		int accIndex;
		Account match, acc;
				
		match = new Account(iD);
		accIndex = accs.indexOf(match);
		if (accIndex > -1) {
			
			acc = (Account)accs.get(accIndex);
			
			if (transCode == 1) {
				acc.deposit(amt);
				accs.set(accIndex, acc);
				return(acc.toString());
			} else if (transCode == 2) {
				acc.withdrawal(amt);
				accs.set(accIndex, acc);
				return(acc.toString());
			}
		
		} else {
			
			return("Account does not exist");
	
		}
		
		return("");
	}
	
	
	public String accessAcc(String iD)
	{
		int accIndex;
		Account acc, match;
		match = new Account(iD);
		
		accIndex = accs.indexOf(match);
		if (accIndex > -1)
		{
			
			acc = (Account)accs.get(accIndex);
			return(acc.toString());
			
		} else {
			
			return("Account does not exist");
			
		}
	}
	
}
