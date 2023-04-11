package com.learn4;
import java.util.*;

public class CollectionDemo23 
{

	public static void main(String[] args)
	{
		TreeMap<String,Integer> t = new TreeMap<>(new  MapComparator());
		t.put("sam", 10);
		t.put("abi", 17);
		t.put("lea", 9);
		t.put("cathy", 20);
		System.out.println(t);
	}

}
class MapComparator implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		return s2.compareTo(s1);
	}
}
