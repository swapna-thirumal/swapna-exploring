package com.learn5;
import java.util.concurrent.*;

public class ConCurrentDemo1 {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> m = new ConcurrentHashMap<>();
		m.put(101, "abby");
		m.put(102, "cathy");
		m.put(103, "zoe");
		m.put(104, "dany");
		m.putIfAbsent(101, "sasi");
		m.putIfAbsent(105, "ravi");
		m.remove(101,"dany");
		m.remove(101,"abby");
		m.replace(102, "cathy","bobby");
		m.replace(103, "cathy","ravi");
		System.out.println(m);
		
		
		
				
		
	}

}
