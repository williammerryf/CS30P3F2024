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
	public void size(Node n)
	{
		int counter = 0;
		
		toString();
		String[] words = toString().split('\n'); // fix copy from the file word count thing
		while(n != null)
		{
			counter ++;
			n = Node
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















