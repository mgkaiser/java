// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

import java.util.Scanner;

public class CountWords
{
	final static String SEPERATORS = " .,;?!-";
	
	public static void main(String[] args)
	{				
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter a string: ");
		String string = keyboard.nextLine();
	
		int words = CountWords(string);
		DisplayWordCount(words);				
	}
	
	public static int CountWords(String s)
	{
		int result = 0;
		boolean wordCounted = false;
		for (int i = 0; i < s.length(); i++)
		{
			boolean isSeperator = IsSeperator(s.charAt(i));
			if (!isSeperator && !wordCounted)
			{
				result++;
				wordCounted = true;
			}
			
			if (isSeperator)
			{
				wordCounted = false;
			}						
		}
		return result;
	}
	
	public static boolean IsSeperator(char c)
	{		
		return SEPERATORS.indexOf(c) >= 0;
	}
	
	public static void DisplayWordCount(int words)
	{
		System.out.println("There are " + words + " words in the string.");
	}		
}