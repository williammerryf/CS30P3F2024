package MasteryExercise1;

import java.text.NumberFormat;

public class University {

	public static void main(String[] args) 
	{
		NumberFormat money = NumberFormat.getCurrencyInstance();
		
		Faculty emp1 = new Faculty("Bobby Smith", 50000, "Janitorial");
		Staff emp2 = new Staff("Jack Jones", 100000, "Headmaster");
		
		System.out.println(emp1);
		System.out.println(emp2);
		
	}

}
