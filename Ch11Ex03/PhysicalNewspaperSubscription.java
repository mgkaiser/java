// Author: Michael Kaiser 
// Class: 	COM-209-OL01

import java.lang.IllegalArgumentException;

public class PhysicalNewspaperSubscription extends NewspaperSubscription 
{
	public void set_Address(String value) throws IllegalArgumentException
	{
		if (CountDigits(value) > 0)
		{
			_rate = 15;
		}
		else
		{
			_rate = 0;
			throw new IllegalArgumentException("There must be at least one digit in the address.");
		}
		_address = value;
	}
	public String get_SubscriptionType()
	{
		return "physical";
	}
	
	private int CountDigits(String value)
	{
		int result = 0;
		
		for (int i = 0; i < value.length(); i++)
		{
			if (Character.isDigit(value.charAt(i))) result++;
		}
		
		return result;
	}
}