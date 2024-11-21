package Mastery;

/*

Program: StackList.java          Last Date of this Revision: November 21, 2024

Purpose: An application that makes a stack class using a linked list.

Author: William Merryfield 
School: CHHS
Course: CSE3110 - Iterative Algorithm 1
 

*/

// Import linked list from skillbuilders
import LinkedListParts123_SkillBuilders.LinkedList;

public class StackList 
{
	// Variables
	private LinkedList list;
	private int top;
	
	// Constructor
	public StackList()
	{
		
		list = new LinkedList();
		top = 0; // Stack size
		list.addAtFront("placeholder"); // Placeholder so that the stack doesn't run into a node = null therefore can't run error
		
	}
	
	// Get top of the Stack
	public Object top()
	{
		
		return(list.getEnd()); // Since a Stack is last in first out, the most recently pushed object will be at the end of the list
		// Due to how the push method is coded
		
	}
	
	// Remove top of Stack
	public Object pop()
	{
		Object topItem; // Object variable to keep track of the top item in Stack
		topItem = list.getEnd();

		top --; // Decrease size by one
		
		// Has to be less than or equal to 2 becuase if not then the node 'current' in the linked list will be null and the code won't work
		// Have to use placeholder to prevent the node from reading as null and leading as an error
		if(list.size() <= 2) 
		{
			
			topItem = list.getFront(); // The front of the list is also the end / A.K.A last pushed object
			list.addAtFront("placeholder"); // Prevent null node error
			list.remove(list.getEnd()); // Remove the end which is the top item variable

		}
		// Getting top object when list is greater than 2
		// Top object is at end of the list
		else
		{
			topItem = list.getEnd();
			list.remove(list.getEnd());
		}
		
		// Return
		return(topItem);
	}
	
	// Push objects to stack
	public void push(Object item)
	{
		// Linked list methods are made for string variables 
		String s = "" + item; // Empty string variable that adds the object to it which turns the object to a string
		top ++; // Increase size
		
		// Same placeholder reasoning, holds the code together
		// Placeholder variable is the only object in the list so it gets removed when another object gets added
		if(list.size() <= 1) 
		{
			list.addAtEnd(s);
			list.remove("placeholder");
		}
		// If the stack is bigger than one then objects are pushed to the end of the list
		else
		{
			list.addAtEnd(s);
		}

	}
	
	// Check if the stack is empty
	// Return true if it is, false if it isn't
	public boolean isEmpty()
	{
		if(list.size() == 0)
		{
			return(true);
		}
		else
		{
			return(false);
		}
	
	}
		
	// Return size of the stack
	public int size()
	{
		return(top);
	
	}
	
	// Remove all items in the stack
	// Update top to match size
	public void makeEmpty()
	{
		list.makeEmpty();
		top = 0;
	}
		
}
