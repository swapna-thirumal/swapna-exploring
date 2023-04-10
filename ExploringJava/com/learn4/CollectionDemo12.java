package com.learn4;
import java.util.*;

public class CollectionDemo12 
{

	public static void main(String[] args) 
	{
		TreeSet<Integer> t = new TreeSet<> (new MyComparator());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(20);
		t.add(20);
		t.add(5);
		System.out.println(t);
	}
}

class MyComparator implements Comparator<Integer>
{
	public int compare(Integer o1,Integer o2)
	{
		
		
		
		if (o1<o2) 
			return +1;
			
		
		else if (o1>o2) 
			 return -1;
		 
		 else
			return 0;
			
		
	}
}

