package com.learn5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamProgram5 {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(3,14,8,9);
		
		List<Integer> result1 = plusOneMultiply10(nums);
		System.out.println(result1);
		List<Integer> s = oddNum(nums);
		System.out.println(s);
	}
	public static List<Integer> plusOneMultiply10(List<Integer> num){
			return num.stream().map(n->(n+1)*10).collect(Collectors.toList());
	}
	public static List<Integer> oddNum(List<Integer> num){
		return num.stream().filter(n->n%2==1).collect(Collectors.toList());
	}
}
