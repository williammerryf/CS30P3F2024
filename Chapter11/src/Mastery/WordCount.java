package Mastery;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class WordCount {

	public static void main(String[] args) 
	{
		
		// Declaration
		FileReader in;
		BufferedReader readFile;
		double wordLength = 0, numWords = 0;
		String line = "", lines = "";

		DecimalFormat decFormat = new DecimalFormat("##.##");
		
		String nonChars = "['1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '_', '=', '+', '[', '{', ']', '}', ';', ':', '\"', ',', '<', '.', '>', '/', '?', '|', '`', '~', '\n', '%', ' ']";
	
		// Create the file
		File textFile = new File("../Chapter11/src/Mastery/source.txt");

		try
		{
			
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			
			while ((line = readFile.readLine()) != null) 
			{
				
				// Transform the contents of the file into a string
				lines += line;
				lines.replace('\n', ' ');
				lines += " " + readFile.readLine();
				
			}
			
			// Replace method to replace null with nothing
			lines = lines.replace("null", "");
			
			// Make new array by using the split method on a string
			String[] words = lines.split(nonChars);
			
			// For loop to iterate through each element in the array 
			for (String s : words) 
			{
						
				System.out.print(s + " ");
				
				// Calculates number of words and average word per word(element of array)
				numWords += 1;
				wordLength += s.length();
					
			}
			
			// Output
			System.out.println("");
			System.out.println("The amount of words is: " + numWords);
			System.out.println("The average length of the words is: " + decFormat.format(wordLength / numWords));
			readFile.close();
			in.close();
			
		// Catching errors	
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

	}

}



/*
source.txt file

bob went to the mall

he saw bill
bill had a cat named c1o=l'l;e.r

//TEST 1//

bob went to the mall he saw bill bill had a cat named c o l l e r 
The amount of words is: 19.0
The average length of the words is: 2.47




*/