package com.learn2;
abstract class Car
{
	public void NoOfWheels()
	{
		System.out.println("4 wheels");
	}
	public void Music()
	{
		System.out.println("play illayaraja songs");
	}
	public abstract void drive();
	
}
class Pilot extends Car
{
	public void drive()
	{
		System.out.println("to drive");
	}
	
}

public class AbstractDemo 
{

	public static void main(String[] args) 
	{
		Car c = new Pilot();
		c.NoOfWheels();
		c.Music();
		c.drive();
	}

}
