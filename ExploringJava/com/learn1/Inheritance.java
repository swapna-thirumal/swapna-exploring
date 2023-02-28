package com.learn1;
  class Root
{
	public int add(int a, int b)
	{
		return a+b;
	}
	public int sub(int a, int b)
	{
		return a-b;
	}
}
 class Bren extends Root
{
	
	public int multi(int a, int b)
	{
		return a*b;
	}
	
	public int div(int a, int b)
	{
		return a/b;
	}
}
class Brench extends Bren
{
	
	public int sqr(int a)
	{
		return a*a;
	}
	
}


public class Inheritance 
{

	public static void main(String[] args) 
	{
		Brench  r = new Brench ();
		
		int ans  = r.add(4, 5) ;
		int ans1 = r.sub(11, 9);
		
		int ans2 = r.multi(3,3);
		int ans3 = r.div(81,9);
		
		int ans4 = r.sqr(7);
		
		
		
		System.out.println(ans + " " + ans1);
		System.out.println(ans2 + " " + ans3);
		System.out.println(ans4);



	}

}
