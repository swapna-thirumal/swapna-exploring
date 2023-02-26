package com.learn1;
class Const
{
	Const( double d)
	{
		this(10);
		System.out.println("double arg method");
		System.out.println();
	}
	Const( int i)
	{
		this();
		System.out.println("int arg method");
		System.out.println();
	}
	Const()
	{
		System.out.println("NO arg method");
		System.out.println();
		
	}
}

public class ConstOverLoading {

	public static void main(String[] args) 
	{
		Const c = new Const(2.75);
		Const c1 = new Const(2);
		Const c2= new Const();
		
	}

}
