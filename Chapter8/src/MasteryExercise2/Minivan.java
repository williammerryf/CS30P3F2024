package MasteryExercise2;

public class Minivan extends Vehicle
{

	private String color;
	boolean slidingDoors;
	
	public Minivan(double fEC, double fEH, int sC, double cV, String c, boolean sD)
	{
		super(fEC, fEH, sC, cV);
		color = c;
		slidingDoors = sD;
	}
	
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
