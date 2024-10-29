package MasteryExercise1;

public class Staff extends UEmployee
{
	private String jobTitle = "";
	
	public Staff(String n, double s, String j)
	{
		super(n, s);
		jobTitle = j;
	}
	
	public String getDepartment()
	{
		return(jobTitle);
	}
	
	public String toString()
	{
		String staffString;
		
		staffString = super.toString() + ". They're a/the " + jobTitle + ".";
		
		return(staffString);
	}
}
