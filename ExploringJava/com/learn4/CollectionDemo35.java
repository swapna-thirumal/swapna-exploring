package com.learn4;
import java.util.Comparator;
import static java.util.Arrays.*;

import java.util.Arrays;
class MyStringComparator implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		return s2.compareTo(s1);
	}
}

public class CollectionDemo35 
{

	public static void main(String[] args)
	{
		MyStringComparator c = new MyStringComparator();
		
		int[] a = {10,5,20,11,6};
		Arrays.sort(a);
		System.out.println(binarySearch(a,20));//4
		System.out.println(binarySearch(a,14));//-5
		
		String[] s = {"abby","zoe","cathy"};
		Arrays.sort(s);
		System.out.println(binarySearch(s,"zoe"));//2
		System.out.println(binarySearch(s,"dany"));//-3
		
		Arrays.sort(s,c);
		System.out.println(binarySearch(s,"zoe",c));//0
		System.out.println(binarySearch(s,"dany",c));//-2
		System.out.println(binarySearch(s,"abby",c));//2
	}

}
