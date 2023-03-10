package com.learn2;
interface A
{
	int age = 10;
	String area = "namakkal";
	void show();
	void play();
}
interface X
{
	void walk();
}
interface Y extends X
{
}

class One implements A,Y
{
	public void show()
	{
		System.out.println("in show method");
	}
	public void play()
	{
		System.out.println("in play method");
	}
	public void walk()
	{
		System.out.println("in walk method");
	}
	
}


public class InterfaceDemo 
{

	public static void main(String[] args)
	{	
		System.out.println(A.age +" " + A.area);
		System.out.println();
		
		A obj = new One();
		obj.show();
		obj.play();
		//obj.walk();
		System.out.println();
		
		Y obj1 = new One();
		X obj2 = new One();
		obj1.walk();
		obj2.walk();
		System.out.println();
		
		One obj3 = new One();
		obj3.show();
		obj3.play();
		obj3.walk();
		
		
		
	}

}
