package com.learn2;
class Display
{
	public synchronized void  wish(String name)
	{
		for(int i=0;i<3;i++)
			{
				System.out.print("hello:");
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {}
			
			System.out.println(name);
			}
	}
}
class Person extends Thread
{
	Display d;
	String name;
	
	Person(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
	
}

public class MultiThreadingDemo9 
{

	public static void main(String[] args)
	{
		Display d = new Display();
		Person t1 = new Person(d,"pam");
		Person t2 = new Person(d,"sam");
	
		t1.start();
		t2.start();
		
	}

}
