package com.learn4;
import java.util.*;
class MyInComparator implements Comparator<Integer>
{
	public int compare(Integer i1,Integer i2)
	{
		
		return i2.compareTo(i1);
	}
}

public class CollectionDemo33
{

	public static void main(String[] args) 
	{
		MyInComparator m = new MyInComparator();
		ArrayList <Integer>l = new ArrayList<>();
		l.add(15);
		l.add(0);
		l.add(20);
		l.add(10);
		l.add(5);
		System.out.println(l);
		Collections.sort(l,m);
		System.out.println(l);
		System.out.println(Collections.binarySearch(l, 10,m));
		System.out.println(Collections.binarySearch(l, 13,m));
		System.out.println(Collections.binarySearch(l, 17,m));
	}

}
