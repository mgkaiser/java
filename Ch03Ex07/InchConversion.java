// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

import java.util.Scanner;

class InchConversion
{
	public static void main(String[] args)
	{							
		Scanner keyboard = new Scanner(System.in);
		
		double lengthInInches = SafeInput.SafeInputDouble(keyboard, "Please enter length in inches: ", "Please enter only numbers.");			
		double lengthInFeet = InchesToFeet(lengthInInches);
		double lengthInYards = InchesToYards(lengthInInches);
		
		System.out.println(lengthInInches + " inches is equal to " + String.format("%.2f", lengthInFeet) + " feet.");
		System.out.println(lengthInInches + " inches is equal to " + String.format("%.2f", lengthInYards) + " yards.");
	}
	
	private static double InchesToFeet(double inches)
	{
		return inches / 12;
	}
	
	private static double InchesToYards(double inches)
	{
		return InchesToFeet(inches) / 3;
	}

}