package Mastery;

import java.io.*;
import java.util.Scanner;

import SkillBuilders.StuName;

public class MySavings {

	public static void main(String[] args) 
	{
		//String fileName = "../Chapter11/src/Mastery/PiggyBank.txt";
		BufferedReader readFile;
		BufferedWriter writeFile;
		int userChoice, amt;
		
		Scanner input = new Scanner(System.in);

		System.out.println("1. Show total in bank");
		System.out.println("2. Add a penny");
		System.out.println("3. Add a nickel");
		System.out.println("4. Add a dime");
		System.out.println("5. Add a quarter");
		System.out.println("Enter 0 to quit");
		
		System.out.println("Enter your choice: ");
		userChoice = input.nextInt();

		File bankFile = new File("bank.dat");
		
		//PiggyBank account = new PiggyBank();
		
		//Read data from file and process
		try
		{

			FileOutputStream out = new FileOutputStream(bankFile);
			ObjectOutputStream write = new ObjectOutputStream(out);
			
			//Write objects to file
			write.writeObject(new PiggyBank());

			write.close();
			out.close();
			
			FileInputStream in = new FileInputStream(bankFile);
			ObjectInputStream read = new ObjectInputStream(in);
			
			//Read objects
			
			PiggyBank account = (PiggyBank)read.readObject();

			read.close();
			in.close();

			while(userChoice != 0)
			{
				
				if (userChoice == 2)
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
					System.out.println("Enter amount of dimes: ");
					amt = input.nextInt();
					
					account.Add(0, 0, 0, amt);
					
				}
				
				
			}

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