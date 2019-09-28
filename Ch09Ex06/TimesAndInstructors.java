// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

import java.util.Scanner;

public class TimesAndInstructors
{		
	static final int NUMBER_OF_COURSES=6;

	public static void main(String[] args)
	{								
		String[][] courses = GetCourses();
		
		Scanner keyboard = new Scanner(System.in);

		String courseNumber = "";
		do
		{
			System.out.println();
			System.out.print("Please enter a course number: ");
			courseNumber = keyboard.nextLine();
			
			if (!courseNumber.equals(""))
			{
				DisplayCourse(courses, courseNumber);
			}
		} while (!courseNumber.equals(""));
		
	}
	
	public static void DisplayCourse(String[][] courses, String courseNumber)
	{
		boolean first = true;
		for(int i = 0; i < NUMBER_OF_COURSES; i++)
		{
			if (courses[i][0].equals(courseNumber))
			{
				if (first)
				{
					System.out.println(courseNumber + " is available at the following time(s):");
					first=false;
				}
				System.out.println(courses[i][1]);
			}
		}
		if (first)
		{
			System.out.println(courseNumber + " is not available.");
		}
	}
	
	public static String[][] GetCourses()
	{
		return new String[][] {
			{"PHI210", "Hunnicutt, Monday 9am"},
			{"PHI210", "Pierce, Monday 10am"},
			{"COM209", "Burns, Tuesday 10am"},
			{"REL223", "O'Reilly, Tuesday 11am"},
			{"COM140", "Winchester, Wednesday 10am"},
			{"SOC110", "Potter, Wednesday 10am"}
		};
	}
		
}