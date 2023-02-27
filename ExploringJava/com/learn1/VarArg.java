package com.learn1;
class Var
{
	public static void add(int...i)
	{
		int total=0;
		for(int i1:i)
		{
			total=total+i1;
		}
			
			System.out.println("the sum :" + total);
		
	}
}

public class VarArg
{

	public static void main(String[] args)
	{
		Var a = new Var();
		
		a.add(10);
		a.add(10,20);
		a.add(10,20,30);
		

	}

}
