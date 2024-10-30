package MasteryExercise2;

public abstract class Vehicle 
{
    private String make;
    private String model;
    private String fuelType;
    private int year;
    private double fuelEff;
    private boolean operable;
    
    public Vehicle(String ma, String mo, String fT, int y, double fE, boolean o)
    {
    	make = ma;
    	model = mo;
    	fuelType = fT;
    	year = y;
    	fuelEff = fE;
    	operable = o;
    }
    
    public String toString()
    {
    	String vehicleString, operability;
    	
    	if(operable)
    	{
    		operability = "Operable, ready to drive";
    	}
    	else
    	{
    		operability = "Inoperable, do not drive";
    	}
    	
    	vehicleString = "Manufacturer and model: " + make + ", " + model + '\n'
    			+ "Year: " + year + '\n' 
    			+ "Fuel type and efficiency: " + fuelType + ", " + fuelEff + "L/100Km" + '\n'
    			+ operability + '\n';
    	
    	return(vehicleString);
    }
    
}
