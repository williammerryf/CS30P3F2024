package ClassDemos;

// Manager is an employee

public abstract class Employee // Abstract must use at least one abstract method
{
	private String firstName, lastName;
	
	//Constructor method
	public Employee(String fN, String lN)
	{
		firstName = fN;
		lastName = lN;
		
	}
	
	// toString, every class has to be able to print itself out in a unique format, unique to itself
	public String toString()
	{
		return(firstName + " " + lastName);
	}
	
	abstract double pay(double period);
	
}