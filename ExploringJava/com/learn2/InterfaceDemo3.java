package com.learn2;
interface Call
{
	void call(int pr);
}
class CallBack implements Call
{
	public void call(int p)
	{
		System.out.println("call from :" + p);
	}
	void video()
	{
		System.out.println("video from :");
	}
}

public class InterfaceDemo3 
{

	public static void main(String[] args) 
	{
		Call c = new CallBack();
		c.call(911);

	}

}
