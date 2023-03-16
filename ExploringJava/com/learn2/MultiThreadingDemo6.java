package com.learn2;
class MyThrad extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("pam thread");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e) {}
		}
	}
}

public class MultiThreadingDemo6 
{

	public static void main(String[] args) throws InterruptedException
	{
		MyThrad t = new MyThrad();
		t.start();
		t.join(10000);
		
		for(int i=0;i<10;i++)
		{
			System.out.println("sam thread");
		}
	}

}
