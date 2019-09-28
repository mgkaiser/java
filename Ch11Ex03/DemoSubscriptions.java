// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

import java.lang.IllegalArgumentException;

public class DemoSubscriptions
{
	public static void main(String[] args)
	{
		try
		{
			PhysicalNewspaperSubscription goodPhysicalSubscription = new PhysicalNewspaperSubscription();
			goodPhysicalSubscription.set_Name("Benjamin Pierce");
			goodPhysicalSubscription.set_Address("1313 Mockingbird Lane");
			System.out.println(goodPhysicalSubscription.get_Description());
		}
		catch (IllegalArgumentException illegalArgumentException)
		{
			System.out.println(illegalArgumentException.getMessage());
		}
		
		try
		{
			PhysicalNewspaperSubscription badPhysicalSubscription = new PhysicalNewspaperSubscription();
			badPhysicalSubscription.set_Name("BJ Hunnicut");
			badPhysicalSubscription.set_Address("Mockingbird Lane");
			System.out.println(badPhysicalSubscription.get_Description());
		}
		catch (IllegalArgumentException illegalArgumentException)
		{
			System.out.println(illegalArgumentException.getMessage());
		}
		
		try
		{
			OnlineNewspaperSubscription goodOnlineSubscription = new OnlineNewspaperSubscription();
			goodOnlineSubscription.set_Name("Charles Winchester");
			goodOnlineSubscription.set_Address("somewhere@overtherainbow.com");
			System.out.println(goodOnlineSubscription.get_Description());
		}
		catch (IllegalArgumentException illegalArgumentException)
		{
			System.out.println(illegalArgumentException.getMessage());
		}
		
		try
		{
			OnlineNewspaperSubscription badOnlineSubscription = new OnlineNewspaperSubscription();
			badOnlineSubscription.set_Name("Sherman Potter");			
			badOnlineSubscription.set_Address("Something Stupid");
			System.out.println(badOnlineSubscription.get_Description());
		}
		catch (IllegalArgumentException illegalArgumentException)
		{
			System.out.println(illegalArgumentException.getMessage());
		}
		
		
		
		
	}		
}