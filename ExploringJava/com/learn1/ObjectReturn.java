package com.learn1;
 class Tasks
{
	int a;
	
	Tasks(int a)
	{
		this.a = a;
	}
	Tasks incrByTen()
	{
		Tasks t = new Tasks(a+10);
		return t;
	}
		
}

public class ObjectReturn
{

	public static void main(String[] args)
	{
		Tasks t1 = new Tasks(4);
		System.out.println("befor method call t1.a :" + t1.a);
		t1=t1.incrByTen();
		System.out.println("after method call t1.a :" + t1.a);
		System.out.println();
		
		
		Tasks t2 = new Tasks(10);
		System.out.println("befor method call t2.a :" + t2.a);
		t2=t2.incrByTen();
		System.out.println("after method call t2.a :" + t2.a);
		System.out.println();
		
		
		
		 
		
		
		
		
		//Tasks t2 = new Tasks();
		
		
	}

}
