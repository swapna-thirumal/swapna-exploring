package com.learn5;
import java.util.*;
//import java.util.concurrent.*;

public class ConcurrentDemo4 {

	public static void main(String[] args) {
		//CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<>();
		ArrayList<String> l=new ArrayList<String> ();
		l.add("abby");
		l.add("cathy");
		l.add("emily");
		l.add("dany");
		l.add("bobby");
		System.out.println(l);
		Iterator<String> i = l.iterator();
		while(i.hasNext()) {
			String s = i.next();
			if (s.equals("bobby"))
			{
				i.remove();
			}
		}
		
		System.out.println(l);
	}

}
