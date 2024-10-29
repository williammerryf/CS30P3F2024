package MasteryExercise1;

public abstract class UEmployee 
{
	private String name;
	private double salary;
	
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
		empString = "The employee name and salary respectively is: " + name + ", $" + salary;
		return(empString);
	}
}
