package Mastery;

/*

Program: QueueList.java          Last Date of this Revision: November 25, 2024

Purpose: An application that makes a queue class using a linked list.

Author: William Merryfield 
School: CHHS
Course: CSE3110 - Iterative Algorithm 1
 

*/

// Import linked list from skillbuilders
import LinkedListParts123_SkillBuilders.LinkedList;

public class QueueList 
{

	// Variables
	private LinkedList list;
	private int front, rear;

	// Constructor
	public QueueList()
	{
		list = new LinkedList();
		front = -1;
		rear = -1;
	}
	
	// Return the front of the queue by getting the front/head of the linked list
	public Object front()
	{
		return(list.getFront());
	}
	
	// Return and remove the front of the queue / head of the linked list
	public Object dequeue()
	{
		
		Object item;
		
		item = list.getFront();// Record the head of the linked list so it can be returned
		list.remove(list.getFront());// Remove the head
		
		// If the size of the queue is 1 data item
		if (front == rear) 
		{					
			makeEmpty(); 
		}
		else
		{
			rear -= 1;
		}
		
		return(item);
	}
	
	// Add a data item to the rear of the queue
	public void enqueue(Object item)
	{
		String s = "" + item;
		
		// Can't use list.addAtEnd(s); if the list is empty 
		if (isEmpty())
		{
			rear = 0;
			front = 0;
			list.addAtFront(s);
		}
		// Add to tail of the linked list
		else
		{
			rear += 1;
			list.addAtEnd(s);
		}
	}
	
	// Check if the queue is empty
	// Return true if it's empty, false if it isn't
	public boolean isEmpty()
	{
		if (front == -1 && rear == -1)
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	
	// Return the size of the queue / the amount items in the queue
	public int size()
	{
		if (isEmpty())
		{
			return(0);
		}
		else 
		{
			return(rear - front + 1);
		}
	}
	
	// Erase all items in the queue by emptying the nodes of the linked list
	public void makeEmpty()
	{
		list.makeEmpty();
		front = -1;
		rear = -1;
	}
	
}
