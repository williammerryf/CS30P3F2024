package MasteryExercise2;

public class Minivan extends Vehicle
{

	private String frame, passengerSpace;
	private int space;
	
	public Minivan(String ma, String mo, String fT, int y, double fE, boolean o, int s)
	{
		super(ma, mo, fT, y, fE, o);
		frame = "monocoque frame intended to maximize interior space making it perfect for travelling.";
		space = s;
		passengerSpace = "7-9";
	}
	
	public String toString()
	{
		String minivanString;
		
		minivanString = super.toString() + "The car has a " + frame + '\n' +
					"It has " + space + "m^3 space in the trunk and has a passenger capacity of " + passengerSpace + " people.";
		
		return(minivanString);
	}
	
}
