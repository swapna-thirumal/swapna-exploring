package com.learn2;

public class ExceptionDemo4 
{
	static void Demo() throws IllegalAccessException
	{
		System.out.println("inside ExceptionDemo4 ");
		throw new IllegalAccessException();
		
	}
	public static void main(String[] args) 
	{
		try
		{
			Demo();
		}
		catch( IllegalAccessException e)
		{
			System.out.println("caught:-->" + e);
		}
	}

}
