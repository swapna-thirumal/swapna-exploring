package com.learn1;
abstract class Figure1
{
	double a;
	double b;
	Figure1(double a, double b)
	{
		this.a = a;
		this.b = b;
	}
	abstract double area();
}
class Rectangle1 extends Figure
{
	 
	 Rectangle1(double a, double b)
	 {
		 super(a,b);
	 }
	 double area()
	 {
		 System.out.println("in rectangle:"); 
		 return a*b;
	 }
}
class Triangle1 extends Figure
{
	
	 Triangle1(double a, double b)
	 {
		 super(a,b);
	 }
	 double area()
	 {
		 System.out.println("in triangle:"); 
		 return a*b/2;
	 }
}

public class AbstractClass
{

	public static void main(String[] args) 
	{
		Rectangle1 r = new Rectangle1(10,20);
		Triangle1 t = new Triangle1(11,22);
		Figure f1;
		
		f1=t;
		System.out.println("value of area is " + f1.area());
		
		f1 = r;
		System.out.println("value of area is " + f1.area());
		
	}

}
