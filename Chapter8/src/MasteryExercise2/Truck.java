package MasteryExercise2;

/*

Program: Truck.java          Last Date of this Revision: November 5, 2024

Purpose: Subclass that inherits Vehicle class. Truck has variables color and towingCapacity.
		 Makes a Truck.

Author: William Merryfield 
School: CHHS
Course: Computer Science
Credit: CSE 3130 Object-Oriented Programming 2
 
*/

public class Truck extends Vehicle
{
	//Class variables
	private String color;
	double towingCapacity;
	
	//Constructor
	public Truck(double fEC, double fEH, int sC, double cV, String c, double tC)
	{
		super(fEC, fEH, sC, cV);
		color = c;
		towingCapacity = tC;
	}
	
	//toString method
	public String toString()
	{
		String truckString;
	
		truckString = super.toString() + '\n' + "The truck is " + color + " and has a towing capacity of " + towingCapacity + " kgs.";
		return(truckString);
	}
	
}
