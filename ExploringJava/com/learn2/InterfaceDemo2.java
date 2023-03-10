package com.learn2;
interface Computer
{
	void code();
}
class Laptop implements Computer
{
	public void code()
	{
		System.out.println("code, compile, run");
	}
}
class Desktop implements Computer
{
	public void code()
	{
		System.out.println("code, compile, run : fast,comfort");
	}
}

class Develop
{

	public void devApp(Computer obj)
	{
		obj.code();
	}
}

public class InterfaceDemo2
{

	public static void main(String[] args) 
	{
		Computer obj = new Laptop();
		Computer obj1 = new Desktop();
		obj.code();
		obj1.code();
		System.out.println();

		Develop obj2 = new Develop();
		obj2.devApp(obj);
		obj2.devApp(obj1);
		System.out.println();
		
		Laptop obj3 = new Laptop();
		obj3.code();
		//obj3.code(obj);
		System.out.println();
		
		Desktop obj4 = new Desktop();
		obj4.code();
	}
}


