package com.learn2;
class MyThread extends Thread
{
	public  void run()
	{
		System.out.println("no-arg run");
	}
	public static void run(int i)
	{
		System.out.println("int-arg run");
	}
}

public class MultiThreadingDemo1 
{

	public static void main(String[] args)
	{
		MyThread t = new MyThread();
		t.run();
	}

}
