package com.learn1;
class Factorial
{
	 int n;
	
	int fact(int n )
	{
		int results;
		if(n==1) return 1;
		results = fact(n-1) * n;
		return results;
	}
}

public class recursion
{

	public static void main(String[] args) 
	{
		Factorial f = new Factorial();
		System.out.println("factorial of 1: " + f.fact(1));
		System.out.println("factorial of 5: " + f.fact(5));
		System.out.println("factorial of 10: " + f.fact(10));
		System.out.println("factorial of 15: " + f.fact(15));
		

	}

}
