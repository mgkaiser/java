// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

public class Limerick extends Poem 
{
	public Limerick(String name)
	{
		super(name, 5);		
	}
	
	@Override
	public String get_PoemType()
	{
		return "limerick";
	}
}