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
		Object item;
		item = data[front];
		
		if (front == rear) 
		{					
			makeEmpty(); 
		}
		else
		{
			front = (front + 1) % maxSize;
		}
		
		return(item);
	}
	
	public void enqueue(Object item)
	{
		if (isEmpty())
		{
			rear = 0;
			front = 0;
			data[rear] = item;
		}
		else
		{
			rear = (rear + 1) % maxSize;
			data[rear] = item;
		}
	}
	
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
	
	public void makeEmpty()
	{
		front = -1;
		rear = -1;
	}
	
}
