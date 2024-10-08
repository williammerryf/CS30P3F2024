package SkillBuilders;

import java.text.NumberFormat;

public class StuName {

	private String fName, lName;
	
	public StuName(String fN, String lN)
	{	
		fName = fN;
		lName = lN;	
	}
	
	public String toString() {
		String stuNameString;
		stuNameString = fName + " " + lName;
		System.out.println(stuNameString);
		
		return(stuNameString);
	}
	
	
}
