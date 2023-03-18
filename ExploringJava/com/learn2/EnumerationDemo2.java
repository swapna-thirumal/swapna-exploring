package com.learn2;
enum Colors
{
	RED,BLUE,BLACK,GREEN,WHITE;
}

public class EnumerationDemo2 
{

	public static void main(String[] args) 
	{
		Colors[] c = Colors.values();
		for(Colors c1:c) 
		{
			System.out.println(c1);
		}
	}

}
