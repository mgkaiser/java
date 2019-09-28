// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

public class Course
{
	private String _department;
	private String _courseNumber;
	private double _numberOfCredits;
	
	public String getDepartment()
	{
		return _department;
	}	
	
	public String getCourseNumber()
	{
		return _courseNumber;
	}
	
	public double getNumberOfCredits()
	{
		return _numberOfCredits;
	}
	
	public Course(String department, String courseNumber, double numberOfCredits) throws CourseException
	{						
		if (department.length() != 3 || !isAlpha(department)) throw new CourseException("Department must contain exactly 3 letters", department, courseNumber, numberOfCredits);
		if (courseNumber.length() != 3 || !isDigits(courseNumber)) throw new CourseException("Course number must contain exactly 3 digits", department, courseNumber, numberOfCredits);
		if (numberOfCredits < 0.5 || numberOfCredits > 6) throw new CourseException("Number of credits must be between 0.5 and 6, inclusive.", department, courseNumber, numberOfCredits);
				
		_department = department;
		_courseNumber = courseNumber;
		_numberOfCredits = numberOfCredits;		
	}
	
	private boolean isAlpha(String value) {
		return value.matches("[a-zA-Z]+");
	}
	
	private boolean isDigits(String value) {
		return value.matches("[0-9]+");
	}
}