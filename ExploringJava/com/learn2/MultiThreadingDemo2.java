package com.learn2;
class MyThread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("child thread");
		}
	}
}

public class MultiThreadingDemo2 
{

	public static void main(String[] args)
	{
		MyThread1 t = new MyThread1();
		t.start();
		for(int i=0;i<3;i++)
		{
			System.out.println("main thread");
		}

	}

}
