/*

Program: FindAndReplace.java          Last Date of this Revision: October 22, 2024

Purpose: 
Find and replace a inputed word or phrase within a document determined by user

Author: William Merryfield 
School: CHHS
Course: CSE2130 File Structures and Event Handling
 
*/

package Mastery;

import java.io.*;
import java.util.Scanner;

public class FindAndReplace {

	public static void main(String[] args) throws IOException 
	{
		// Declaration	
		File textFile, modifiedTextFile;
		Scanner input = new Scanner(System.in);
		FileReader in;
		BufferedReader readFile;
		FileWriter out;
		BufferedWriter writeFile;
		String fileName, word, replacementWord, newFile = "", oldFile = "", line = "";
				
		// While loop until valid filename is selected 
		while(true) 
		{		
			// Obtain file name from the user
			System.out.println("Please enter a file name: ");
			fileName = input.nextLine();
				
			// Determine if file exists
			textFile = new File(fileName);
				
			// Selection statements
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
		input.close();

		// Reads old file, turns it into a string, then deletes it
		try
		{
			in = new FileReader(textFile);
			readFile = new BufferedReader(in);
			
			// Read file and Store contents into a string
			while((line = readFile.readLine()) != null)
			{
				
				oldFile += line;
				oldFile += "\n";
				
			}
			
			// Replace the word within the string 
			newFile = oldFile.replaceAll(word, replacementWord);
			System.out.print(newFile);
			// Delete original file
			textFile.delete();
			
			readFile.close();
			in.close();
			
		}
		catch (FileNotFoundException e) 
		{
			
			System.out.println("File does not exist or could not be found.");
			System.err.println("FileNotFoundException: " + e.getMessage());

		}

		// Create a new file to write the edited string into
		modifiedTextFile = new File(fileName);

		try
		{
			
			modifiedTextFile.createNewFile();
			
			out = new FileWriter(modifiedTextFile);
			writeFile = new BufferedWriter(out);			
			
			writeFile.write(newFile);			
		
			writeFile.close();
			out.close();
			
		}
		catch (IOException e) 
		{
			
			System.out.println("File could not be created.");
	    	System.err.println("IOException: " + e.getMessage());
	    	
		}

		System.out.println("Data written to file.");

	}
	
}

/*

ORIGINAL ../Chapter11/src/Mastery/findreplace.txt FILE CONTENTS

bob went on a walk
he went to the park

//TEST 1//

Please enter a file name: 
../Chapter11/src/Mastery/findreplace.txt
Please enter a word to be replaced: 
bob
Please enter the replacement word: 
Mr A
Mr A went on a walk
he went to the park
Data written to file.

//TEST 2//

Please enter a file name: 
/Chapter11/src/Mastery/findreplace.txt
File doesn't exist. Try Again.
Please enter a file name: 

//TEST 3//

Please enter a file name: 
../Chapter11/src/Mastery/findreplace.txt
Please enter a word to be replaced: 
went on a walk
Please enter the replacement word: 
teaches cs
Mr A teaches cs
he went to the park
Data written to file.

*/


