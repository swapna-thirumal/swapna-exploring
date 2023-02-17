package com.learn;

public class ShortCircuitOperator {
	

	public static void main(String[] args) {
	int x=10,y=15;
	if(++x<=10 && ++y>15)
	{
		System.out.println(x+ "hello" +y);
	}
	else
	{
		System.out.println(x+ "welcome" +y);
}
	}
}
