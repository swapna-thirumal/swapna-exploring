package com.learn2;
class Home
{
	public void livingRoom()
	{
		System.out.println("where tv is present");
	}
	public void dinner()
	{
		System.out.println("where family can eat seperately");
	}
}

public class InnerClassDemo2 
{

	public static void main(String[] args) 
	{
		Home h = new Home()
		{
			public void livingRoom()
			{
				System.out.println("where family can spend more time");
			}
			public void dinner()
			{
				System.out.println("where family can eat together");
			}
		};
		 h.livingRoom();
		 h.dinner();

	}

}
