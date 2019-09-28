// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

public class Haiku extends Poem 
{
	public Haiku(String name)
	{
		super(name, 3);		
	}
	
	@Override
	public String get_PoemType()
	{
		return "haiku";
	}
}