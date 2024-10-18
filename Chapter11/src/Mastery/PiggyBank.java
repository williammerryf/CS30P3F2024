package Mastery;

public class PiggyBank 
{

	private double bal;
	
	public PiggyBank()
	{
		bal = 0;
	}
	
	public PiggyBank(double b)
	{
		bal = b;
	}
	
	public void Add(int p, int n, int d, int q)
	{
		bal += p * 0.01 + n * 0.05 + d * 0.1 + q * 0.25;
	}
	
	public void Rmv(double amt)
	{
		
		if (amt > bal)
		{
			return;
		}
		else
		{
			bal -= amt;
		}
	}
	
	public String getBal()
	{
		System.out.println(bal);
	}
	
}
