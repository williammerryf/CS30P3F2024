package Queue2And3_SkillBuilders;

public class Queue2 
{
	
	private Object[] data;
	private int front, rear, maxSize;
	
	public Queue2(int maxItems)
	{
		data = new Object[maxItems];
		front = -1;
		rear = -1;
		maxSize = maxItems;
	}
	
	public Object front()
	{
		return(data[front]);
	}
	
	public Object dequeue()
	{
		if (front == rear) 
		{					
			makeEmpty(); // make method
		}
		else
		{
			front = (front + 1) % maxSize;
		}
		
		return(data[front - 1]);
	}
	
}
