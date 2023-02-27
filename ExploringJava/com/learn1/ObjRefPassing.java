package com.learn1;
class Task
{
		int a,b;
		
	Task(int a, int b)
	{
		 this.a=a;
		 this.b=b;
	}
	void meth(int a, int b)
	//void meth(Task t)
	{
		a++;
		b--;
		//t.a ++;
		//t.b --;
	}
	
}

public class ObjRefPassing 
{

	public static void main(String[] args)
	{
		Task t1 = new Task(2,3);
		System.out.println("before method call a,b :" + t1.a +"," + t1.b);
		
		//t1.meth(t1);
		t1.meth(4,5);
		System.out.println("After method call a,b :" + t1.a +"," + t1.b);
		
		
		
	}

}
