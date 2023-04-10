package com.learn4;
import java.util.*;

public class CollectionDemo9
{

	public static void main(String[] args) 
	{
		LinkedHashSet h = new LinkedHashSet();
		h.add("A");
		h.add("B");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		System.out.println(h.add("Z"));
		System.out.println(h.add("F"));
		System.out.println(h);
	}

}
