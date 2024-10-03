package SkillBuilders;

import java.io.*;

public class Assignment {

	public static void main(String[] args) 
	{
		//Declaration
		FileReader in;
		BufferedReader readFile;
		String lineText;
		
		//Create the file
		File textFile = new File("../Chapter11/src/SkillBuilders/instructions.txt");
		
		
		try
		{
			//Read and print the file as output to the user
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			while ((lineText = readFile.readLine()) != null) 
			{
				System.out.println(lineText);
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
		
	}

}
