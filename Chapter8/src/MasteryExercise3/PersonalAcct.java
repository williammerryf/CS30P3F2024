package MasteryExercise3;

public class PersonalAcct extends Account
{
	
	public PersonalAcct(double bal, String fName, String lName, String st, String c, String p, String pC)
	{
		super(bal, fName, lName, st, c, p, pC);
		
		if(super.getBalance() < 100)
		{
			super.withdrawal(2.00);
		}
	}
	
	public String toString()
	{
		String persAcctString;
		
		persAcctString = "Personal Account" + '\n' + super.toString();
		
		return(persAcctString);
	}
	
}
