package com.learn4;
import java.util.*;

public class CollectionDemo1 
{

	public static void main(String[] args) 
	{
		ArrayList<String> l = new ArrayList<>();
		l.add("s");
		l.add("u");
		l.add("s");
		//l.add(10);
		l.add(null);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(2,"n");
		l.add("day");
		System.out.println(l);
		for (String s:l)
		{
			System.out.println(s);
		}
	}

}
