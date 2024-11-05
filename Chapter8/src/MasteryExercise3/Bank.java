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

//Import section
import java.util.Scanner;
import java.text.NumberFormat;

public class Bank {

	public static void main(String[] args) 
	{
		
		//Declaration area
		double bal, amt;
		String action, fN, lN, street, city, prov, postalCode;
		int accType;
		NumberFormat money = NumberFormat.getCurrencyInstance();
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
			System.out.println("Current balance is " + money.format(account.getBalance()));
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

//Test Case 1//

Balance: 
100
Firstname: 
william
Lastname: 
merryfield
Street:  
street
City:  
calgary
Province:  
alberta
Postal Code:  
123abc
A personal account can be made charge free.
$10.00 will be charged if a business acount is made.
Open a personal account: 1
Open a business account: 2
2
Current balance is $90.00
(D)eposit
(W)ithdrawal
(A)ddress change
(V)iew account details
(Q)uit
d
Enter deposit amount: 
10.5
Current balance is $100.50
(D)eposit
(W)ithdrawal
(A)ddress change
(V)iew account details
(Q)uit
w
Enter withdrawal amount: 
0.5
Current balance is $100.00
(D)eposit
(W)ithdrawal
(A)ddress change
(V)iew account details
(Q)uit
a
Enter 'same' to keep original address values.
Street: 
same
City: 
vancouver
Province: 
BC
Postal Code: 
456def
Current balance is $100.00
(D)eposit
(W)ithdrawal
(A)ddress change
(V)iew account details
(Q)uit
v
Business Account
wmerryfield
william merryfield
Address: 
street
vancouver, BC, 456def
Current balance is $100.00
Current balance is $100.00
(D)eposit
(W)ithdrawal
(A)ddress change
(V)iew account details
(Q)uit
q
Closing bank.

//Test Case 2//

Balance: 
50
Firstname: 
bob
Lastname: 
sig
Street:  
street
City:  
vancouver
Province:  
BC
Postal Code:  
123456
$2.00 will be charged if a personal acount is made.
$10.00 will be charged if a business acount is made.
Open a personal account: 1
Open a business account: 2
1
Current balance is $48.00
(D)eposit
(W)ithdrawal
(A)ddress change
(V)iew account details
(Q)uit
w
Enter withdrawal amount: 
50
Not enough money in account.
Current balance is $48.00
(D)eposit
(W)ithdrawal
(A)ddress change
(V)iew account details
(Q)uit
w
Enter withdrawal amount: 
48
Current balance is $0.00
(D)eposit
(W)ithdrawal
(A)ddress change
(V)iew account details
(Q)uit
d
Enter deposit amount: 
10000000000000000
Current balance is $10,000,000,000,000,000.00
(D)eposit
(W)ithdrawal
(A)ddress change
(V)iew account details
(Q)uit
v
Personal Account
bsig
bob sig
Address: 
street
vancouver, BC, 123456
Current balance is $10,000,000,000,000,000.00
Current balance is $10,000,000,000,000,000.00
(D)eposit
(W)ithdrawal
(A)ddress change
(V)iew account details
(Q)uit
a
Enter 'same' to keep original address values.
Street: 
same
City: 
calgary
Province: 
AB
Postal Code: 
postal
Current balance is $10,000,000,000,000,000.00
(D)eposit
(W)ithdrawal
(A)ddress change
(V)iew account details
(Q)uit
v
Personal Account
bsig
bob sig
Address: 
street
calgary, AB, postal
Current balance is $10,000,000,000,000,000.00
Current balance is $10,000,000,000,000,000.00
(D)eposit
(W)ithdrawal
(A)ddress change
(V)iew account details
(Q)uit
q
Closing bank.

 */
	
