// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

public class JCapitalsItems
{
	private String _country;
	private String _capital;
	
	public JCapitalsItems(String country, String capital)
	{
		_country = country;
		_capital = capital;
	}
	
	public String getCountry()
	{
		return _country;
	}
	
	public String getCapital()
	{
		return _capital;
	}
	
	@Override
	public String toString()
	{		
		return _country;
	}
}
