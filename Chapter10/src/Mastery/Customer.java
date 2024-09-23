package Mastery;

public class Customer {

	private String firstN, lastN;
	
	public Customer(String fN, String lN) {
		
		firstN = fN;
		lastN = lN;
		
	}
	
	public String toString() {
		String custString;
		custString = firstN + " " + lastN;
		return(custString);
	}

}
