package SkillBuilders;

//import java.lang.Math.*;

public abstract class Circle 
{
	private double radius;
	private double area;
	
	public Circle(double r)
	{
		radius = r;
	}
	
	public double Area()
	{
		area = radius * radius * Math.PI;
		return(area);
		
	}
	
	public double getRadius()
	{
		return(radius);
	}
	
	public double getArea()
	{
		return(area);
	}
	
	public String toString()
	{
		String circleString;
		circleString = "Respectively, the radius and area is " + radius + " and " + area + ".";
		return(circleString);
	}
	
}
