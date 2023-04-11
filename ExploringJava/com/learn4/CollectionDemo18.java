package com.learn4;
import java.util.*;

public class CollectionDemo18 {

	public static void main(String[] args) 
	{
		HashMap m = new HashMap();
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
		
		Iterator i = s1.iterator();
		while(i.hasNext())
		{
			Map.Entry m1 = (Map.Entry) i.next();
			System.out.println(m1.getKey()+"..."+m1.getValue());
			if(m1.getKey().equals("diamond"))
			{
				m1.setValue(1500);
			}
		}
		System.out.println(m);
		
	}

}
