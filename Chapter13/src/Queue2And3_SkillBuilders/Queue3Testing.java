package Queue2And3_SkillBuilders;

public class Queue3Testing {

	public static void main(String[] args) 
	{
	
		Queue3 q = new Queue3();
		
		System.out.println("Adding '1', 'red', and 'bob123' to queue." + '\n');
		
		q.enqueue("1");
		q.enqueue("red");
		q.enqueue("bob123");
		
		System.out.println("Size of queue: " + q.size());
		System.out.println("Front of queue: " + q.front());
		System.out.println("Erasing queue items." + '\n');
		
		q.makeEmpty();
		System.out.println("Size of queue: " + q.size() + '\n');
		
		System.out.println("Adding 'chicken' and 'william' to queue." + '\n');
		q.enqueue("chicken");
		q.enqueue("william");
		System.out.println("Size of queue: " + q.size());
		System.out.println("Front of queue: " + q.front());
		System.out.println("Dequeueing front item." + '\n');
		q.dequeue();
		
		System.out.println("Size of queue: " + q.size());
		System.out.println("Front of queue: " + q.front());
				
	}

}
