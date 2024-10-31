package MasteryExercise2;

public class Car extends Vehicle 
{
	private String color;
	boolean sunRoof;
	
	public Car(double fEC, double fEH, int sC, double cV, String c, boolean s)
	{
		super(fEC, fEH, sC, cV);
		color = c;
		sunRoof = s;
	}
	
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
