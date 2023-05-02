package com.secondSetofProgram;

import java.util.ArrayList;
import java.util.List;

public class SumAverageRunningIntUsingList_EnhancedforLoop {

	public static void main(String[] args) 
	{
		List <Integer> l = new ArrayList<Integer> ();
		int lowerBound=1;
		int upperBound=100;
			for(int i =lowerBound;i<=upperBound;i++)
			{
				l.add(i);
			}
			
		int sum = 0;
		for(int numbers:l)
		{
			sum+=numbers;
		}
		System.out.println("The sum of "+ lowerBound+ " to "+ upperBound+" is " +sum);
		double average =(double)sum/upperBound;
		System.out.println("The Average is "+ average);
		


	}

}
