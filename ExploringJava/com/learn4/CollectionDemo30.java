package com.learn4;
import java.util.*;

public class CollectionDemo30
{

	public static void main(String[] args) 
	{
		ArrayList <String> l = new ArrayList<>();
		l.add("k");
		l.add("c");
		l.add("p");
		l.add("b");
		System.out.println("before sorting:"+l);
		Collections.sort(l);
		System.out.println("after sorting:"+l);
				
		
	}

}
