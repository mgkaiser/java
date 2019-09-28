// Author: Michael Kaiser 
// Class: 	COM-209-OL01

public abstract class NewspaperSubscription
{
	protected String _name;
	protected String _address;
	protected double _rate;
	
	public String get_Name()
	{
		return _name;
	}
	
	public void set_Name(String value)
	{
		_name = value;
	}
	
	public String get_Address()
	{
		return _address;
	}
	
	public double get_Rate()
	{
		return _rate;
	}
			
	public abstract void set_Address(String value);
	
	public abstract String get_SubscriptionType();
	
	public String get_Description()
	{
		return get_Name() + " has a " + get_SubscriptionType() + " subscription for $" + String.format("%.2f", get_Rate()) + " being sent to " + get_Address();
	}
}
