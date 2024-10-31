package MasteryExercise3;

public class Bank {

	public static void main(String[] args) 
	{
		PersonalAcct pAcct = new PersonalAcct(2, "william", "merryfield", "street", "city", "province", "postal code");
		System.out.println(pAcct);
		pAcct.changeAddress("1", "1", "1", "1");
		System.out.println(pAcct);
	}
	
	// Make client code 
	// make menu and while loop so user can interact with the bank
	

}
