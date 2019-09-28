// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

import java.io.File; 
import java.io.FileNotFoundException; 
import java.io.PrintWriter;
import java.util.Scanner;

public class ValidateCheckDigits
{
	public static void main(String[] args) 
	{
		try
		{
			ProcessFile("AccountInput.txt", "AccountOutput.txt");		
		}
		catch (FileNotFoundException fileNotFoundException)
		{
			System.out.println(fileNotFoundException.getMessage());
		}
	}
	
	public static void ProcessFile(String inputFilename, String outputFilename) throws FileNotFoundException
	{		
		File inputFile = new File(inputFilename);
		File outputFile = new File(outputFilename);
		
		Scanner inputScanner = new Scanner(inputFile);
		PrintWriter outputWriter = new PrintWriter(outputFile);
		
		while (inputScanner.hasNextLine())
		{
			String accountNumber = inputScanner.nextLine();
			if (IsValidAccount(accountNumber))
			{
				outputWriter.println(accountNumber);
			}			
		}	

		outputWriter.close();
		inputScanner.close();
	}
	
	public static boolean IsValidAccount(String accountNumber)
	{
		// Accout number is not exactly 6 digits
		if (accountNumber.length() != 6) return false;
		
		char[] accountNumberDigits = accountNumber.toCharArray();
		int sumOfDigits = 0;		
		for (int i = 0; i < 5; i++)
		{
			// Digit is not numeric
			if (!Character.isDigit(accountNumberDigits[i])) return false;
			sumOfDigits += Character.getNumericValue(accountNumberDigits[i]);
		}
		
		// Check digit is not numeric
		if (!Character.isDigit(accountNumberDigits[5])) return false;
		int checkDigit = Character.getNumericValue(accountNumberDigits[5]);
		
		// Check digit does not match
		System.out.println(accountNumber + " " + (sumOfDigits % 10));
		if ((sumOfDigits % 10) != checkDigit) return false;
				
		return true;
	}	
}