// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

import java.util.Scanner;

public class ValidatePassword
{
	final static int MINIMUM_LOWERCASE = 3;
	final static int MINIMUM_UPPERCASE = 2;
	final static int MINIMUM_DIGITS = 1;
	
	public static void main(String[] args)
	{				
		Scanner keyboard = new Scanner(System.in);

		ValidPasswordResult result;
		do
		{
			System.out.print("Please enter a password: ");
			String password = keyboard.nextLine();
	
			result = IsValidPassword(password);
			DisplayPasswordResult(result);
			
			System.out.println();
		} while (!result.getIsValid());
		
	}
	
	public static ValidPasswordResult IsValidPassword(String password)
	{
		ValidPasswordResult result = new ValidPasswordResult();
		
		result.setHasEnoughLowercase(CountLowercase(password) >= MINIMUM_LOWERCASE);
		result.setHasEnoughUppercase(CountUppercase(password) >= MINIMUM_UPPERCASE);
		result.setHasEnoughDigits(CountDigits(password) >= MINIMUM_DIGITS);
		
		return result;
	}
	
	public static int CountLowercase(String password)
	{
		int result = 0;
		
		for (int i = 0; i < password.length(); i++)
		{
			if (Character.isLowerCase(password.charAt(i))) result++;
		}
		
		return result;
	}
	
	public static int CountUppercase(String password)
	{
		int result = 0;
		
		for (int i = 0; i < password.length(); i++)
		{
			if (Character.isUpperCase(password.charAt(i))) result++;
		}
		
		return result;
	}
	
	public static int CountDigits(String password)
	{
		int result = 0;
		
		for (int i = 0; i < password.length(); i++)
		{
			if (Character.isDigit(password.charAt(i))) result++;
		}
		
		return result;
	}
	
	public static void DisplayPasswordResult(ValidPasswordResult result)
	{
		if (result.getIsValid())
		{
			System.out.println("Password Accepted");
		}
		else
		{
			System.out.println("Password Invalid");
			if (!result.getHasEnoughLowercase()) System.out.println("Not enough lowercase letters. Please enter at least " + MINIMUM_LOWERCASE + ".");
			if (!result.getHasEnoughUppercase()) System.out.println("Not enough uppercase letters. Please enter at least " + MINIMUM_UPPERCASE + ".");
			if (!result.getHasEnoughDigits()) System.out.println("Not enough digits. Please enter at least " + MINIMUM_DIGITS + ".");
		}
	}
}