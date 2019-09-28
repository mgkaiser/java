// Author: 	Michael Kaiser
// Class: 	COM-209-OL01

public class ArrayMethodDemo
{	
	final static int INTEGER_ARRAY_COUNT = 8;

	public static void main(String[] args)
	{						
		
		int[] integerArray = { 1, 8, 4, 5, 6, 2, 3, 7 };
		
		System.out.print("FORWARD: ");
		DisplayForward(integerArray);
		
		System.out.print("BACKWARD: ");
		DisplayBackward(integerArray);
		
		System.out.print("SUM: ");
		DisplaySum(integerArray);
		
		int limit = 5;
		System.out.print("GREATER THAN " + limit + ": ");
		DisplayGreaterThanLimit(integerArray, limit);
		
		System.out.print("GREATER THAN AVERAGE: ");
		DisplayGreaterThanAverage(integerArray);
		
	}
	
	public static void DisplayForward(int[] integerArray)
	{		
		for (int i = 0; i < INTEGER_ARRAY_COUNT; i++)
		{
			System.out.print(integerArray[i] + " ");
		}
		System.out.println();
	}
	
	public static void DisplayBackward(int[] integerArray)
	{		
		for (int i = INTEGER_ARRAY_COUNT - 1; i >= 0; i--)
		{
			System.out.print(integerArray[i] + " ");
		}
		System.out.println();
	}
	
	public static void DisplaySum(int[] integerArray)
	{		
		int sum = CalculateSum(integerArray);		
		System.out.println(sum);
	}
	
	public static int CalculateSum(int[] integerArray)
	{
		int sum = 0;
		for (int i = INTEGER_ARRAY_COUNT - 1; i >= 0; i--)
		{
			sum += integerArray[i];
		}
		return sum;
	}
	
	public static void DisplayGreaterThanLimit(int[] integerArray, int limit)
	{		
		for (int i = INTEGER_ARRAY_COUNT - 1; i >= 0; i--)
		{
			if (integerArray[i] > limit)
			{
				System.out.print(integerArray[i] + " ");
			}
		}
		System.out.println();
	}
	
	public static void DisplayGreaterThanAverage(int[] integerArray)
	{
		int average = CalculateAverage(integerArray);
		DisplayGreaterThanLimit(integerArray, average);
	}
	
	public static int CalculateAverage(int[] integerArray)
	{
		return CalculateSum(integerArray) / INTEGER_ARRAY_COUNT;
	}
	
}