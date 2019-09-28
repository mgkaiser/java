// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

public class Factorials
{
	public static void main(String[] args)
	{
		for (int i = 1; i <= 10; i++)
		{
			DisplayFactorial(i);
		}
	}
	
	public static int CalculateFactorial(int base)
	{
		int result = 1;	
		for (int i = 1; i <= base; i++)
		{
			result *= i;
		}				
		return result;
	}
		
	
	public static void DisplayFactorial(int base)
	{
		int result = CalculateFactorial(base);
		System.out.println(base + "! = " + result);
	}	
}