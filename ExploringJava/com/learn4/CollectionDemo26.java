package com.learn4;

import java.util.*;

public class CollectionDemo26
{

	public static void main(String[] args)
	{
		PriorityQueue<Integer> q = new PriorityQueue<>();
		System.out.println(q.peek());
		//System.out.println(q.element());
		for(int i=0;i<=10;i++)
		{
			q.offer(i);
		}
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q);
		System.out.println(q.element());
	}

}
