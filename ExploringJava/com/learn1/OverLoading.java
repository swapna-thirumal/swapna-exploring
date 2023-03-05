package com.learn1;
class Map
{
	int a,b;
	Map(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	void show()
	{
		System.out.println("a & b values are :  " + a +" & " + b);
	}
}
class Nap extends Map
{
	int c;
	Nap(int a, int b,int c)
	{
		super(a,b);
		this.c = c;
	}
	void show(String s)
	{
		System.out.println( s + c);
	}
}	

public class OverLoading 
{

	public static void main(String[] args)
	{
		Nap obj1 = new Nap(8,9,10);
		obj1.show("k is:");
		obj1.show();
		
		Map obj2 = new Nap(18,19,20);
		obj2.show();
	}

}
