package com.learn2;
class MyThread2 extends Thread
{
	public void start()
	{
		super.start();
		System.out.println("start()");
	}
	public void run()
	{
		System.out.println("run()");
	}
}

public class MultiThreadingDemo3 
{

	public static void main(String[] args) 
	{
		MyThread2 t = new MyThread2();
		t.start();
		System.out.println("main()");

	}

}
