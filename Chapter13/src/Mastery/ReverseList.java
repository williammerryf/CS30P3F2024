/*

Program: ReverseList.java          Last Date of this Revision: November 19, 2024

Purpose: Collect a set of integers from the user and display a reversed set of the integers using a stack.

Author: William Merryfield 
School: CHHS
Course: CSE3110 - Iterative Algorithm 1

*/

package Mastery;

//Import section
import Stack2And3_SkillBuilders.Stack3;
import java.util.*;

public class ReverseList {

	public static void main(String[] args) 
	{
		//Declaration section
		int number = 0, counter = 0;
		Stack3 stack = new Stack3();
		Scanner input = new Scanner(System.in);

		//While loop to take in a set of integers from user
		while(true)
		{
			System.out.println("Enter a number (999 to quit): ");
			number = input.nextInt();
			stack.push(number); //Push to stack
			counter++; //Update counter variable
			
			if (number == 999) //Break condition
			{
				stack.pop(); //Pops 999
				break;
			}
			else if(counter >= 10) //Break Condition
			{
				break;
			}
			
		}
		
		input.close(); //Close user input
		
		System.out.print("The list reversed is:");
		
		//For loop to print the top of the stack then pop it, repeating this until the stack is empty
		for(int i = stack.size() - 1; i > -1; i--)
		{
			System.out.print(" " + stack.top());
			stack.pop();
		}
		
	}

}

/*

Test Cases

Test Case 1

Enter a number (999 to quit): 
1
Enter a number (999 to quit): 
2
Enter a number (999 to quit): 
3
Enter a number (999 to quit): 
999
The list reversed is: 3 2 1


Test Case 2

Enter a number (999 to quit): 
1
Enter a number (999 to quit): 
2
Enter a number (999 to quit): 
3
Enter a number (999 to quit): 
4
Enter a number (999 to quit): 
5
Enter a number (999 to quit): 
6
Enter a number (999 to quit): 
7
Enter a number (999 to quit): 
8
Enter a number (999 to quit): 
9
Enter a number (999 to quit): 
10
The list reversed is: 10 9 8 7 6 5 4 3 2 1

*/
