package MasteryExercise2;

/*

Program: Car.java          Last Date of this Revision: November 5, 2024

Purpose: Subclass that inherits Vehicle class. Car has variables color and sunRoof.
		 Makes a car.

Author: William Merryfield 
School: CHHS
Course: Computer Science
Credit: CSE 3130 Object-Oriented Programming 2
 
*/

public class Car extends Vehicle 
{
	//Class variables
	private String color;
	boolean sunRoof;
	
	//Constructor
	public Car(double fEC, double fEH, int sC, double cV, String c, boolean s)
	{
		super(fEC, fEH, sC, cV);
		color = c;
		sunRoof = s;
	}
	
	//toString method
	public String toString()
	{
		String carString, sR;
		
		if(sunRoof)
		{
			sR = " and has a sunroof.";
		}
		else
		{
			sR = " and doesn't have a sunroof.";
		}
		
		carString = super.toString() + '\n' + "The car is " + color + sR;
		return(carString);
	}
	
}
