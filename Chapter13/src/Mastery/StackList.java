package Mastery;

import java.util.ArrayList;

import LinkedListParts123_SkillBuilders.LinkedList;

public class StackList 
{
	private LinkedList list;// = new LinkedList();
	private int top;
	
	public StackList()
	{
		
		list = new LinkedList();
		top = -1;
		
	}
	
	public Object top()
	{
		list.
		
		
		
		
	}
	
	public Object pop()
	{
		Object topItem;
		
		topItem = data.get(top);
		data.remove(top);
		top --;
		return(topItem);
	}
	
	public void push(Object item)
	{
		String s = "" + item;
		top ++;
		list.addAtFront(s);
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
		return(list.size());
	
	}
	
	public void makeEmpty()
	{
		list.makeEmpty();
	}
}
