package MasteryExercise2;

public class Car extends Vehicle 
{
	private String frame, passengerSpace;
	private int trunkSpace;
	
	public Car(String ma, String mo, String fT, int y, double fE, boolean o, int tS)
	{
		super(ma, mo, fT, y, fE, o);
		frame = "unibody frame for everday driving offering ease and maneuverability. They aren't designed for heavy lifting.";
		trunkSpace = tS;
		passengerSpace = "2-5";
	}
	
	public String toString()
	{
		String carString;
		
		carString = super.toString() + "The car has a " + frame + '\n' +
					"It has " + trunkSpace + "m^3 space in the trunk and has a passenger capacity of " + passengerSpace + " people.";
		
		return(carString);
	}
	
}
