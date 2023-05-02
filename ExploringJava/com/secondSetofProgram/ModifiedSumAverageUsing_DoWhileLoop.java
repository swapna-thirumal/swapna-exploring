package com.secondSetofProgram;

public class ModifiedSumAverageUsing_DoWhileLoop 
{

	public static void main(String[] args)
	{
		int lowerBound = 1111;
		int upperBound = 8899;
		int sum =0,count=0;
		int i=lowerBound;//initialization
		
		do
		{
			sum+=i;//task
			count++;
			i++;//incrementing
		}while(i<=upperBound);//condition
		
		double average = (double)sum/count;//average calculation
		
		System.out.println("The sum of "+ lowerBound+ " to "+ upperBound+" is " +sum);
		System.out.println("The average is " + average);
		

	}

}
