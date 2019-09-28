// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

public class ScoreException extends Exception
{
	public ScoreException() 
	{	
		super ("The score must be a number between 0 and 100");			
	}
}