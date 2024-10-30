package MasteryExercise1;

import java.text.NumberFormat;

public abstract class UEmployee 
{
	private String name;
	private double salary;
	
	NumberFormat money = NumberFormat.getCurrencyInstance();
	
	public UEmployee(String n, double s)
	{
		name = n;
		salary = s;
	}
	
	public UEmployee()
	{
		name = "";
		salary = 0;
	}
	
	public double getSalary()
	{
		return(salary);
	}
	
	public String getName()
	{
		return(name);
	}
	
	public String toString()
	{
		String empString;
		empString = "The employee name and salary respectively is: " + name + ", " + money.format(salary);
		return(empString);
	}
}
