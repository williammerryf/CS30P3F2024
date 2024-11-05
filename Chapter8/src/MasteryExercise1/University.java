package MasteryExercise1;

/*

Program: University.java          Last Date of this Revision: November 5, 2024

Purpose: Main class to test the staff and faculty classes.

Author: William Merryfield 
School: CHHS
Course: Computer Science
Credit: CSE 3130 Object-Oriented Programming 2
 

*/

public class University {

	public static void main(String[] args) 
	{
		//Create a staff and faculty object
		Faculty emp1 = new Faculty("Bing Bong", 80000, "Science");
		Staff emp2 = new Staff("Joshua", 123456, "Proffessor");
		
		//Display staff and faculty object
		System.out.println(emp1);
		System.out.println(emp2);
		
	}

}
/*

Test Cases

//Test Case 1//

The employee name and salary respectively is: Bobby Smith, $50,000.00. They work in the Janitorial department.
The employee name and salary respectively is: Jack Jones, $100,000.00. They're a/the Headmaster.

//Test Case 2//

The employee name and salary respectively is: Bing Bong, $80,000.00. They work in the Science department.
The employee name and salary respectively is: Joshua, $123,456.00. They're a/the Proffessor.

*/