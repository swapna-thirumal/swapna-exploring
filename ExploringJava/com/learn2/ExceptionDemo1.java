package com.learn2;

public class ExceptionDemo1
{
public static void main(String[] args)
	{
		try
		{
			int a = args.length;
			System.out.println("a:" + a);
			int b = 42/a;
			int[] c = {10,20};
			c[12] =30;
		}
		catch(ArithmeticException e)
		{
			System.out.println("exception:" + e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception:" + e);
		}
		
		System.out.println("After try catch block");

	}

}
