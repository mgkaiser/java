// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

// REQUIRES "SafeInput.java" to run.

import java.util.Scanner;
import java.time.*;

public class PastPresentFuture
{
	public static void main(String[] args)
	{				
		Scanner keyboard = new Scanner(System.in);
	
		LocalDate currentDate = LocalDate.now(ZoneId.systemDefault());
		LocalDate enteredDate = SafeInput.SafeInputDate(keyboard, "Enter a date in mm/dd/yyyy format: ", "Enter a valid date.", "MM/dd/yyyy");
		
		if (currentDate.getYear() == enteredDate.getYear())
		{
			int currentMonth = currentDate.getMonthValue();
			int enteredMonth = enteredDate.getMonthValue();
			
			// In this month
			if (currentMonth == enteredMonth)
			{
				System.out.println("The date entered is in this month.");
			}
			
			// In an earlier month this year
			if (currentMonth > enteredMonth)
			{
				System.out.println("The date entered is in an earlier month of this year.");
			}
			
			// In a later month this year
			if (currentMonth < enteredMonth)
			{
				System.out.println("The date entered is in a later month of this year.");
			}									
		}
		else
		{
			// Not in this year
			System.out.println("The date entered is not in this year.");
		}			
	}
}