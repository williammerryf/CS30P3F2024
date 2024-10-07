package Mastery;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WordCount {

	public static void main(String[] args) 
	{
	
		// avgNumber of words and length of words
		
		//Declaration
		FileReader in;
		BufferedReader readFile;
		String lineText;
		double wordLength, avglength, numWords;
		String[] alphabet = {"a", "b", "c", "d", "e", "f", "g",
				"h", "i", "j", "k", "l", "m", "n", 
				"o", "p", "q", "r", "s", "t",
				"u", "v", "w", "x", "y", "z" };
		ArrayList words = new ArrayList();
		ArrayList text = new ArrayList();
		
		//USE ARRAY LIST
		
		//Create the file
		File textFile = new File("../Chapter11/src/SkillBuilders/instructions.txt");

		try
		{
			//
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			
			while ((lineText = readFile.readLine()) != null) 
			{

				if(lineText.contains(alphabet))
				
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


		//fileArray = file.split(char); //FIX SPLIT
		
		
		/*
		for (int i = 0; i <= file.length(); i++)
		{
			if(charAt(i))
		}
		
		*/
		
	}

	
	
}