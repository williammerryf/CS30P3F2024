package MasteryExercise3;

/*
 * Program: BusinessAcct.java          Last Date of this Revision: November 4, 2024
 * 
 * BusinessAcct class
 * For business accounts
 * Charges $10 if starting balance is below $500
 * 
 * Author: William Merryfield 
 * School: CHHS
 * Course: Computer Science
 * Credit: CSE 3130 Object-Oriented Programming 2
 * */

public class BusinessAcct extends Account
{

	//Constructor
	public BusinessAcct(double bal, String fName, String lName, String st, String c, String p, String pC)
	{
		super(bal, fName, lName, st, c, p, pC);//Take from Account
	}
	
	//Check if money has to be charged to account if balance is too low
	public void balanceMinimum()
	{
		if(super.getBalance() < 500)
		{
			super.withdrawal(10.00);
			System.out.println("$10.00 will be charged if a business acount is made.");
		}
		else
		{
			System.out.println("A business account can be made charge free.");
		}
		
	}
	
	//toString method
	public String toString()
	{
		String busAcctString;
		
		busAcctString = "Business Account" + '\n' + super.toString();
		
		return(busAcctString);
	}
	
}
