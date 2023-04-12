package com.learn4;
import java.util.*;

public class CollectionDemo31
{

	public static void main(String[] args)
	{
		ArrayList <String> l = new ArrayList<>();
		l.add("k");
		l.add("c");
		l.add("p");
		l.add("b");
		System.out.println("before sorting:"+l);
		Collections.sort(l,new MySortComparator());
		System.out.println("after sorting:"+l);
	}

}
class MySortComparator implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		return s2.compareTo(s1);
	}
}

