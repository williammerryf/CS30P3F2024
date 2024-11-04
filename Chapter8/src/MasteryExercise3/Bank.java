package MasteryExercise3;
/*

Program: Bank.java          Last Date of this Revision: November 4, 2024

Purpose: An application that uses a while loop to use the account, customer, PersonalAcct, and BusinessAcct classes.
		Allows user to open, withdraw , deposit, and change the address of a personal or business account.

Author: William Merryfield 
School: CHHS
Course: Computer Science
Credit: CSE 3130 Object-Oriented Programming 2
 

*/
///////// ADD NUMEBR FROMAT OR CURRENCY INSTANCE
//Import section
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) 
	{
		
		//Declaration area
		double bal, amt;
		String action, fN, lN, street, city, prov, postalCode;
		int accType;
		Scanner input = new Scanner(System.in);

		//Gather data from user for Account class
		
		System.out.println("Balance: ");
		bal = input.nextDouble();
		
		System.out.println("Firstname: ");
		fN = input.next();
		
		System.out.println("Lastname: ");
		lN = input.next();
		
		System.out.println("Street:  ");
		street = input.next();
		
		System.out.println("City:  ");
		city = input.next();
		
		System.out.println("Province:  ");
		prov = input.next();
		
		System.out.println("Postal Code:  ");
		postalCode = input.next();
		
		//Create objects for a personal and business account
		PersonalAcct pAcct = new PersonalAcct(bal, fN, lN, street, city, prov, postalCode);
		BusinessAcct bAcct = new BusinessAcct(bal, fN, lN, street, city, prov, postalCode);
		
		//This is where money will be charged if balance is too low for each account
		pAcct.balanceMinimum();
		bAcct.balanceMinimum();
		
		// Prompt user to choose either a personal or business account
		System.out.println("Open a personal account: 1" + '\n' + 
						   "Open a business account: 2");
		
		accType = input.nextInt();
		
		//Initialize account object
		//Switch case statements in the while loop will change this value
		Account account = pAcct;
		
		//While true loop 
		while(true)
		{
			
			//Switch case statements to change or keep the account object
			switch(accType)
			{
				case 1: account = pAcct; break;
				case 2: account = bAcct; break;
			}
			
			//User menu
			System.out.println("Current balance is $" + account.getBalance());
			System.out.println("(D)eposit" + '\n' + 
							   "(W)ithdrawal" + '\n' + 
							   "(A)ddress change" + '\n' + 
							   "(V)iew account details" + '\n' +
							   "(Q)uit");
			//Record user input
			action = input.next();
			
			//Deposit
			if(action.equalsIgnoreCase("d"))
			{
				System.out.println("Enter deposit amount: ");
				amt = input.nextDouble();
				account.deposit(amt);
			}
			//Withdrawal
			else if(action.equalsIgnoreCase("w"))
			{
				System.out.println("Enter withdrawal amount: ");
				amt = input.nextDouble();
				account.withdrawal(amt);
			}
			//View account details
			else if(action.equalsIgnoreCase("v"))
			{
				System.out.println(account);
			}
			//Change address, if input = 'same' then original values will be kept
			else if(action.equalsIgnoreCase("a"))
			{
				System.out.println("Enter 'same' to keep original address values.");
				
				System.out.println("Street: ");
				street = input.next();
				if(street.equalsIgnoreCase("same"))
				{
					street = account.getStreet();
				}
					
				System.out.println("City: ");
				city = input.next();
				if(city.equalsIgnoreCase("same"))
				{
					city = account.getCity();
				}
					
				System.out.println("Province: ");
				prov = input.next();
				if(prov.equalsIgnoreCase("same"))
				{
					prov = account.getProvince();
				}
					
				System.out.println("Postal Code: ");
				postalCode = input.next();
				if(postalCode.equalsIgnoreCase("same"))
				{
					postalCode = account.getPostalCode();
				}
					
				account.changeAddress(street, city, prov, postalCode);

			}
			//Quit
			else if(action.equalsIgnoreCase("q"))
			{
				System.out.println("Closing bank.");
				input.close();
				break; //Break loop
			}
			else
			{
				System.out.println("Invalid.");
			}

				
		}
			
			
	}
		
		
}
		
/*

Test Cases

Test Case 1




 */
	
