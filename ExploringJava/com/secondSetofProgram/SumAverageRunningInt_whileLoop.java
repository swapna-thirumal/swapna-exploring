package com.secondSetofProgram;

//difference between for and while loop
//in for loop we know exactly how many times the loop is going to be executed.
//in for loop initialization,condition,increment can be assigned in one line

//in while loop we don't know how many times the loop is will be executed.the
//loop will be executed as long as the condition applies.


public class SumAverageRunningInt_whileLoop
{

	public static void main(String[] args)
	{
		int lowerBound = 1;
		int upperBound = 100;
		int sum =0;
		int i=lowerBound;//initialization
		
		while(i<=upperBound)//condition 
		{
			sum+=i;//task
			i++;//incrementing until condition satisfied
		}
		double average = (double)sum/upperBound;//average calculation
		
		System.out.println("The sum of "+ lowerBound+ " to "+ upperBound+" is " +sum);
		System.out.println("The average is " + average);
		
	}
}
