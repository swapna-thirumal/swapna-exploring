package com.learn5;
import java.util.concurrent.*;

public class ConcurrentDemo6 {

	public static void main(String[] args) {
		
		CopyOnWriteArraySet s = new CopyOnWriteArraySet();
		s.add("A");
		s.add("G");
		s.add("C");
		s.add("Y");
		s.add(10);
		s.add(null);
		s.add("A");
		System.out.println(s);
		
	}

}
