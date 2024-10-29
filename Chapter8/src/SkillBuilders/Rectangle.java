package SkillBuilders;

interface ComparableArea
{
	public int compareToArea(Object r);
}

public class Rectangle implements Comparable, ComparableArea
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
	
	public int compareTo(Object r)
	{
		Rectangle testObj = (Rectangle)r;
		
		if (testObj.getLength() == length && testObj.getWidth() == width) 
		{
			return(0);
		}
		else
		{
			return(1);
		}
	}
	
	public int compareToArea(Object r)
	{
		Rectangle testObj = (Rectangle)r;
		
		area = length * width;
		double testArea = testObj.getLength() * testObj.getWidth();
		
		if (area == testArea)
		{
			return(0);
		}
		else if (area > testArea)
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
		String rectString;
		
		rectString = "The rectangle is " + length + " units long and " + width + " units wide. The area is " + length * width + " units^2.";
		
		return(rectString);
	}

}
