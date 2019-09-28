// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

import java.util.Scanner;

public class TestScore
{
	private static Student[] _students = new Student[] {
		new Student("1000"),
		new Student("2000"),
		new Student("3000"),
		new Student("4000"),
		new Student("5000")
	};
	
	public static void main(String[] args)
	{
		EnterScores();
		DisplayScores();		
	}	
	
	public static void EnterScores()
	{
		for (int i = 0; i < _students.length; i++)
		{
			EnterScore(_students[i]);
		}
	}
	
	public static void DisplayScores()
	{
		for (int i = 0; i < _students.length; i++)
		{
			DisplayScore(_students[i]);
		}
	}
	
	public static void EnterScore(Student student)
	{
		Scanner keyboard = new Scanner(System.in);
		
		double score = SafeInput.SafeInputDouble(keyboard, "Enter a score for student id " + student.getStudentId() + ": ", "Enter a valid number.");
	
		try
		{
			student.setScore(score);			
		}
		catch (ScoreException scoreException)
		{
			System.out.println("Score cannot be accepted and will be set to 0. " + scoreException.getMessage());
			System.out.println();
		}
	}
	
	public static void DisplayScore(Student student)
	{
		System.out.println("The score for student id " + student.getStudentId() + " is " + student.getScore() + ".");
	}
	
}