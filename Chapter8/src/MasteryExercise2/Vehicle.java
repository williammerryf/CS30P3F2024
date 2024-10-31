package MasteryExercise2;

public abstract class Vehicle 
{

    private double fuelEconomyCity, fuelEconomyHwy, cargoVolume;
    private int seatingCapacity;
    
    public Vehicle(double fEC, double fEH, int sC, double cV)
    {
    	fuelEconomyCity = fEC;
    	fuelEconomyHwy = fEH;
    	seatingCapacity = sC;
    	cargoVolume = cV;
    }
    
    public String toString()
    {
    	String vehicleString;
    	vehicleString = "The fuel economy for the city and highway respectively is: " + fuelEconomyCity + " L/100Km , " + fuelEconomyHwy + " L/Km." + '\n'
    					+ "The seating capacity is " + seatingCapacity + " people." + '\n'
    					+ "The cargo volume is " + cargoVolume + " ft^3.";
    	
    	return(vehicleString);
    }
    
}
