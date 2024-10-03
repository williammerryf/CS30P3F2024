package SkillBuilders;

import java.io.*;
import java.util.Scanner;

public class MyFile_P2 {

	public static void main(String[] args) 
	{	
		//Declaration	
		File textFile;
		Scanner input = new Scanner(System.in);
		String response;
		
		//Create a file
		textFile = new File("../Chapter11/src/SkillBuilders/zzz.txt");
		
		//Selection statements
		if(textFile.exists()) 
		{
			System.out.println("zzz.txt exists. ");
		} 
		else
		{
			try
			{
			textFile.createNewFile();
			System.out.print("zzz.txt file created");
			}
				
			catch (IOException e) 
			{
				System.out.println("File could not be created.");
	    		System.err.println("IOException: " + e.getMessage());
			}

		}
		
		//Delete the file if user chooses
		System.out.println("Would you like to (K)eep or (D)elete the file: ");
		response = input.next();
		
		if(response.equalsIgnoreCase("D"))
		{
			//Delete
			if(textFile.delete())
			{
				System.out.println("File deleted");
			}
		}
		else
		{
			System.out.println("File is kept and stays the same ");
		}
	}

}
