package Mastery;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {

	public static void main(String[] args) 
	{
	
		// avgNumber of words and length of words
		
		//Declaration
		FileReader in;
		BufferedReader readFile;
		String lineText;
		double avg;
		String file = "";
		int[] lengths = {};
		char[] nonLetters = 
			{ '!', '@', '#', '$', '%', '^', '&', '*', '(', ')',
	           '-', '_', '=', '+', '{', '}', '[', ']', '|', '\\',
	           ':', ';', '"', '\'', '<', '>', ',', '.', '?', '/',
	           '`', '~', ' ', '\t', '\n', '\r' 
	        };
		
		//Create the file
		File textFile = new File("../Chapter11/src/SkillBuilders/instructions.txt");

		try
		{
			//Read and print the file as output to the user
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			while ((lineText = readFile.readLine()) != null) 
			{
				file += lineText;
			}
			readFile.close();
			in.close();
			
		//Catching errors	
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("File doesn't exist or couldn't be found");
			System.err.println("IOException: " + e.getMessage());
		}
		catch (IOException e) 
		{
			System.out.println("Problem reading File.");
    		System.err.println("IOException: " + e.getMessage());
		}
		
		System.out.print(file);
	}

	
	
}