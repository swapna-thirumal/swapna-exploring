package com.learn1;
class Demo1
{
	void Demo1()
	{
		System.out.println("hello");
	}
}

public class Constructor 
{

	public static void main(String[] args) 
	{
		Demo1 d = new Demo1();
		Demo1 d1 = new Demo1();
		Demo1 d2 = new Demo1();
		d.Demo1();
		d1.Demo1();
		d2.Demo1();
	}

}
