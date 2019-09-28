// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

import java.util.Scanner;

class PaintCalculator
{
	private static final double COVERAGE_PER_GALLON = 350;
	private static final double PRICE_PER_GALLON = 32;
	
	public static void main(String[] args)
	{							
		Scanner keyboard = new Scanner(System.in);
		
		double roomWidth = SafeInputDouble(keyboard, "Enter the width of your room in feet: ", "Please only enter numbers.");
		double roomLength = SafeInputDouble(keyboard, "Enter the length of your room in feet: ", "Please only enter numbers.");
		double roomHeight = SafeInputDouble(keyboard, "Enter the height of your ceilings in feet: ", "Please only enter numbers.");
		
		CalculatePaint(roomWidth, roomLength, roomHeight);
		
	}
			
	private static double SafeInputDouble(Scanner scanner, String prompt, String errorMessage)
	{
		double result = -1;
		while (result < 0)
		{
			try
			{			
				System.out.print(prompt);
				result = scanner.nextDouble();
				System.out.println();
				
			}
			catch (java.util.InputMismatchException ex)
			{
				System.out.println(errorMessage);
				System.out.println();
				result = -1;
				scanner.nextLine();
			}
		}
		return result;
	}
	
	public static void CalculatePaint(double roomWidth, double roomLength, double roomHeight)
	{
		double wallArea = WallArea(roomWidth, roomLength, roomHeight);
		double gallonsToCoverArea = GallonsToCoverArea(wallArea);
		double totalPaintCost = TotalPaintCost(gallonsToCoverArea);
		
		System.out.println("Your room is " + String.format("%.2f", roomWidth) + " ft x " + String.format("%.2f", roomLength) + " ft with a ceiling height of " + String.format("%.2f", roomHeight) + " ft.");
		System.out.println("That is " + String.format("%.2f", wallArea) + " sq/ft of wall area.");
		System.out.println("You will need " + String.format("%.0f", gallonsToCoverArea)  + " gallons of paint to cover that area.");
		System.out.println("That will cost $" + String.format("%.2f", totalPaintCost) + " .");		
	}
	
	private static double WallArea(double roomWidth, double roomLength, double roomHeight)
	{
		return (roomWidth * roomHeight * 2) + (roomLength * roomHeight * 2);
	}	
	
	private static double GallonsToCoverArea(double wallArea)
	{		
		return Math.ceil(wallArea / COVERAGE_PER_GALLON);
	}
	
	private static double TotalPaintCost(double numberOfGallons)
	{
		return numberOfGallons * PRICE_PER_GALLON;
	}
}