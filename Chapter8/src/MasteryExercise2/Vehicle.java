package MasteryExercise2;

/*

Program: Vehicle.java          Last Date of this Revision: November 5, 2024

Purpose: Superclass that serves to be inherited by car, truck, and minivan classes.
		 Serves as a basic foundation for these vehicles.

Author: William Merryfield 
School: CHHS
Course: Computer Science
Credit: CSE 3130 Object-Oriented Programming 2
 
*/

public abstract class Vehicle 
{
	//Class variables
    private double fuelEconomyCity, fuelEconomyHwy, cargoVolume;
    private int seatingCapacity;
    
    //Constructor
    public Vehicle(double fEC, double fEH, int sC, double cV)
    {
    	fuelEconomyCity = fEC;
    	fuelEconomyHwy = fEH;
    	seatingCapacity = sC;
    	cargoVolume = cV;
    }
    
    //toString method
    public String toString()
    {
    	String vehicleString;
    	vehicleString = "The fuel economy for the city and highway respectively is: " + fuelEconomyCity + " L/100Km , " + fuelEconomyHwy + " L/Km." + '\n'
    					+ "The seating capacity is " + seatingCapacity + " people." + '\n'
    					+ "The cargo volume is " + cargoVolume + " ft^3.";
    	
    	return(vehicleString);
    }
    
}
