// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

public class Poem 
{
	protected String _name;
	protected int _lines;
	
	public Poem(String name, int lines)
	{
		_name = name;
		_lines = lines;
	}
	
	public String get_Name()
	{
		return _name;
	}
	
	public int get_Lines()
	{
		return _lines;
	}		
		
	public String get_PoemType()
	{
		return "poem";
	}
	
	public String get_Description()
	{
		return "The " + get_PoemType() + " '" + get_Name() +"' has " + get_Lines() + " lines";
	}
}