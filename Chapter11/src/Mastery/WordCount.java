package Mastery;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class WordCount {

	public static void main(String[] args) 
	{
	
		// avgNumber of words and length of words
		
		//Declaration
		FileReader in;
		BufferedReader readFile;
		double wordLength = 0, avgLength = 0, numWords = 0;
		String line = "", lines = "";

		String nonChars = "['1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '_', '=', '+', '[', '{', ']', '}', ';', ':', '\"', ',', '<', '.', '>', '/', '?', '|', '`', '~', '\n']";
	
		//Create the file
		File textFile = new File("../Chapter11/src/Mastery/findreplace.txt");

		try
		{
			
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			
			while ((line = readFile.readLine()) != null) 
			{
			
				lines += line;
				lines = lines.replace('\n', ' ');
				
				String[] words = lines.split(nonChars);
				
				for (String s : words) 
				{
					System.out.println(s);
					
					wordLength += s.length();
					
				}
				
				numWords = words.length;

			}
		avgLength = wordLength / numWords;
			
		System.out.println("The amount of words is: " + numWords);
		System.out.println("The average length of the words is: " + wordLength / numWords);
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


		//System.out.println(words);
		
		
		
		
	}

	
	
}