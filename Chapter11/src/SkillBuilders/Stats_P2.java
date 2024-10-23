package SkillBuilders;

import java.io.*;
import java.util.Scanner;
import java.text.NumberFormat;

public class Stats_P2 {

	public static void main(String[] args) 
	{
		
		File dataFile;
		FileReader in;
		String filename;
		BufferedReader readFile;
		FileWriter out;
		BufferedWriter writeFile;
		int numStu;
		String stuName, score;
		double scoreValue;
		double lowScore = 100;
		double highScore = 0;
		double avgScore;
		double totalScores = 0;
		int numScores = 0;
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		Scanner input = new Scanner(System.in);
		
		
		//Write data to file
		System.out.println("Enter file name for storing names and grades: ");
		filename = input.next();
		
		System.out.println("How many students? ");
		numStu = input.nextInt();
		
		try
		{
			dataFile = new File(filename);
			out = new FileWriter(dataFile);
			writeFile = new BufferedWriter(out);
			
			for(int i = 0; i < numStu; i++)
			{
				System.out.println("Enter student name: ");
				stuName = input.next();
				
				System.out.println("Enter test score: ");
				score = input.next();
				
				writeFile.write(stuName);
				writeFile.newLine();
				writeFile.write(score);
				writeFile.newLine();
				
			}
			writeFile.close();
			out.close();
			input.close();
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
			dataFile = new File(filename);
			in = new FileReader(dataFile);
			readFile = new BufferedReader(in);
			
			while((stuName = readFile.readLine()) != null)
			{
				score = readFile.readLine();
				System.out.println(stuName + " " + score);
				numScores += 1;
				scoreValue = Double.parseDouble(score);
				totalScores += scoreValue;
				
				if (scoreValue < lowScore)
				{
					lowScore = scoreValue;
				}
				if (scoreValue > highScore)
				{
					highScore = scoreValue;
				}
			}
			
			avgScore = totalScores / numScores;
			System.out.println("Low score = " + percent.format(lowScore/100));
			System.out.println("High score = " + percent.format(highScore/100));
			System.out.println("Average score = " + percent.format(avgScore/100));
			
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
