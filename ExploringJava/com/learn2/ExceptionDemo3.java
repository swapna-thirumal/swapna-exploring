package com.learn2;

public class ExceptionDemo3 
{
	//static void ExceptionDemo3()
	public static void main(String[] args)
	{
	try
	{
		throw new NullPointerException("demo");
	}
	catch(NullPointerException e)
	{
		System.out.println("caught inside ExceptionDemo3 ");
		System.out.println(e);
		//throw e;
	}
}


	/*public static void main(String[] args)
	{
		try
		{
			ExceptionDemo3();
		}
		catch( NullPointerException e)
		{
			System.out.println("recaught :" + e);
		}
			
	}*/

}
