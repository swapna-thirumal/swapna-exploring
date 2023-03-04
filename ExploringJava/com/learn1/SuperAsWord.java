package com.learn1;
class At
{
	int i;
}
class Bt extends At
{
		int i;	
  	Bt(int a, int b)
  	{
  		super.i = a;
  		i = b;
  	}
  	void show()
  	{
  		System.out.println("value of i in super class:" + super.i);
  		System.out.println("value of i in sub class:" + i);
  	}
}
public class SuperAsWord
{

	public static void main(String[] args)
	{
		Bt ob = new Bt(3,5);
		ob.show();

	}

}
