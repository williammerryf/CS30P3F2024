package SkillBuilders;

public class Hockey {

	public static void main(String[] args) 
	{
		PuckP1 puck = new PuckP1(1, 1.5, 5.5);
		
		System.out.println("Weight: " + puck.getWeight());
		//System.out.println("Diameter: " + ); // Make a puck get diameter method
		System.out.println("Thickness: " + puck.getThickness());
		System.out.println("Division: " + puck.getDivision());

	}

}
