package com.learn4;
import java.util.*;

public class CollectionDemo29 
{

	public static void main(String[] args) 
	{
		TreeMap<String,String> t = new TreeMap<> ();
		t.put("B", "bobby");
		t.put("C","cathy");
		t.put("A", "abby");
		t.put("D","danny");
		t.put("G", "gorden");
		System.out.println(t);
		System.out.println(t.descendingMap());
		System.out.println(t.ceilingKey("A"));
		System.out.println(t.higherKey("G"));
		System.out.println(t.ceilingKey("E"));
		System.out.println(t.floorKey("D"));
		System.out.println(t.lowerKey("E"));
		System.out.println(t.lowerKey("B"));
		System.out.println(t.pollFirstEntry());
		System.out.println(t.pollLastEntry());
		System.out.println(t);
		
		

	}

}
