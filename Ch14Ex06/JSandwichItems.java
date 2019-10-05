// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

import java.text.NumberFormat;
import java.util.Locale;

public class JSandwichItems
{
	private String _description;
	private double _price;
	
	public JSandwichItems(String description, double price)
	{
		_description = description;
		_price = price;
	}
	
	public String getDescription()
	{
		return _description;
	}
	
	public double getPrice()
	{
		return _price;
	}
	
	@Override
	public String toString()
	{		
		return _description + " (" + NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(_price) + ")";
	}
}
