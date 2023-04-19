package com.learn5;
import java.util.concurrent.*;
import java.util.*;

	class MyThread extends Thread
		{
			public void run() 
			{
				//ConcurrentHashMap<Integer,String> c = new ConcurrentHashMap<>();
				try {
					Thread.sleep(20000);
				}
				catch(InterruptedException e) {}
				c.put(103,"c");
				
			}
		}

		public class ConcurrentDemo2 {

			public static void main(String[] args)throws InterruptedException {
				ConcurrentHashMap<Integer,String> c = new ConcurrentHashMap<>();
				c.put(101,"a");
				c.put(102,"b");
				
				MyThread t = new MyThread();
				t.start();
				
				Set<Integer> s = c.keySet();
				Iterator<Integer> i = s.iterator();
				while(i.hasNext())
				{
					Integer i1 = i.next();
					System.out.println("mainthread iterating and current entry is:"+i1+"..."+c.get(i1));
				}
				
				System.out.println(c);
				
	}
}


