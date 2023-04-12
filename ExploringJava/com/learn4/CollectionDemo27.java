package com.learn4;
import java.util.*;

public class CollectionDemo27
{

	public static void main(String[] args) 
	{
		PriorityQueue q = new PriorityQueue(12, new QueueComparator());
		q.offer("sun");
		q.offer("cloud");
		q.offer("moon");
		q.offer("air");
		q.offer("sky");
	
		System.out.println(q);
	}
}

class QueueComparator implements Comparator 
{
	public int compare(Object o1,Object o2)
	{
		String s1 = (String)o1;
		String s2 = o2.toString();
		return s2.compareTo(s1);
	}
}
