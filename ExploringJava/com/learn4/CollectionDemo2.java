package com.learn4;
import java.util.LinkedList;

public class CollectionDemo2
{

	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		l.add("sky");
		l.addLast("moon");
		l.add("sun"); 
		System.out.println(l);
		l.add(10);
		l.add(null);
		l.add("skys");
		System.out.println(l);
		l.set(1,"star");
		System.out.println(l);
		l.add(1,"sun");
		System.out.println(l);
		l.removeLast();
		System.out.println(l);
		l.addFirst("star");
		System.out.println(l);
		
	}

}
