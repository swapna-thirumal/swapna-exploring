package com.learn5;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamProgram1
{

	public static void main(String[] args)
	{
		ArrayList<Integer> l = new ArrayList<>();
		l.add(3);
		l.add(4);
		l.add(21);
		l.add(16);
		l.add(8);
		l.add(31);
		l.add(34);
		l.add(35);
		l.add(14);
		System.out.println(l);
		
		l.forEach(n->System.out.print(n+" "));
		
		Stream<Integer> s1 = l.stream();
		//s1.forEach(n->System.out.print(n+" "));
		Stream<Integer> s2 =  s1.filter(n->n%2==0);
		Stream<Integer> sortedValues = s2.sorted();
		sortedValues.forEach(n->System.out.println(n));
		
		Stream<Integer> s3 = l.stream();
		Stream<Integer> s4 = s3.map(n->n*3);
		s4.forEach(n->System.out.print(n+" "));
		
		int result = l.stream().reduce(0,(c,e)->c+e);
		System.out.println(result);

	}

}
