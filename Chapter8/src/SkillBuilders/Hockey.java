package SkillBuilders;

public class Hockey {

	public static void main(String[] args) 
	{
		Puck puck = new Puck(1.0, 1.5, 4.5);
		
		System.out.println("Weight: " + puck.getWeight());
		System.out.println("Diameter: " + 2 * puck.getRadius());
		System.out.println("Thickness: " + puck.getThickness());
		System.out.println("Division: " + puck.getDivision());
		
		System.out.println("-------------------------");
		System.out.println(puck.toString());
		System.out.println("-------------------------");
		
		Puck puck2 = new Puck(1.0, 1.5, 4.5);
		
		if (puck.equals(puck2))
		{
			System.out.println("Objects are equal");
		}
		else
		{
			System.out.println("Objects are not equal");
		}
		
		/*
		 * 
		 * Puck part 2
		 * 
		 * */
		
		System.out.println("--------Part 2----------");
		
		if(puck.compareTo(puck2) == 0)
		{
			System.out.println("Objects are equal");
		}
		else if(puck.compareTo(puck2) < 0)
		{
			System.out.println("puck is smaller than puck2");
		}
		else
		{
			System.out.println("puck is bigger than puck2");
		}
		
		System.out.println(puck);
		System.out.println(puck2);
		
		System.out.println("-------------------------");
		
		Puck puck3 = new Puck(1.0, 1.5, 5.5);
		
		if(puck.compareTo(puck3) == 0)
		{
			System.out.println("Objects are equal");
		}
		else if(puck.compareTo(puck3) < 0)
		{
			System.out.println("puck is smaller than puck3");
		}
		else
		{
			System.out.println("puck is bigger than puck3");
		}
		
		System.out.println(puck);
		System.out.println(puck3);		
	}

}
