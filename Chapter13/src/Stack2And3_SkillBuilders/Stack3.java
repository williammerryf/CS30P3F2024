package Stack2And3_SkillBuilders;

import java.util.ArrayList;

public class Stack3 
{
	private ArrayList<Object>data;
	private int top;
	
	public Stack3()
	{
		
		data = new ArrayList<Object>();
		top = -1;
		
	}
	
	public Object top()
	{
		return(data.get(top));
	}
	
	public Object pop()
	{
		Object topItem;
		
		topItem = data.get(top);
		data.remove(top);
		top -= 1;
		return(topItem);
	}
	
	public void push(Object item)
	{
		top += 1;
		data.add(top, item);
	}
	
	public boolean isEmpty()
	{
		if(top == -1)
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
		if(isEmpty())
		{
			return(0);
		}
		else
		{
			return(top + 1);
		}
	
	}
	
	public void makeEmpty()
	{
		top = -1;
	}
	
	public String toString()
	{
		String stackString = "";
		
		for (int i = 0; i < data.size(); i++) 
			{
			stackString += (data.get(i) + " ");   
			}
		
		return(stackString); 
	}
	
}