package com.learn4;
import java.util.*;

public class CollctionDemo8 
{

	public static void main(String[] args) 
	{
		LinkedList<String> l = new LinkedList<>();
		l.add("sun");
		l.add("star");
		l.add("sky");
		l.add("moon");
		System.out.println(l);
		
		ListIterator<String> ltr = l.listIterator();
		System.out.println(ltr.getClass().getName());

		while(ltr.hasNext())
		{
			String s = ltr.next();
			
			if(s.equals("sun"))
			{
				ltr.remove();
			}
			else if(s.equals("star"))
			{
				ltr.add("rainbow");
			}
			else if(s.equals("moon"))
			{
				ltr.set("cloud");
			}
		}
		
		System.out.println(l);
	}

}
