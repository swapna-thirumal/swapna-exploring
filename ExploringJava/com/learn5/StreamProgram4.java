package com.learn5;

import java.util.*;
import java.util.stream.Collectors;

public class StreamProgram4 {

	public static void main(String[] args) {
		List<String>  strings = Arrays.asList("abby","cathy","bobby","dany");
		List<String> nameList1 = copies3(strings);
		List<String> nameList2 = removeX(strings);
		
		System.out.println(nameList1);
		System.out.println(nameList2);
		
		
	}
		

	    public static List<String> copies3(List<String> names) {
	        return names.stream().map(s -> s.repeat(3)) .collect(Collectors.toList());
	}
	    public static List<String> removeX(List<String> names) {
	    	return names.stream().map(s -> s.replace("y", "")).collect(Collectors.toList());
	  
	    }

}
