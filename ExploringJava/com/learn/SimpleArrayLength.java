package com.learn;

public class SimpleArrayLength {

	public static void main(String[] args) {
		int[] x = new int[6];
		int[] y = {1,2,3,4,5};
		String[] s = {"swap","shru","swapna"};
		
		System.out.println(x.length);
		
		System.out.println(y.length);
		
		System.out.println(s[0].length());
		
		System.out.println(s.length);
		
		System.out.println(s[0]+ "  " +s[2]);
		
		System.out.println(s[0].length()+s[1].length()+s[2].length());
		
	}

}
