package com.secondSetofProgram;

public class ModifiedSumAverageUsing_whileLoop 
{

	public static void main(String[] args)
	{
		int lowerBound = 1111;
		int upperBound = 8899;
		int sum =0,count=0;
		int i = lowerBound;
		
		while(i<=upperBound)
		{
			sum+=i;
			count++;
			i++;
		}
		double average = (double)sum/count;
		System.out.println("The sum of "+ lowerBound+ " to "+ upperBound+" is " +sum);
		System.out.println("The average is " + average);
		//System.out.println("Number of counts in the specified range  "+count);
		
	}

}
