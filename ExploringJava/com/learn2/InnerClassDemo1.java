package com.learn2;
class Apple
{
	public void show()
	{
		System.out.println("in show");
	}
	 static class Banana
	{
		public void run()
		{
			System.out.println("in run");
		}
	}
}

public class InnerClassDemo1 
{

	public static void main(String[] args)
	{
		Apple obj = new Apple();
		obj.show();
		
		//Apple.Banana obj1 = obj.new Banana();
		Apple.Banana obj1 = new Apple.Banana();
		obj1.run();
		
	}

}
