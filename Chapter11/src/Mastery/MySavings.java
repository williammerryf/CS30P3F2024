package Mastery;

import java.io.*;
import java.util.Scanner;

import SkillBuilders.StuName;

public class MySavings {

	public static void main(String[] args) 
	{
		//String fileName = "../Chapter11/src/Mastery/PiggyBank.txt";
		//BufferedReader readFile;
		//BufferedWriter writeFile;
		int userChoice = 9, amt;
		String fileName = "..//Chapter11/src/Mastery/bank.txt";
		Scanner input = new Scanner(System.in);
		
		PiggyBank account = new PiggyBank();
		
		//Read data from file and process
		
		File bankFile = new File(fileName);
		
		System.out.println("1. Show total in bank");
		System.out.println("2. Add a penny");
		System.out.println("3. Add a nickel");
		System.out.println("4. Add a dime");
		System.out.println("5. Add a quarter");
		System.out.println("Enter 0 to quit");
		
		try
		{

			FileOutputStream out = new FileOutputStream(bankFile);
			ObjectOutputStream writeAcc = new ObjectOutputStream(out);
			
			while(userChoice != 0)
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
				
			}
			
			
			//Write objects to file
			writeAcc.writeObject(account);
			
			writeAcc.close();
			
			System.out.println("Data written to file");
			
			//out.close();
			
			
			//Read objects
			FileInputStream in = new FileInputStream(bankFile);
			ObjectInputStream readAcc = new ObjectInputStream(in);
			
			PiggyBank account2 = (PiggyBank)readAcc.readObject();

			readAcc.close();
			
			System.out.println(account2.toString());
			
		}
					
		catch (FileNotFoundException e) 
		{
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());

		} 
		catch (IOException e) 
		{
			System.out.println("File could not be created.");
			System.err.println("IOException: " + e.getMessage());
							
		} catch (ClassNotFoundException e) {
			System.out.println("Class could not be found.");
			System.err.println("IOException: " + e.getMessage());
		}
		
	}

}