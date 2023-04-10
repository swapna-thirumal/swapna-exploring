package com.learn4;
import java.util.*;

public class CollectionDemo16 
{

	public static void main(String[] args) 
	{
		TreeSet<String> t = new TreeSet<String>(new StringBufComparator());
		t.add("A");
		//t.add(new StringBuffer("ABC"));
		//t.add(new StringBuffer("AA"));
		t.add("XX");
		t.add("ABCD");
		t.add("A");
		System.out.println(t);
	}

}
class StringBufComparator implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		//String s1 = o1.toString();
		//String s2 = o1.toString();
		int l1 =s1.length();
		int l2 =s2.length();
		if (l1 < l2)
		return -1;
		else if (l1>l2)
		return +1;
		else return s1.compareTo(s2);
		
	}
	
}
