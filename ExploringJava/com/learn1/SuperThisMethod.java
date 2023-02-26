package com.learn1;
class P
{
	public P()
	{
		System.out.println("in A");
	}
	public P(int n)
	{
		System.out.println("in int A");
	}
}
class Ch extends P
{
	public Ch()
	{
		super(5);
		System.out.println("in B");
	}
	public Ch(int n)
	{
		this();
		System.out.println("in int B");
	}
}

public class SuperThisMethod
{

	public static void main(String[] args) 
	{
		Ch child = new Ch(11);

	}

}
