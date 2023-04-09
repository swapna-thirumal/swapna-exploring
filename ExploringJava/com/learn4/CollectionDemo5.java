package com.learn4;
import java.util.*;

public class CollectionDemo5
{

	public static void main(String[] args)
	{
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.search("A"));
		System.out.println(s.peek());
		System.out.println(s.search("Z"));
		
	}

}
