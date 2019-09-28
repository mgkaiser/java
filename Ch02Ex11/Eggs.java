// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

import javax.swing.JOptionPane;
public class Eggs
{
	static final float PRICE_PER_DOZEN = 3.25f;
	static final float PRICE_PER_EGG = 0.45f;	
		
	public static void main(String[] args)
	{	
		int numberOfEggs = -1;
		
		// Continue until they enter 0 
		while (numberOfEggs != 0)
		{
			// Ask the user how many eggs they want, loop until they give you a number
			numberOfEggs = -1;
			while (numberOfEggs == -1)
			{
				try
				{
					numberOfEggs = Integer.parseInt(JOptionPane.showInputDialog(null, "How many eggs would you like? (0 to quit)"));
					
					// Make sure they didn't enter a negative number of eggs
					if (numberOfEggs < 0)
					{
						JOptionPane.showMessageDialog(null, "Enter a positive number.");
						numberOfEggs = -1;
					}					
				}
				catch (Exception e)
				{
					JOptionPane.showMessageDialog(null, "Enter a number");
					numberOfEggs = -1;
				}
			}
			
			if (numberOfEggs > 0)
			{
		
				// How many complete dozens?
				int dozensOfEggs;
				dozensOfEggs = numberOfEggs / 12;
				
				// How many single eggs
				int singleEggs;
				singleEggs = numberOfEggs % 12;
				
				// Calculate the total cost of eggs
				float totalCostOfEggs;
				totalCostOfEggs = (dozensOfEggs * PRICE_PER_DOZEN) + (singleEggs * PRICE_PER_EGG);
				
				// Display the results
				JOptionPane.showMessageDialog(null, "You ordered " + numberOfEggs + " eggs. That's " + dozensOfEggs + " dozen eggs at $" + PRICE_PER_DOZEN + " and " + singleEggs + " loose eggs at $" + PRICE_PER_EGG + " each for a total of $" + String.format("%.2f", totalCostOfEggs));
			}
		}
	}
}
	