package Mastery;

import java.io.*;
import java.util.Scanner;

public class FindAndReplace {

	public static void main(String[] args) throws IOException 
	{
		//Declaration	
		File textFile, modifiedTextFile;
		Scanner input = new Scanner(System.in);
		FileReader in;
		BufferedReader readFile;
		FileWriter out;
		BufferedWriter writeFile;
		
		String fileName, word, replacementWord, newFile, oldFile = "";
				
		//While loop until valid filename is selected 
		while(true) 
		{		
			//Obtain file name from the user
			System.out.println("Please enter a file name: ");
			fileName = input.nextLine();
				
			//Determine if a file exists
			textFile = new File(fileName);
				
			//Selection statements
			if(textFile.exists()) 
			{
				System.out.println("Please enter a word to be replaced: ");
				word = input.nextLine();
					
				System.out.println("Please enter the replacement word: ");
				replacementWord = input.nextLine();
			
				break;
			} 
			else
			{
				System.out.println("File doesn't exist. Try Again.");
			}
		
		}

		
		
		
		
		
		
		//Reads old file
		try
		{
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			
			while((readFile.readLine()) != null)
			{
				oldFile += readFile.readLine();
			}
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());

		}
		
		
		
	
		
		
		
		
		
		
		
		
		//Create a new file to edit
		modifiedTextFile = new File("../Chapter11/src/SkillBuilders/new.txt");

		try
		{
			modifiedTextFile.createNewFile();
			
			out = new FileWriter(modifiedTextFile);
			writeFile = new BufferedWriter(out);
			
			newFile = oldFile.replaceAll(word, replacementWord);
			
			System.out.println("new.txt file created");
			
			writeFile.write(oldFile);
			System.out.println(oldFile);
			
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
		writeFile.close();
		out.close();
		System.out.println("Data written to file.");
		//textFile.delete();
		

	}
	
}
