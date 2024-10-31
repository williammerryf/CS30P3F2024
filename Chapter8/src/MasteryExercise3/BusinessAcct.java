package MasteryExercise3;

public class BusinessAcct extends Account
{

	public BusinessAcct(double bal, String fName, String lName, String st, String c, String p, String pC)
	{
		super(bal, fName, lName, st, c, p, pC);
		
		if(super.getBalance() < 500)
		{
			super.withdrawal(10.00);
		}
	}
	
	public String toString()
	{
		String busAcctString;
		
		busAcctString = "Business Account" + '\n' + super.toString();
		
		return(busAcctString);
	}
	
}
