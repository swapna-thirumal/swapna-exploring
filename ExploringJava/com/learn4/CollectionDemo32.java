package com.learn4;
import java.util.*;

public class CollectionDemo32
{

	public static void main(String[] args)
	{
		ArrayList<String> l = new ArrayList<>();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("M");
		l.add("a");
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		System.out.println(Collections.binarySearch(l, "Z"));
		System.out.println(Collections.binarySearch(l, "J"));
		System.out.println(Collections.binarySearch(l, "a"));
		
			
	}

}
