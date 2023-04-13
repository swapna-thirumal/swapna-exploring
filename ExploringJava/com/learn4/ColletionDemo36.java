package com.learn4;
import java.util.*;

public class ColletionDemo36 
{

	public static void main(String[] args) 
	{
		String[] s = {"A","Z","C"};
		List l = Arrays.asList(s);
		System.out.println(l);
		
		s[0]="K";
		System.out.println(l);
		
		l.set(1,"S");
		for(String s1:s)
			System.out.print(s1);
			
	}

}
