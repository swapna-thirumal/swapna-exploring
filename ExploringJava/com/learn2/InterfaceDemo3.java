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
	void video(double v)
	{
		System.out.println("video from :" + v);
	}
}

public class InterfaceDemo3 
{

	public static void main(String[] args) 
	{
		Call c = new CallBack();
		c.call(911);
		CallBack c1 = new CallBack();
		c1.video(9.11);
	}

}
