package com.learn2;
class MyRunnable implements Runnable
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("child thread");
			//System.out.println(10/0);
		}
	}
}

public class MultiThreadingDemo4 
{

	public static void main(String[] args) 
	{
		System.out.println("berfore name set:" +Thread.currentThread().getName());
		Thread.currentThread().setName("sun");
		System.out.println("after name set:" +Thread.currentThread().getName());
		
		MyRunnable r = new MyRunnable();
		
		Thread t = new Thread(r);
		System.out.println("before name set :" +t.getName());
		t.setName("star");
		
		t.start();
		
		System.out.println("after name set:" +t.getName());
		
		for(int i=0;i<3;i++)
		{
			System.out.println("main thread");
			System.out.println(10/0);
		}
		
	}

}
