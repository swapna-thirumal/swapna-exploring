package com.learn5;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamProgram3 {

	public static void main(String[] args) {
		
		List<String> l = Arrays.asList("swapna","moon","star","sky", "rainbow");
		Stream <String> s = l.stream();
		//List<String> s1 = s.map(n->n+"*").collect(Collectors.toList());
		//s1.forEach(n->System.out.println(n));
		List <String> s1 = s.map(n->n.replace("s","")).collect(Collectors.toList());
		System.out.println(s1);
		
	}

}
