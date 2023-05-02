package com.secondSetofProgram;

public class SumAverageRunningInt 
{

	public static void main(String[] args) 
	{
		int lowerBound = 1;
		int upperBound = 100;
		int sum =0;
		
		for(int i=lowerBound;i<=upperBound;i++)
		{
			sum+=i;
		}
		System.out.println("The sum of "+ lowerBound+ " to "+ upperBound+" is " +sum);
		double average = (double)sum/upperBound;
		System.out.println("The average is " + average);
		
	}

}
