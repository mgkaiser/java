// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

// REQUIRES "SafeInput.java" to run.

import java.util.Scanner;
import java.time.*;

public class PastPresentFuture2
{
	public static void main(String[] args)
	{				
		Scanner keyboard = new Scanner(System.in);
	
		LocalDate currentDate = LocalDate.now(ZoneId.systemDefault());
		LocalDate enteredDate = SafeInput.SafeInputDate(keyboard, "Enter a date in mm/dd/yyyy format: ", "Enter a valid date.", "MM/dd/yyyy");
		
		if (enteredDate.isBefore(currentDate))
		{
			System.out.println("The entered data is before the current date.");
		}
		
		if (enteredDate.isAfter(currentDate))
		{
			System.out.println("The entered data is after the current date.");
		}
		
		if (enteredDate.equals(currentDate))
		{
			System.out.println("The entered data is the current date.");
		}
				
	}
}