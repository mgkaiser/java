// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

public class DemoCandles
{
	public static void main(String[] args)
	{				
		Candle[] candles = get_Candles();
		for (int i = 0; i < candles.length; i++)
		{
			System.out.println(candles[i].get_Description());
		}
	}
	
	private static Candle[] get_Candles()
	{
		return new Candle[] {
			new Candle(1, "Red"),
			new Candle(2, "Orange"),
			new Candle(3, "Yellow"),
			new ScentedCandle(4, "Green"),
			new ScentedCandle(5, "Blue"),
			new ScentedCandle(6, "Green"),
			new ScentedCandle(7, "Violet")
		};
	}	

}