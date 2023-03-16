package com.learn2;
class Mytd extends Thread
{
	public void run()  
	{
		try 
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("sleepy thread-->" +i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("got interrupted");
		}
	}

}

public class MultiThreadingDemo8
{

	public static void main(String[] args) throws InterruptedException
	{
		Mytd t = new Mytd ();
		t.start();
		// t.interrupt();
		System.out.println("end of main");
	}

}
