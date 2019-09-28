// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

public class DemoPoems
{
	public static void main(String[] args)
	{				
		Poem[] poems = get_Poems();
		for (int i = 0; i < poems.length; i++)
		{
				System.out.println(poems[i].get_Description());
		}
	}
	
	private static Poem[] get_Poems()
	{
		return new Poem[] {
			new Couplet("A Simple Couplet"),
			new Limerick("An Irish Drinking Poem"),
			new Haiku("An Old Silent Pond")
		};
	}	

}