package com.learn4;
import java.util.*;

public class CollectionDemo6 
{

	public static void main(String[] args)
	{
		Vector <Integer>v = new Vector<>();
		for(int i=0;i<10;i++)
		{
			v.addElement(i);
		}
		v.addElement(100);
		System.out.println(v);
		
		Enumeration <Integer> e = v.elements();
		System.out.println(e.getClass().getName());
		while(e.hasMoreElements())
		{
			Integer i = e.nextElement();
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
		System.out.println(v);
	}

}
