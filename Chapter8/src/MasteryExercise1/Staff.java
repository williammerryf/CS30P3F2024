package MasteryExercise1;

/*

Program: Staff.java          Last Date of this Revision: November 5, 2024

Purpose: A subclass of UEmployee class, it stores data and handles the staff.
		 Records jobTitle.

Author: William Merryfield 
School: CHHS
Course: Computer Science
Credit: CSE 3130 Object-Oriented Programming 2
 

*/

public class Staff extends UEmployee
{
	//Class variables
	private String jobTitle = "";
	
	//Constructor
	public Staff(String n, double s, String j)
	{
		super(n, s);
		jobTitle = j;
	}
	
	//Returns job title
	public String getTitle()
	{
		return(jobTitle);
	}
	
	//toString method
	public String toString()
	{
		String staffString;
		
		staffString = super.toString() + ". They're a/the " + jobTitle + ".";
		
		return(staffString);
	}
}
