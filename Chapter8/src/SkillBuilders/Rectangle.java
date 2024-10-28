package SkillBuilders;

public class Rectangle implements Comparable
{
	private double length, width, area, perimeter;
	
	public Rectangle()
	{
		length = 1;
		width = 1;
	}
	
	public Rectangle(double l, double w)
	{
		length = l;
		width = w;
	}
	
	public double getLength()
	{
		return(length);
	}
	
	public double getWidth()
	{
		return(width);
	}
	
	public double Area()
	{
		area = length * width;
		
		return(area);
	}
	
	public String areaFormula()
	{
		return("Area = length * width");
	}
	
	public double Perimeter()
	{
		perimeter = length * 2 + width * 2;
		
		return(perimeter);
	}
	
	public boolean equals(Object r)
	{
		Rectangle testObj = (Rectangle)r;
		
		if (testObj.getLength() == length && testObj.getWidth() == width) 
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
		String rectString;
		
		rectString = "The rectangle is " + length + " units long and " + width + " units wide.";
		
		return(rectString);
	}
	
}
