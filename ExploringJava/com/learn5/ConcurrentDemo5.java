package com.learn5;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentDemo5 {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> l =  new CopyOnWriteArrayList<>();
		//ArrayList<Integer> l = new ArrayList<Integer> ();//CME
		l.add(10);
		l.add(22);
		l.add(13);
		System.out.println(l);
		Iterator<Integer> i = l.iterator();
		l.add(34);
		while(i.hasNext()) {
			Integer i1 = i.next();
			System.out.println(i1);
		}
		System.out.println(l);
	}
}
