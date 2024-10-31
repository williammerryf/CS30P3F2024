package MasteryExercise2;

public class Truck extends Vehicle
{

	private String color;
	double towingCapacity;
	
	public Truck(double fEC, double fEH, int sC, double cV, String c, double tC)
	{
		super(fEC, fEH, sC, cV);
		color = c;
		towingCapacity = tC;
	}
	
	public String toString()
	{
		String truckString;
	
		truckString = super.toString() + '\n' + "The truck is " + color + " and has a towing capacity of " + towingCapacity + " kgs.";
		return(truckString);
	}
	
}
