// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

public class Candle
{
	protected double _height;
	protected String _color;
	
	public Candle(double height, String color)
	{
		_height = height;
		_color = color;
	}
	
	public double get_Height()
	{
		return _height;
	}
	
	public void set_Height(double value)
	{
		_height = value;
	}
	
	public String get_Color()
	{
		return _color;
	}
	
	public void set_Color(String value)
	{
		_color = value;
	}
	
	public double get_Price()
	{
		return _height * 2.0;
	}
	
	public String get_CandleType()
	{
		return "Candle";
	}
	
	public String get_Description()
	{
		return "A " + get_Height() + " inch tall " + get_Color() + " " + get_CandleType() + " for $" + String.format("%.2f", get_Price());
	}
}