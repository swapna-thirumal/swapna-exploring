package com.learn4;

import java.util.Comparator;
import java.util.TreeSet;

public class CollectionDemo13 
{
	public static void main(String[] args) 
	{
		TreeSet<Integer> t = new TreeSet<> (new MyComparator1());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		t.add(20);
		t.add(5);
		System.out.println(t);
	}
}

class MyComparator1 implements Comparator<Integer>
{
	public int compare(Integer o1,Integer o2)
	{
		//return o1.compareTo(o2);
		//return -o1.compareTo(o2);
		//return o2.compareTo(o1);
		return -o2.compareTo(o1);
		//return +1;
		//return -1;
		//return 0;
	}
		
}
