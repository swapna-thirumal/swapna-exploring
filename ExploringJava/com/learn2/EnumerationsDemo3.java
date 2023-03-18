package com.learn2;
enum Colors1
{
	RED,BLACK,BROWN,BLUE;
}

public class EnumerationsDemo3 
{

	public static void main(String[] args) 
	{
		Colors[] c = Colors.values();
		for(Colors c1:c)
		{
			System.out.println(c1+ "-->" + c1.ordinal());
		}
	}

}
