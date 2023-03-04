package com.learn1;
class M
{
	int a,b;
	M(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	void show()
	{
		System.out.println("a & b values are :  " + a +" & " + b);
	}
}
class N extends M
{
		int c;
	N(int a, int b,int c)
	{
		super(a,b);
		this.c = c;
	}
	void show()
	{
		System.out.println("value of c is :  " + c);
	}
	
}

public class OverRideSimple
{

	public static void main(String[] args)
	{
		N obj1 = new N(2,4,8);
		N obj2 = new N(12,14,18);
		
		obj1.show();
		obj2.show();
		
	}

}
