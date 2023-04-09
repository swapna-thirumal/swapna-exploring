package com.learn4;
import java.io.Serializable;
import java.util.*;

public class CollectionDemo3
{

	public static void main(String[] args) 
	{
		ArrayList l1 = new ArrayList();
		LinkedList l2 = new LinkedList();
		
		System.out.println(l1 instanceof Serializable);
		
		System.out.println(l2 instanceof Cloneable);

		System.out.println(l1 instanceof RandomAccess);

		System.out.println(l2 instanceof  RandomAccess);


	}

}
