package SkillBuilders;

public abstract class Disk extends Circle 
{
	private double thickness;

	// Constructor
	public Disk(double r, double t)
	{
		super(r);
		thickness = t;
	}
	
	public void setThickness(double newThickness)
	{
		thickness = newThickness;
	}
	
	public double getThickness()
	{
		return(thickness);
	}
	
	public double volume() 
	{
		double v;
		
		v = super.Area() * thickness;
		return(v);
	}
	
	public boolean equals(Object d)
	{
		Disk testObj = (Disk)d;
		
		if (testObj.getRadius() == super.getRadius() && testObj.getThickness() == thickness) 
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
		String diskString;
		
		diskString = "The radius is " + super.getRadius() + "inches and the thickness is" + thickness + " inches.";
		
		return(diskString);
	}
}
