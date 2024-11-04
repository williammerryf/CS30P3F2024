package MasteryExercise3;

/*
 * Program: PersonalAcct.java          Last Date of this Revision: November 4, 2024
 * 
 * PersonalAcct class
 * For personal accounts
 * Charges $2 if starting balance is below $100
 * Author: William Merryfield 
 * School: CHHS
 * Course: Computer Science
 * Credit: CSE 3130 Object-Oriented Programming 2
 * */

public class PersonalAcct extends Account
{
	
	//Constructor
	public PersonalAcct(double bal, String fName, String lName, String st, String c, String p, String pC)
	{
		super(bal, fName, lName, st, c, p, pC);//Take from Account
	}
	
	//Check if money has to be charged to account if balance is too low
	public void balanceMinimum()
	{
		if(super.getBalance() < 100)
		{
			super.withdrawal(2.00);
			System.out.println("$2.00 will be charged if a personal acount is made.");
		}
		else
		{
			System.out.println("A personal account can be made charge free.");
		}
		
	}
	
	//toString method
	public String toString()
	{
		String persAcctString;
		
		persAcctString = "Personal Account" + '\n' + super.toString();
		
		return(persAcctString);
	}
	
}
