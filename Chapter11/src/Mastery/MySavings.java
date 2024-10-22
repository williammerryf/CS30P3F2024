/*

Program: MySavings.java          Last Date of this Revision: October 22, 2024

Purpose: 
Load and save an account to withdraw 
and deposit money in terms of pennies, 
nickels, dimes, and quarters.

Author: William Merryfield 
School: CHHS
Course: CSE2130 File Structures and Event Handling
 
*/

package Mastery;

//Import Section
import java.io.*;
import java.util.Scanner;

public class MySavings {

	// Static variables used by methods at bottom to save and load PiggyBank object
	static String fileName = "..//Chapter11/src/Mastery/bank.txt";
	static File bankFile = new File(fileName);
	
	public static void main(String[] args) 
	{

		// Variables
		int userChoice = 0, amt;
		Scanner input = new Scanner(System.in);
		
		//Loads PiggyBank object using method
		PiggyBank account = load();
		
		// User menu
		System.out.println("1. Show total in bank");
		System.out.println("2. Add a penny");
		System.out.println("3. Add a nickel");
		System.out.println("4. Add a dime");
		System.out.println("5. Add a quarter");
		System.out.println("6. Withdraw");
		System.out.println("Enter 0 to quit");
		
		// While loop for user to interact with object
		while(true)
			{
				System.out.println("Enter your choice: ");
				userChoice = input.nextInt();
				
				if(userChoice == 1)
				{
					
					System.out.println(account.toString());

				}
				
				else if (userChoice == 2)
				{
					System.out.println("Enter amount of pennies: ");
					amt = input.nextInt();
					
					account.Add(amt, 0, 0, 0);

					
				}
				else if (userChoice == 3)
				{
					System.out.println("Enter amount of nickels: ");
					amt = input.nextInt();
					
					account.Add(0, amt, 0, 0);
				
					
				}
				else if (userChoice == 4)
				{
					System.out.println("Enter amount of dimes: ");
					amt = input.nextInt();
					
					account.Add(0, 0, amt, 0);
			
				}
				else if (userChoice == 5)
				{
					System.out.println("Enter amount of quarters: ");
					amt = input.nextInt();
					
					account.Add(0, 0, 0, amt);
					
				}
				else if (userChoice == 6)
				{
					System.out.println("Enter amount to withdrawal: ");
					amt = input.nextInt();
					
					account.Rmv(amt);
				}
				
				else if (userChoice == 0)
				{
					// saves account using method 
					save(account);
					input.close(); // Close Scanner
					break; // break while loop
					
				}
				
			}
			
		}
	
	//Save and load to file methods for PiggyBank object 
	
	// Method to save object to file with output stream
	private static void save(PiggyBank account)
	{
		try (ObjectOutputStream writeAcc = new ObjectOutputStream(new FileOutputStream(bankFile)))
		{
			writeAcc.writeObject(account);
			System.out.println("PiggyBank saved successfully");
		}
		catch (IOException e)
		{
			System.out.println("File could not be created. Error saving PiggyBank");
			System.err.println("IOException: " + e.getMessage());
		}
	}
	
	// Method to load object from a file with input stream
	private static PiggyBank load()
	{
		try (ObjectInputStream readAcc = new ObjectInputStream(new FileInputStream(bankFile)))
		{
			return (PiggyBank)readAcc.readObject();
		} 
		catch (IOException | ClassNotFoundException e)
		{
			// If the file doesn't exist, return new PiggyBank object
			System.out.println("No saved PiggyBank. Loading a new one.");
			return new PiggyBank();
		}
	}
	
}

/* Screen Dump

//TEST 1//

1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Withdraw
Enter 0 to quit
Enter your choice: 
1
Current balance is $2.50
Enter your choice: 
2
Enter amount of pennies: 
1
Enter your choice: 
3
Enter amount of nickels: 
1
Enter your choice: 
4
Enter amount of dimes: 
1
Enter your choice: 
5
Enter amount of quarters: 
1
Enter your choice: 
1
Current balance is $2.91
Enter your choice: 
0
PiggyBank saved successfully

//TEST 2://

1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Withdraw
Enter 0 to quit
Enter your choice: 
1
Current balance is $2.91
Enter your choice: 
6
Enter amount to withdrawal: 
2
Enter your choice: 
1
Current balance is $0.91
Enter your choice: 
0
PiggyBank saved successfully
 
 */


