// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

import java.time.*;

class TestMonthHandling
{	
	public static void main(String[] args)
	{											
		DisplayDate(LocalDate.of(2019, Month.JANUARY, 31));
		DisplayDate(LocalDate.of(2019, Month.DECEMBER, 31));
	}
	
	private static void DisplayDate(LocalDate date)
	{
		System.out.println("The date specified is " + date + ".");
		for (int i = 1; i <= 3; i++)
		{
			System.out.println("After adding " + i + " months the date is " + date.plusMonths(i) + ".");
		}
		System.out.println();
	}
}