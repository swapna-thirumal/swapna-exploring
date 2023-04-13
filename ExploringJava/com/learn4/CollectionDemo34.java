package com.learn4;
import java.util.*;
class MyPrimComparator implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		return s2.compareTo(s1);
	}
}

public class CollectionDemo34 
{

	public static void main(String[] args) 
	{
		
		MyPrimComparator m = new MyPrimComparator();
		
		int[] a = {10,5,20,11,6};
		System.out.println("primitive array before sorting:");
		for(int a1:a)
		{
			System.out.println(a1);	
		}
		Arrays.sort(a);
		System.out.println("primitive array after sorting:");
		for(int a1:a)
		{
			System.out.println(a1);	
		}
		
		
		String[] s = {"A","Z","C"};
		System.out.println("object array before sorting:");
		for(String s1:s)
		{
			System.out.println(s1);	
		}
		Arrays.sort(s);
		System.out.println("object array after sorting:");
		for(String a1:s)
		{
			System.out.println(a1);	
		}
		Arrays.sort(s,m);
		System.out.println("object array after  customised sorting:");
		for(String a1:s)
		{
			System.out.println(a1);	
		}
		
	}

}
