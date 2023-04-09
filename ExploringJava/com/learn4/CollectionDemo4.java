package com.learn4;
import java.util.*;

public class CollectionDemo4 
{

	public static void main(String[] args)
	{
		Vector v = new Vector();
		System.out.println(v.capacity());
		for(int i=0;i<10;i++)
		{
			v.addElement(i);
		}
			System.out.println(v.capacity());
			v.addElement("A");
			System.out.println(v.capacity());
			System.out.println(v);
			
	}

}
 