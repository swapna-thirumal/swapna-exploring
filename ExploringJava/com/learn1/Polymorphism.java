package com.learn1;
class Parent
{
	void call()
	{
		System.out.println("in Parent method");
	}
}
class Child1 extends Parent
{
	void call()
	{
		System.out.println("in child1 method");
	}
	
}
class Child2 extends Parent
{
	void call()
	{
		System.out.println("in child2 method");
	}
	
}

public class Polymorphism 
{
public static void main(String[] args) 
	{
		Parent obj1 = new Parent();
		Child1 obj2 = new Child1();
		Child2 obj3 = new Child2();
		obj1.call();
		obj2.call();
		obj3.call();
		System.out.println();
		
		Parent obj4 = new Child1();
		obj4.call();
		//System.out.println();
		
		Parent obj5 = new Child2();
		obj5.call();
		
	}

}
