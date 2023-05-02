package com.secondSetofProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SumAverageRunningIntUsingList
{

	public static void main(String[] args) 
	{
		List <Integer> l = new ArrayList<Integer> ();
		int lowerBound=1;
		int upperBound=100;
		
		for(int i =lowerBound;i<=upperBound;i++)
		{
			l.add(i);
		}
		
		Stream<Integer> s1 = l.stream();
		int sum = s1.reduce(0,(a,b)->a+b);
		
		System.out.println("The sum of "+ lowerBound+ " to "+ upperBound+" is " +sum);
		double average =(double)sum/upperBound;
		System.out.println("The Average is "+ average);
		

	}

}
