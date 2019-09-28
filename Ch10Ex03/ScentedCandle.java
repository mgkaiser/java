// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

public class ScentedCandle extends Candle
{
	public ScentedCandle(double height, String color)
	{
		super(height, color);
	}
	
	@Override
	public double get_Price()
	{
		return _height * 3.0;
	}
	
	@Override
	public String get_CandleType()
	{
		return "Scented Candle";
	}
}