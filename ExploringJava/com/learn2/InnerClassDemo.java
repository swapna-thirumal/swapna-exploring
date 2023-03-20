package com.learn2;
 abstract class School
 {
	 public abstract void math();
	 public abstract void gym();
	 public abstract void cafetarea();
 }

public class InnerClassDemo 
{

	public static void main(String[] args)
	{
		School s = new School()
		{
			public void math()
			{
				System.out.println("kids are very interested in this class");
			}
			public void gym()
			{
				System.out.println("kids can play here");
			}
			public void cafetarea()
			{
				System.out.println("kids have their lunch here");
			}
		};
		s.math();
		s.gym();
		s.cafetarea();

	}

}
