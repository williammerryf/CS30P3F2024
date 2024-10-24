package SkillBuilders;

public class PuckP1 extends Disk
{
	private double weight;
	private boolean standard, youth;
	
	public PuckP1(double t, double r, double w)
	{
		super(t, r);
		weight = w;
		
		if (4.5 >= weight && weight >= 4 == true)
		{
			standard = false;
			youth = true;
		}
		else if (5.5 >= weight && weight >= 5 == true)
		{
			standard = true;
			youth = false;
		}
		else
		{
			standard = false;
			youth = false;
		}
	}
	
	public double getWeight()
	{
		return(weight);
	}
	
	public String getDivision() 
	{
		
		if (standard == true && youth == false && 2 * super.getRadius() == 3 && super.getThickness() == 1)
		{
			return("Standard puck.");
		}
		else if (standard == false && youth == true && 2 * super.getRadius() == 3 && super.getThickness() == 1)
		{
			return("Youth puck.");
		}
		else
		{
			return("Defected puck.");
		}
		
	}
	
	public boolean equals(Object p)
	{
		PuckP1 testObj = (PuckP1)p;
		
		if (testObj.getThickness() == super.getThickness() && testObj.getRadius() == super.getRadius() && testObj.getWeight() == weight) 
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	
	public String toString()
	{
		String puckString;
		
		puckString = "The puck weighs " + weight + " ounces. " + super.toString();
		
		return(puckString);
	} 
	
}
