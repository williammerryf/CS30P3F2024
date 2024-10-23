package Mastery;

// Import section
import java.io.Serializable;
import java.text.NumberFormat;
import java.lang.Math;

public class PiggyBank implements Serializable 
{

	// Variables
	private double bal;
	
	// Constructor
	public PiggyBank()
	{
		bal = 0;
	}
	
	// Constructor
	public PiggyBank(double b)
	{
		bal = b;
	}
	
	// Add money to account in terms of coins
	public void Add(int p, int n, int d, int q)
	{
		bal += p * 0.01 + n * 0.05 + d * 0.1 + q * 0.25;
	}
	
	// Withdraw money by total amount, not coins
	public void Rmv(double amt)
	{
		amt = Math.round(amt * 100) / 100;
		
		if (amt > bal)
		{
			return;
		}
		else
		{
			bal -= amt;
		}
	}
	
	// toString method, returns balance of account
	public String toString()
	{
		String accountString;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		accountString = "Current balance is " + money.format(bal);
		return(accountString);
	}
	
}
