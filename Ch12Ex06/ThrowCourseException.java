// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

public class ThrowCourseException
{
	public static void main(String[] args)
	{
		Course[] courses = new Course[7];
		
		courses[0] = CreateCourse("COM","209",3);
		courses[1] = CreateCourse("COMCOM","209",3);
		courses[2] = CreateCourse("123","209",3);
		courses[3] = CreateCourse("COM","209209",3);
		courses[4] = CreateCourse("COM","ABC",3);
		courses[5] = CreateCourse("COM","209",7);
		courses[6] = CreateCourse("COM","209",0.1);
		
	}
	
	public static Course CreateCourse(String department, String courseNumber, double numberOfCredits)
	{
		Course newCourse = null;
		try
		{
			newCourse = new Course(department, courseNumber, numberOfCredits);
			System.out.println("Course " + newCourse.getDepartment() + newCourse.getCourseNumber() + " for " + newCourse.getNumberOfCredits() + " credits was successfully created.");
			return newCourse;
		}
		catch(CourseException courseException)
		{
			System.out.println("Course " + courseException.getDepartment() + courseException.getCourseNumber() + " for " + courseException.getNumberOfCredits() + " credits could not be created because " + courseException.getMessage() + ".");
		}
		finally
		{
			return newCourse;
		}
	}
}