// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

import java.util.Scanner;

public class SafeInput
{	
	public static double SafeInputDouble(Scanner scanner, String prompt, String errorMessage)
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
}