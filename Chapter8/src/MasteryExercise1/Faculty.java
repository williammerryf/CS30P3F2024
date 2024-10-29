package MasteryExercise1;

public class Faculty extends UEmployee
{
	private String department = "";
	
	public Faculty(String n, double s, String d)
	{
		super(n, s);
		department = d;
	}
	
	public String getDepartment()
	{
		return(department);
	}
	
	public String toString()
	{
		String facultyString;
		
		facultyString = super.toString() + ". They work in the " + department + " department.";
		
		return(facultyString);
	}
}