package MasteryExercise3;

/**
 * Customer class.
 */

public class Customer {
	private String firstName, lastName;

	//create String variables street, city, province, postal code - DONE
	private String street, city, province, postalCode;
	
	/**
	 * constructor
	 * pre: none
	 * post: A Customer object has been created. 
	 * Customer data has been initialized with parameters.
	 */
	public Customer(String fName, String lName, String st, String c, String p, String pC) //modify constructor to include street, city, province, postal code - DONE
	{
		firstName = fName;
		lastName = lName;

		//reflect the changes in the parameter - DONE
		street = st;
		city = c;
		province = p;
		postalCode = pC;
	}
	

	//create changeCity method that asks the user their city and records city in a variable above - DONE
	public void changeCity(String nC)
	{
		city = nC;
	}
	
	//create changeStreet method that asks the user their street and records street in a variable above - DONE
	public void changeStreet(String nSt)
	{
		street = nSt;
	}
	
	//create changeProvince method that asks the user their province and records province in a variable above - DONE
	public void changeProvince(String nP)
	{
		province = nP;
	}
	
	//create changePostalCode method that asks the user their postal code and records postal code in a variable above - DONE
	public void changePostalCode(String nPC)
	{
		postalCode = nPC;
	}
	
	public String getCity()
	{
		return(city);
	}

	public String getStreet()
	{
		return(street);
	}
	
	public String getProvince()
	{
		return(province);
	}
	
	public String getPostalCode()
	{
		return(postalCode);
	}

	/** 
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Customer object has 
	 * been returned.
	 */
	public String toString() {
		String custString;

		//update this string so that it contains the street, city, province, and postal code - DONE
		custString = firstName + " " + lastName + "\n"
				+ "Address: " + '\n' + street 
				+ '\n' + city + ", " + province + ", " + postalCode;
		
	 	return(custString);
	}

}



