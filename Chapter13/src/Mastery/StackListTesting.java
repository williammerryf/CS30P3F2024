package Mastery;

public class StackListTesting {

	public static void main(String[] args) 
	{
		StackList stack = new StackList();

		System.out.println(stack.size());
		stack.push("Bob1");
		stack.push("Will2");
		stack.push("Ling3");
		stack.push("Jang4");
		//System.out.println(stack);
		
		System.out.println("Top of stack: "+ stack.top() + "\n" 
						 + "Items in stack: "+ stack.size() + "\n"
						 + "Removing top item." + '\n');
		
		stack.pop();
		System.out.println("Top of stack: "+ stack.top() + "\n" 
				 + "Items in stack: "+ stack.size() + "\n"
				 + "Removing top item." + '\n');
		
		stack.pop();
		System.out.println("Top of stack: "+ stack.top() + "\n" 
				 + "Items in stack: "+ stack.size());
		
		stack.pop();
		System.out.println("Top of stack: "+ stack.top() + "\n" 
				 + "Items in stack: "+ stack.size());
		

	}

}
