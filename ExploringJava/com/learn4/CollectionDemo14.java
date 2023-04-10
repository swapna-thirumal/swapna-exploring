package com.learn4;
import java.util.*;

public class CollectionDemo14
{

	public static void main(String[] args) 
	{
		TreeSet<String> t = new TreeSet<>(new StringComparator());
		t.add("shruth");
		t.add("thamarai");
		t.add("swapna");
		t.add("abinaya");
		t.add("chitra");
		System.out.println(t);
	}

}
class StringComparator implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		//return s2.compareTo(s1);
		//return -s2.compareTo(s1);
		//return s1.compareTo(s2);
		return -s1.compareTo(s2);
		
	}
}
