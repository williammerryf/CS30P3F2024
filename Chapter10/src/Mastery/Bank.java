package Mastery;

import java.util.ArrayList;

public class Bank 
{

	private ArrayList accs;
	
	public Bank() 
	{
		
		accs = new ArrayList();
		
	}

	public void addAcc(String fN, String lN, double bal) 
	{
		
		Account newAcc = new Account(fN, lN, bal);
		accs.add(newAcc);
		
	}
	
	public boolean rmvAcc(String iD) 
	{
		
		int accIndex;
		//Account match;
		
		Account match = new Account(iD);
		
		accIndex = accs.indexOf(match);
		if (accIndex > -1) 
		{
			
			accs.remove(accIndex);
			return(true);
			
		} else {
			
			return(false);
		}
		
		
	}
}