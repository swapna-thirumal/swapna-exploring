package com.learn4;

import java.util.Comparator;
import java.util.TreeSet;

public class CollectionDemo15
{
	public static void main(String[] args) 
	{
		TreeSet<StringBuffer> t = new TreeSet<>(new StringBufferComparator());
		t.add(new StringBuffer("shruth"));
		t.add(new StringBuffer("thamarai"));
		t.add(new StringBuffer("swapna"));
		t.add(new StringBuffer("abinaya"));
		t.add(new StringBuffer("chitra"));
		System.out.println(t);
	}

}
class StringBufferComparator implements Comparator<StringBuffer>
{
	public int compare(StringBuffer s1,StringBuffer s2)
	{
	//return s2.compareTo(s1);
	//return -s2.compareTo(s1);
	//return s1.compareTo(s2);
	return -s1.compareTo(s2);
	
	}
}
