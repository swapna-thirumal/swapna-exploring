package com.learn5;

import java.util.*;
import java.util.stream.Stream;

public class StreamProgram2 {

	public static void main(String[] args) 
	{
		List <Integer> l = new ArrayList<Integer> ();
		int start=1;
		int end=100;
		for(int i =start;i<=end;i++)
		{
			l.add(i);
		}
		Stream<Integer> s1 = l.stream();
		double sum = s1.reduce(0,(a,b)->a+b);
		System.out.println(" sum of first  " +end+" numbers is "+sum);
		double average =sum/end;
		System.out.println("Average of "+ end + " numbers is "+ average);
		
	} 

}
