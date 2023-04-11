package com.learn4;
import java.util.LinkedHashMap;
import java.util.Collection;
import java.util.Set;

public class CollectionDemo19 {

	public static void main(String[] args)
	{
		LinkedHashMap<String,Integer> m = new LinkedHashMap<>();
		m.put("ruby", 510);
		m.put("pearl", 300);
		m.put("crystal", 200);
		m.put("diamond", 1000);
		System.out.println(m);
		System.out.println(m.put("pearl", 300));
		System.out.println(m.put("crystal", 600));
		
		
		Set<String> s = m.keySet();
		System.out.println(s);
		Collection<Integer> c = m.values();
		System.out.println(c);
		Set s1 = m.entrySet();
		System.out.println(s1);
		
	}

}
