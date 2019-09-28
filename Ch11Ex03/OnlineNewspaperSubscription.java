// Author: Michael Kaiser 
// Class: 	COM-209-OL01

import java.lang.IllegalArgumentException;

public class OnlineNewspaperSubscription extends NewspaperSubscription
{
	public void set_Address(String value) throws IllegalArgumentException
	{
		if (CountAtSigns(value) > 0)
		{
			_rate = 9;
		}
		else
		{
			_rate = 0;
			throw new IllegalArgumentException("There must be at least one at sign in the address.");
		}
		_address = value;
	}
	public String get_SubscriptionType()
	{
		return "online";
	}
	
	private int CountAtSigns(String value)
	{
		int result = 0;
		
		for (int i = 0; i < value.length(); i++)
		{
			if (value.charAt(i) == '@') result++;
		}
		
		return result;
	}
}