package com.secondSetofProgram;

public class SumAverageModified {

	public static void main(String[] args)
	{
		int lowerBound = 1111;
		int upperBound = 8899;
		int sum =0;
		int count=0;
		//int count=(upperBound-lowerBound)+1;
		
		for(int i=lowerBound;i<=upperBound;i++)
		{
			sum+=i;
			count++;
		}
		System.out.println("The sum of "+ lowerBound+ " to "+ upperBound+" is " +sum);
		double average = (double)sum/count;
		System.out.println("The average is " + average);
		
		System.out.println("Number of counts in the specified range "+count);
	}

}
