package Mastery;

/*

Program: StackListTesting.java          Last Date of this Revision: November 21, 2024

Purpose: An application that serves to test the StackList class.

Author: William Merryfield 
School: CHHS
Course: CSE3110 - Iterative Algorithm 1
 

*/

public class StackListTesting {

	public static void main(String[] args) 
	{
		StackList stack = new StackList(); // Make new stack object

		System.out.println("New stack created" + '\n'
				 + "Stack size: " + stack.size() + '\n');
		
		// Push objects to stack
		stack.push("Bob1");
		stack.push("Will2");
		stack.push("Ling3");
		stack.push("Jang4");
		
		//print top of stack, pop the top, and repeat
		
		System.out.println("Top of stack: "+ stack.top() + "\n" 
				 + "Items in stack: "+ stack.size() + "\n"
				 + "Removing top item." + '\n');
		
		stack.pop();
		System.out.println("Top of stack: "+ stack.top() + "\n" 
				 + "Items in stack: "+ stack.size() + "\n"
				 + "Removing top item." + '\n');
		
		stack.pop();
		System.out.println("Top of stack: "+ stack.top() + "\n" 
				 + "Items in stack: "+ stack.size() + "\n"
				 + "Removing top item." + '\n');
		
		stack.pop();
		System.out.println("Top of stack: "+ stack.top() + "\n" 
				 + "Items in stack: "+ stack.size() + '\n'
				 + "Adding 'DingDong2'" + '\n');
		
		// Push new object to stack
		
		stack.push("DingDong2");
		
		System.out.println("Top of stack: "+ stack.top() + "\n" 
				 + "Items in stack: "+ stack.size() + '\n'
				 + "Emptying stack." + '\n'); 
		
		// Empty stack
		stack.makeEmpty();
		System.out.println("Items in stack: "+ stack.size());
		
	}

}

/*

Test Cases

Test 1

Top of stack: Jang4
Items in stack: 4
Removing top item.

Top of stack: Ling3
Items in stack: 3
Removing top item.

Top of stack: Will2
Items in stack: 2
Removing top item.

Top of stack: Bob1
Items in stack: 1
Adding 'DingDong2'

Top of stack: DingDong2
Items in stack: 2

Test Case 2

New stack created
Stack size: 0

Top of stack: Jang4
Items in stack: 4
Removing top item.

Top of stack: Ling3
Items in stack: 3
Removing top item.

Top of stack: Will2
Items in stack: 2
Removing top item.

Top of stack: Bob1
Items in stack: 1
Adding 'DingDong2'

Top of stack: DingDong2
Items in stack: 2
Emptying stack.

Items in stack: 0

*/
