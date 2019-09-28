// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

public class ValidPasswordResult
{	
	private boolean hasEnoughLowercase;
	private boolean hasEnoughUppercase;
	private boolean hasEnoughDigits;	
			
	public boolean getIsValid()
	{
		return hasEnoughDigits && hasEnoughLowercase && hasEnoughUppercase;
	}
	
	public void setHasEnoughLowercase(boolean value)
	{
		hasEnoughLowercase = value;
	}
	
	public boolean getHasEnoughLowercase()
	{
		return hasEnoughLowercase;
	}	
	
	public void setHasEnoughUppercase(boolean value)
	{
		hasEnoughUppercase = value;
	}
	
	public boolean getHasEnoughUppercase()
	{
		return hasEnoughUppercase;
	}
	
	public void setHasEnoughDigits(boolean value)
	{
		hasEnoughDigits = value;
	}
	
	public boolean getHasEnoughDigits()
	{
		return hasEnoughDigits;
	}
}