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
		double wordLength, avglength, numWords;
		char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		String line = "", word = "";
		
		ArrayList<String> words = new ArrayList<String>();
		
		ArrayList text = new ArrayList();
		
		//USE ARRAY LIST
		
		//Create the file
		File textFile = new File("../Chapter11/src/Mastery/findreplace.txt");

		try
		{
			
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			
			while ((line = readFile.readLine()) != null) 
			{
				for(int i = 0; i < line.length(); i++)
				{
					
					for(char a : alphabet) {
						
						if(line.charAt(i) == a) 
						{
						
							word += line.charAt(i);
							System.out.println(word);
							
						}
						else
						{
							
							words.add(word);
							word = "";
							
						}
						
					}
					
				}
				
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


		//System.out.println(words);
		
	}

	
	
}