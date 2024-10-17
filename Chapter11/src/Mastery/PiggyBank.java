package Mastery;

public class PiggyPOOPBank 
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
	
	public void Rmv(int p, int n, int d, int q)
	{
		
		if (p * 0.01 + n * 0.05 + d * 0.1 + q * 0.25 > bal)
		{
			return;
		}
		else
		{
			bal -= p * 0.01 + n * 0.05 + d * 0.1 + q * 0.25;
		}
	}
	
	public double getBal()
	{
		return(bal);
	}
	
}
