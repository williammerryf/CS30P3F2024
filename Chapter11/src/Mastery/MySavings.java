package Mastery;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import SkillBuilders.StuName;

public class MySavings {

	public static void main(String[] args) 
	{
		//PiggyBank bank = new PiggyBank();
		File dataFile, dataFile2;
		FileReader in, in2;
		String fileName = "../Chapter11/src/Mastery/PiggyBank.txt";
		BufferedReader readFile;
		FileWriter out;
		BufferedWriter writeFile;
		

		
		Scanner input = new Scanner(System.in);
		Scanner s = new Scanner(new File(fileName));

		//Read data from file and process
		try
		{
			dataFile = new File(fileName);
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
							
			while(s != null)
			{
				PiggyBank bank = new PiggyBank();
			}
			in.close();
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
							
		}
	
	}

}