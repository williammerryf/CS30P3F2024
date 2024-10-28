package SkillBuilders;

public class Puck extends Disk implements Comparable
{
	private double weight;
	private boolean standard, youth;
	
	public Puck(double r, double t, double w)
	{
		super(t, r);
		weight = w;
		
		if (4.5 >= weight && weight >= 4)
		{
			standard = false;
			youth = true;
		}
		else if (5.5 >= weight && weight >= 5)
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
		
		if (standard && super.getRadius() == 1.5 && super.getThickness() == 1.0)
		{
			return("Standard puck.");
		}
		else if (youth && super.getRadius() == 1.5 && super.getThickness() == 1.0)
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
		Puck testObj = (Puck)p;
		
		if (testObj.getThickness() == super.getThickness() && testObj.getRadius() == super.getRadius() && testObj.getWeight() == weight) 
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	
	/*
	 * 
	 * Puck part 2
	 * 
	 * */
	public int compareTo(Object p)
	{
		Puck testObj = (Puck)p;
		
		if (weight == testObj.getWeight())
		{
			return(0);
		}
		else if (weight > testObj.getWeight())
		{
			return(1);
		}
		else
		{
			return(-1);
		}
	}
	
	public String toString()
	{
		String puckString;
		
		puckString = "The puck weighs " + weight + " ounces. " + super.toString();
		
		return(puckString);
	} 
	
}
