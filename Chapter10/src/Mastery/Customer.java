package Mastery;

public class Customer {

	private String firstN, lastN;
	
	/**
	 * constructor
	 * pre: none
	 * post: A Customer object has been created. 
	 * Customer data has been initialized with parameters.
	 */
	
	public Customer(String fN, String lN) {
		
		firstN = fN;
		lastN = lN;
		
	}
	
	/** 
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Customer object has 
	 * been returned.
	 */
	
	public String toString() {
		String custString;
		custString = " " + firstN + " " + lastN + " ";
		return(custString);
	}

}
