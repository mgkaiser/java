// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

public class CourseException extends Exception	
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
	
	public CourseException(String message, String department, String courseNumber, double numberOfCredits) 
	{	
		super (message);	
		_department = department;
		_courseNumber = courseNumber;
		_numberOfCredits = numberOfCredits;		
	}
}