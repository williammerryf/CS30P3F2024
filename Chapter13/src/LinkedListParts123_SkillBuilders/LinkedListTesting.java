package LinkedListParts123_SkillBuilders;

public class LinkedListTesting {

	public static void main(String[] args) 
	{
		LinkedList list = new LinkedList();

		list.addAtFront("B");
		list.addAtFront("A");
		list.addAtEnd("C");
		list.addAtEnd("D");
		System.out.println("List has " + list.size() + " items.");
		System.out.println(list);
		System.out.println("mmmmmmmmmmmmm");
		System.out.println(list.getFront());
		System.out.println(list.getEnd());
		
		System.out.println("Removing D from list.");
		list.remove("D");
		
		System.out.println("Emptying list.");
		list.makeEmpty();
		System.out.println(list);
	}

}