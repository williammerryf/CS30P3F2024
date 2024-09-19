package demos;

import java.util.Random;

public class test {

	public static void main(String[] args) 
	{

		Random r = new Random();
		int num1 = r.nextInt(2);
		int num2 = r.nextInt(2);
		int num3 = r.nextInt(2);
		
		System.out.print(num1);
		System.out.print(num2);
		System.out.print(num3);
		
		int num = r.nextInt(2);
		System.out.print(num);
		
	}

}
