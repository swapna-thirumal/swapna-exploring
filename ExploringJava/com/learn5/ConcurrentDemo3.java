package com.learn5;
import java.util.concurrent.*;
import java.util.*;

public class ConcurrentDemo3 {

	public static void main(String[] args) {
		CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<>();
		l.add("a");
		l.add("b");
		l.addIfAbsent("c");
		l.addIfAbsent("a");
		System.out.println(l);
		ArrayList<String> l1 = new ArrayList<>();
		l1.add("a");
		l1.add("c");
		l.addAll(l1);
		System.out.println(l);
		ArrayList<String> l2 = new ArrayList<>();
		l2.add("a");
		l2.add("d");
		l.addAllAbsent(l2);
		System.out.println(l);
		
		
	}

}
