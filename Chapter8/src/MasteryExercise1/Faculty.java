package MasteryExercise1;

/*

Program: Faculty.java          Last Date of this Revision: November 5, 2024

Purpose: A subclass of UEmployee class, it stores data and handles the faculty.
		 Records department.

Author: William Merryfield 
School: CHHS
Course: Computer Science
Credit: CSE 3130 Object-Oriented Programming 2
 

*/

public class Faculty extends UEmployee
{
	//Class variables
	private String department = "";
	
	//Constructor
	public Faculty(String n, double s, String d)
	{
		super(n, s);
		department = d;
	}
	
	//Returns department
	public String getDepartment()
	{
		return(department);
	}
	
	//toString method
	public String toString()
	{
		String facultyString;
		
		facultyString = super.toString() + ". They work in the " + department + " department.";
		
		return(facultyString);
	}
}