// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

public class Couplet extends Poem 
{
	public Couplet(String name)
	{
		super(name, 2);		
	}
	
	@Override
	public String get_PoemType()
	{
		return "couplet";
	}
}