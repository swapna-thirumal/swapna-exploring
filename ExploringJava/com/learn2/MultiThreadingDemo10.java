package com.learn2;
class Displayy
{
	public synchronized void displayn() 
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {}
		}
		System.out.println();
	}
	public synchronized void displayc() 
	{
		for(int i=65;i<=75;i++)
		{
			System.out.print((char)i);
			try {
			Thread.sleep(1000);
			}
			catch(InterruptedException e) {}
			
		}
	}
	
}
class Mthread1 extends Thread
{
	Displayy d;
	Mthread1(Displayy d)
	{
		this.d= d;
	}
	public void run()
	{
		d.displayn();
	}
}
class Mthread2 extends Thread
{
	Displayy d;
	Mthread2(Displayy d)
	{
		this.d= d;
	}
	public void run()
	{
		d.displayc();
	}
}
public class MultiThreadingDemo10
{

	public static void main(String[] args) 
	{
		Displayy d = new Displayy();
		
		Mthread1 t1 = new Mthread1(d);
		Mthread2 t2 = new Mthread2(d);
		
		t1.start();
		t2.start();
		
	}

}
