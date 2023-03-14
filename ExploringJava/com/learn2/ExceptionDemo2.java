package com.learn2;

public class ExceptionDemo2
{
public static void main(String[] args) 
	{
		int d,a;
		try
		{
			d=0;
			a=42/d;
			System.out.println("hi");
		}
		catch(ArithmeticException obj)
		{
			System.out.println("Division by zero");
			System.out.println("after catch");
		}

	}

}
