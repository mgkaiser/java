// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

public class Student
{
	private String _studentId;
	private double _score;
	
	public Student(String studentId)
	{
		_studentId = studentId;
	}
	
	public String getStudentId()
	{
		return _studentId;
	}
	
	public double getScore()
	{
		return _score;
	}
	
	public void setScore(double value) throws ScoreException
	{
		if (value >=0 && value <=100)
		{
			_score = value;
		}
		else
		{
			_score = 0;
			throw new ScoreException();
		}		
	}
}
