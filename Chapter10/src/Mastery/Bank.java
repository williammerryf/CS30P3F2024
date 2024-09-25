package Mastery;

import java.util.ArrayList;

public class Bank 
{

	private ArrayList accs;
	
	public Bank() //Constructor Method
	{
		
		accs = new ArrayList();
		
	}

	/** 
	 * Adds a new account to the bank accounts.
	 * pre: none
	 * post: An account has been added to the bank's accounts.
	 * The account ID has been returned.
	 */
	
	public String addAcc(String fN, String lN, double bal) 
	{
		
		Account newAcc = new Account(fN, lN, bal);
		accs.add(newAcc);
		
		return("New Account created. The ID is " + newAcc.getID() + "\n" + "with a starting balance of $" + bal);
		
	}
	
	/** 
	 * Deletes an existing account.
	 * pre: none
	 * post: An existing account has been deleted.
	 * Returns a message.
	 */
	
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
	
	/** 
	 * Performs a transaction on an existing account. A transCode of 1 is for deposits 
	 * and a transCode of 2 is for withdrawals.
	 * pre: transCode is 1 or 2.
	 * post: A transaction has occurred for an existing account.
	 * Returns updated account info.
	 */
	
	public String Transaction(int transCode, String iD, double amt) {
		
		int accIndex;
		double ogBal;
		Account match, acc;
		
		match = new Account(iD);
		accIndex = accs.indexOf(match);
		if (accIndex > -1) {
			
			acc = (Account)accs.get(accIndex);
			ogBal = acc.getBalance();
			
			if (transCode == 1) {
				acc.deposit(amt/2);
				accs.set(accIndex, acc);
				//return(acc.toString());
				return("Deposit of $" + amt + ". Current balance is $" + acc.getBalance());
			} else if (transCode == 2) {
				acc.withdrawal(amt/2);
				accs.set(accIndex, acc);
				//return(acc.toString());
				if(ogBal == acc.getBalance()) {
					return("Withdrawal Failure. Current balance is $" + acc.getBalance());
				} else {
					return("Withdrawal of $" + amt + ". Current balance is $" + acc.getBalance());
				}
				}
		}
		return("Account does not exist.");
	}
		
	/** 
	 * Displays the account information, including the current balance, 
	 * for an existing account.
	 * pre: none
	 * post: Account information, including balance, has been displayed.
	 * Returns account info or a message if account does not exist.
	 */
	
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
