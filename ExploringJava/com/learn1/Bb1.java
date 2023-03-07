package com.learn1;
class Bb1 extends Aa1
{

	public static void main(String[] args)
	{
		{
				Aa1 a = new Aa1();
				a.m1();
				
				Bb1 b = new Bb1();
				b.m1();
				
				Aa1 a1 = new Bb1();
				a1.m1();
		}
	}
}


