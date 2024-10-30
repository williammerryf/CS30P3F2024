package MasteryExercise2;

public class Truck extends Vehicle
{

	private String frame, passengerSpace;
	private int bedSpace; // Add towing capacity
	
	public Truck(String ma, String mo, String fT, int y, double fE, boolean o, int bS)
	{
		super(ma, mo, fT, y, fE, o);
		frame = "body-on-frame design for heavy lifting/hauling and operating under non-ideal conditions. Optimal for work. ";
		bedSpace = bS;
		passengerSpace = "2-6";
	}
	
	public String toString()
	{
		String truckString;
		
		truckString = super.toString() + "The car has a " + frame + '\n' +
					"It has " + bedSpace + "m^3 space in the trunk and has a passenger capacity of " + passengerSpace + " people.";
		
		return(truckString);
	}
	
}
