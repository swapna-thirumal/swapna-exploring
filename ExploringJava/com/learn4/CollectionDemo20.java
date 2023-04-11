package com.learn4;
import java.util.*;

public class CollectionDemo20
{

	public static void main(String[] args)
	{
		IdentityHashMap m = new IdentityHashMap();
		Integer i1 =new Integer( 10);
		Integer i2 =new Integer( 10);
		m.put(i1,"sam");
		m.put(i2,"pam");
		System.out.println(m);
	}

}
