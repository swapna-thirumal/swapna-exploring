package com.learn2;
class MyThred extends Thread
{
	public void run()
	{
		System.out.println("child method");
	}
}

public class MultiThreadingDemo5
{

	public static void main(String[] args)
	{
		System.out.println("before set priority in main:" + Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(6);
		System.out.println("after set priority in main:" + Thread.currentThread().getPriority());
		MyThred t = new MyThred();
		System.out.println("befoer set priority in child:" + t.getPriority());
		t.setPriority(10);
		t.start();
		System.out.println("after set priority in child:" + t.getPriority());
		for(int i=0;i<3;i++)
		{
			System.out.println("main method");
		}
		
		
	}

}
