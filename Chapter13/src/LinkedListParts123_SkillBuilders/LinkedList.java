package LinkedListParts123_SkillBuilders;

public class LinkedList 
{
	private Node head;
	
	public LinkedList()
	{
		head = null;
	}
	
	public void addAtFront(String str)
	{
		Node newNode = new Node(str);
		newNode.setNext(head);
		head = newNode;
	}
	
	public void remove(String str)
	{
		Node current = head;
		Node previous = head;
		
		if (current.getData().equals(str))
		{
			head = current.getNext();
		}
		else
		{
			while(current.getNext() != null)
			{
				previous = current;
				current = current.getNext();
				
				if(current.getData().equals(str))
				{
					previous.setNext(current.getNext());
				}
			}
		}
	}
	
	//Part 1
	
	public int size()
	{
		int counter = 0;
		
		String[] words = toString().split("" + '\n');
		
		for (String s: words)
		{
			counter ++;
		}
		
		return(counter);
		
	}
	
	public String getEnd()
	{
		Node previous = head;
		Node current = head;
		current = current.getNext();
		previous = current;
		
		while((current.getNext() != null))
		{
	
			previous = current;
			current = current.getNext();

		}
		
		return current.getData();
		
	}
	
	public String getFront()
	{
        return head.getData();
	}
	
	//Part 2
	
	public void addAtEnd(String str)
	{
		Node newNode = new Node(str);
		Node current = head;
		
		while(current.getNext() != null)
		{
			current = current.getNext();
		}
		
		current.setNext(newNode);
		
	}
	
	//Part 3
	
	public void makeEmpty()
	{
		String[] words = toString().split("" + '\n');
		
		for (String s: words)
		{
			remove(s);
		}
	}
	
	public String toString()
	{
		Node current = head;
		String listString;
		
		if(current != null)
		{
			listString = current.getData() + '\n';
			while(current.getNext() != null)
			{
				current = current.getNext();
				listString += current.getData() + '\n';
			}
		return(listString);
		}
		else
		{
			return("There are no items in list.");
		}
	}
	
}















