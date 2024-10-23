package ClassDemos;

// Manager inherit from parent Employee
public class Manager extends Employee
{
	private double yearlySalary;
	
	// Constructor method
	public Manager(String fN, String lN, double s)
	{
		super(fN, lN); // Super inherits from constructor of super class, super class is whats after EXTENDS
		yearlySalary = s;
		
	}
	
	// Accessor method for yearlySalary
	public double getYearlySalary()
	{
		return yearlySalary;
	}
	
	// Return manager pay for specified period
	public double pay(double weeks)
	{
		double payEarned;
		payEarned = yearlySalary / 52 * weeks;
		return(payEarned);
	}
	
	// toString returns employee name, title, and salary
	public String toString()
	{
		return(super.toString()
				+ ", Manager. "
				+ "Salary: "
				+ yearlySalary);
	}
	
}
