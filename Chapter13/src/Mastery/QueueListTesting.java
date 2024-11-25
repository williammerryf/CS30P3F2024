package Mastery;

/*

Program: QueueListTesting.java          Last Date of this Revision: November 25, 2024

Purpose: An application that tests the QueueList class.

Author: William Merryfield 
School: CHHS
Course: CSE3110 - Iterative Algorithm 1
 

*/

public class QueueListTesting {

	public static void main(String[] args) 
	{
		
		QueueList q = new QueueList();
		
		System.out.println("Adding '1', 'red', and 'bob123' to queue." + '\n');
		
		q.enqueue("1");
		q.enqueue("red");
		q.enqueue("bob123");
		
		System.out.println("Size of queue: " + q.size());
		System.out.println("Front of queue: " + q.front());
		System.out.println("Erasing queue items." + '\n');
		
		q.makeEmpty();
		System.out.println("Size of queue: " + q.size());
		
		if(q.isEmpty())
		{
			System.out.println("The queue is empty.");
		}
		else
		{
			System.out.println("The queue is not empty.");
		}
		
		System.out.println('\n' + "Adding 'chicken' and 'william' to queue." + '\n');
		q.enqueue("chicken");
		q.enqueue("william");
		System.out.println("Size of queue: " + q.size());
		System.out.println("Front of queue: " + q.front());
		System.out.println("Dequeueing front item." + '\n');
		q.dequeue();
		
		System.out.println("Size of queue: " + q.size());
		System.out.println("Front of queue: " + q.front());
		
		if(q.isEmpty())
		{
			System.out.println("The queue is empty.");
		}
		else
		{
			System.out.println("The queue is not empty.");
		}
	}

}

/* 

Test Cases

Test Case 1

Adding '1', 'red', and 'bob123' to queue.

Size of queue: 3
Front of queue: 1
Erasing queue items.

Size of queue: 0

Adding 'chicken' and 'william' to queue.

Size of queue: 2
Front of queue: chicken
Dequeueing front item.

Size of queue: 1
Front of queue: william

Test Case 2 - Added conditionals to test the isEmpty method

Adding '1', 'red', and 'bob123' to queue.

Size of queue: 3
Front of queue: 1
Erasing queue items.

Size of queue: 0
The queue is empty.

Adding 'chicken' and 'william' to queue.

Size of queue: 2
Front of queue: chicken
Dequeueing front item.

Size of queue: 1
Front of queue: william
The queue is not empty.





*/
