package com.learn2;
 class CallBack2 implements Call
{
  public void call(int p)
  {
	  System.out.println("square value of p is:" + (p*p));
  }
}
public class InterfaceDemo4
{
	  
	public static void main(String[] args) 
	{
		Call c = new CallBack2();
		c.call(9);

	}

}
