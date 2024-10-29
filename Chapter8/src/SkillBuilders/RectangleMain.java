package SkillBuilders;

public class RectangleMain {

	public static void main(String[] args) 
	{
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle(1, 1);
		Rectangle rect3 = new Rectangle(2, 3);
		
		System.out.println("Rectangle object 1, rect1");
		System.out.println(rect1.toString());
		System.out.println("");
		
		System.out.println("Rectangle object 2, rect2");
		System.out.println(rect2.toString());
		System.out.println("");
		
		System.out.println("Rectangle object 3, rect3");
		System.out.println(rect3.toString());
		System.out.println("");
		
		
		System.out.println("----------------compareTo-------------------");
		
		if (rect1.compareTo(rect2) == 0)
		{
			System.out.println("rect1 and rect2 in terms of length and width are equal");
		}
		else if (rect1.compareTo(rect2) != 0)
		{
			System.out.println("rect1 and rect2 in terms of length and width aren't equal");
		}
		else if (rect1.compareTo(rect3) == 0)
		{
			System.out.println("rect1 and rect3 in terms of length and width are equal");
		}
		else if (rect1.compareTo(rect3) != 0)
		{
			System.out.println("rect1 and rect3 in terms of length and width aren't equal");
		}
		
		System.out.println("");
		System.out.println("----------------compareToArea when equal-------------------");
		
		if (rect1.compareToArea(rect2) == 0)
		{
			System.out.println("rect1 and rect2 in terms of area are equal");
		}
		else if (rect1.compareToArea(rect2) == 1)
		{
			System.out.println("rect1 area is bigger than rect2 area");
		}
		else if (rect1.compareToArea(rect2) == -1)
		{
			System.out.println("rect1 area is smaller than rect2 area");
		}
		
		System.out.println("");
		System.out.println("----------------compareToArea when smaller-------------------");
		
		if (rect1.compareToArea(rect3) == 0)
		{
			System.out.println("rect1 and rect3 in terms of area are equal");
		}
		else if (rect1.compareToArea(rect3) == 1)
		{
			System.out.println("rect1 area is bigger than rect3 area");
		}
		else if (rect1.compareToArea(rect3) == -1)
		{
			System.out.println("rect1 area is smaller than rect3 area");
		}
		
		System.out.println("");
		System.out.println("----------------compareToArea when bigger-------------------");
		
		if (rect3.compareToArea(rect1) == 0)
		{
			System.out.println("rect3 and rect1 in terms of area are equal");
		}
		else if (rect3.compareToArea(rect1) == 1)
		{
			System.out.println("rect3 area is bigger than rect1 area");
		}
		else if (rect3.compareToArea(rect1) == -1)
		{
			System.out.println("rect3 area is smaller than rect1 area");
		}
	}

}
