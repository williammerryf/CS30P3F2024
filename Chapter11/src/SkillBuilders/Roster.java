package SkillBuilders;

import java.io.*;
import java.util.Scanner;

public class Roster {

	public static void main(String[] args) 
	{
		File dataFile;
		FileReader in;
		String fileName;
		BufferedReader readFile;
		FileWriter out;
		BufferedWriter writeFile;
		int numStu;
		String fName, lName;
		Scanner input = new Scanner(System.in);
		
		//Write data to file
		System.out.println("Enter file name for storing student names: ");
		fileName = input.next();
				
		System.out.println("How many students? ");
		numStu = input.nextInt();
		
		try
		{
			dataFile = new File(fileName);
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			for(int i = 0; i < numStu; i++)
			{
				System.out.println("Enter student first name: ");
				fName = input.next();
				
				System.out.println("Enter student last name: ");
				lName = input.next();
				
				writeFile.write(fName);
				writeFile.newLine();
				writeFile.write(lName);
				writeFile.newLine();
				
			}
			writeFile.close();
			out.close();
			System.out.println("Data written to file.");
		}
		catch (IOException e) 
		{
			System.out.println("File could not be created.");
			System.err.println("IOException: " + e.getMessage());
		}
		
		
		//Read data from file and process
		try
		{
			dataFile = new File(fileName);
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
					
			while((fName = readFile.readLine()) != null)
			{
				lName = readFile.readLine();
				StuName newStu = new StuName(fName, lName);
				newStu.toString();
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
