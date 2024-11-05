package MasteryExercise2;

/*

Program: Minivan.java          Last Date of this Revision: November 5, 2024

Purpose: Subclass that inherits Vehicle class. Minivan has variables color and slidingDoors.
		 Makes a Minivan.

Author: William Merryfield 
School: CHHS
Course: Computer Science
Credit: CSE 3130 Object-Oriented Programming 2
 
*/

public class Minivan extends Vehicle
{
	//Class variables
	private String color;
	boolean slidingDoors;
	
	//Constructors
	public Minivan(double fEC, double fEH, int sC, double cV, String c, boolean sD)
	{
		super(fEC, fEH, sC, cV);
		color = c;
		slidingDoors = sD;
	}
	
	//toString method
	public String toString()
	{
		String minivanString, sD;
		
		if(slidingDoors)
		{
			sD = " and has sliding doors.";
		}
		else
		{
			sD = " and doesn't have sliding doors.";
		}
		
		minivanString = super.toString() + '\n' + "The minivan is " + color + sD;
			
		return(minivanString);
	}
	
}
