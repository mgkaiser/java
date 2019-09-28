// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

public class IncreasedProduction
{
	static final double RATE_OF_INCREASE = 0.06;
	static final double BONUS_THRESHOLD = 7000;
	
	public static void main(String[] args)
	{
		boolean bonusHasBeenPaid = false;
		double production = 4000;
				
		for (int i = 1; i <= 24; i++)
		{
			boolean payBonus =  production > BONUS_THRESHOLD && !bonusHasBeenPaid;
			DisplayProduction(i, production, payBonus);
			
			if (payBonus)
			{
				bonusHasBeenPaid = true;
			}
			
			production *= (1 + RATE_OF_INCREASE);
		}
	}
				
	public static void DisplayProduction(int month, double production, boolean payBonus)
	{
		System.out.print("In month " + month + " production was " +  String.format("%.0f", Math.floor(production)) + " parts.");
		if (payBonus)
		{
			System.out.println(" Pay out bonus.");
		}
		else
		{
			System.out.println();
		}
	}	
}