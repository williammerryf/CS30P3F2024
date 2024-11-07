package Stack2And3_SkillBuilders;

public class Stack2Testing {

	public static void main(String[] args) 
	{
		
		Stack2 stack = new Stack2(2);
		
		StackObject1 obj1 = new StackObject1();
		StackObject2 obj2 = new StackObject2();
		
		System.out.println("Object 1: " + obj1 + '\n'
						   + "Object 2: " + obj2 + '\n');
		
		stack.push(obj1);
		stack.push(obj2);
		
		System.out.println("Top of stack: "+ stack.top() + "\n" 
						 + "Items in stack: "+ stack.size() + "\n"
						 + "Removing top item." + '\n');
		
		stack.pop();
		System.out.println("Top of stack: "+ stack.top() + "\n" 
				 + "Items in stack: "+ stack.size());
		
	}

}
