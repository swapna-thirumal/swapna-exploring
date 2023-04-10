package com.learn4;
import java.util.*;

public class CollectionDemo11 
{

	public static void main(String[] args) 
	{
		SortedSet s = new TreeSet();
		
		s.add(new StringBuffer("A"));
		s.add(new StringBuffer("S"));
		s.add(new StringBuffer("Z"));
		s.add(new StringBuffer("L"));
		
		System.out.println(s);
		System.out.println("A".compareTo("Z"));
		System.out.println("Z".compareTo("A"));
		System.out.println("A".compareTo("A"));
		
		
	}

}
