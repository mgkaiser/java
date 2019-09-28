// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;

public class SafeInput
{	
	public static double SafeInputDouble(Scanner scanner, String prompt, String errorMessage)
	{
		double result = 0;
		boolean validResult = false;
		while (!validResult)
		{
			try
			{			
				System.out.print(prompt);
				result = scanner.nextDouble();
				validResult = true;
				System.out.println();
				
			}
			catch (java.util.InputMismatchException ex)
			{
				System.out.println(errorMessage);
				System.out.println();
				validResult = false;
				scanner.nextLine();
			}
		}
		return result;
	}
	
	public static LocalDate SafeInputDate(Scanner scanner, String prompt, String errorMessage, String dateFormat)
	{
		LocalDate result = null;
		while (result == null)
		{
			try
			{							    
				System.out.print(prompt);
				result = new SimpleDateFormat(dateFormat)
					.parse(scanner.nextLine())
					.toInstant()
					.atZone(ZoneId.systemDefault())
					.toLocalDate();
				System.out.println();
				
			}
			catch (java.text.ParseException ex)
			{
				System.out.println(errorMessage);
				System.out.println();
				result = null;				
			}
		}
		return result;
	}
}
