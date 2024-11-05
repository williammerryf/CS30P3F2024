package MasteryExercise1;

/*

Program: UEmployee.java          Last Date of this Revision: November 5, 2024

Purpose: Superclass of the faculty and staff classes. Stores and handles name and salary.
		 Records name and salary.

Author: William Merryfield 
School: CHHS
Course: Computer Science
Credit: CSE 3130 Object-Oriented Programming 2
 

*/

import java.text.NumberFormat;

public abstract class UEmployee 
{
	//Class variables
	private String name;
	private double salary;
	NumberFormat money = NumberFormat.getCurrencyInstance();
	
	//Constructor
	public UEmployee(String n, double s)
	{
		name = n;
		salary = s;
	}
	
	//Constructor
	public UEmployee()
	{
		name = "";
		salary = 0;
	}
	
	//Return salary
	public double getSalary()
	{
		return(salary);
	}
	
	//return name
	public String getName()
	{
		return(name);
	}
	
	//toString method
	public String toString()
	{
		String empString;
		empString = "The employee name and salary respectively is: " + name + ", " + money.format(salary);
		return(empString);
	}
}
