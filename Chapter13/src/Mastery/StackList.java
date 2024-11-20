package Mastery;

import LinkedListParts123_SkillBuilders.LinkedList;

public class StackList 
{
	private LinkedList list;
	private int top;
	
	public StackList()
	{
		
		list = new LinkedList();
		top = 0;
		
	}
	
	public Object top()
	{
		
		return(list.getEnd());
		
	}
	
	public Object pop()
	{
		Object topItem;
		
		topItem = list.getEnd();
		list.remove(list.getEnd());
		top --;
		
		if(list.size() <= 1) 
		{
			
			topItem = list.getFront(); // make this method - DONE
			list.remove(list.getFront());

		}
		else
		{
			topItem = list.getEnd();
			list.remove(list.getEnd());
		}
		
		return(topItem);
	}
	
	public void push(Object item)
	{
		String s = "" + item;
		top ++;
		
		if(list.size() <= 1) 
		{
			list.addAtFront(s);
		}
		else
		{
			list.addAtEnd(s);
		}

	}
	
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
		
	public int size()
	{
		return(top);
	
	}
	
	public void makeEmpty()
	{
		list.makeEmpty();
	}
	
	/*
	public String toString()
	{
		String stackString = "";
		LinkedList listCopy = list;
		
		for (int i = 0; i < listCopy.size(); i++) 
			{
			stackString += (listCopy.getEnd() + " ");   
			listCopy.remove(listCopy.getEnd());
			}
		
		return(stackString); 
	}
	*/
	
}
