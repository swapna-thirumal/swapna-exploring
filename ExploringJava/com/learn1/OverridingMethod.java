package com.learn1;
class Figure
{
	double d1;
	double d2;
	Figure(double a, double b)
	{
		d1 = a;
		d2 = b;
	}
	double area()
	{
		System.out.println("in undefined figure:");
		return 0;
	}
	
}
class Rectangle extends Figure
{
	 double a;
	 double b;
	 Rectangle(double a, double b)
	 {
		 super(a,b);
	 }
	 double area()
	 {
		 System.out.println("in rectangle:"); 
		 return d1*d2;
	 }
}
class Triangle extends Figure
{
	double a;
	 double b;
	 Triangle(double a, double b)
	 {
		 super(a,b);
	 }
	 double area()
	 {
		 System.out.println("in triangle:"); 
		 return d1*d2/2;
	 }
}


public class OverridingMethod 
{

	public static void main(String[] args)
	{
		Figure f = new Figure(1,1);
		Rectangle r = new Rectangle(18,9);
		Triangle t = new Triangle(12,2);
		Figure f1;
		/*double area;
		area = f.area();
		System.out.println("value of area is " + area);
		
		area = t.area();
		System.out.println("value of area is " + area);
		
		area = t.area();
		System.out.println("value of area is " + area);*/
		
		f1=t;
		System.out.println("value of area is " + f1.area());
		
		f1 = r;
		System.out.println("value of area is " + f1.area());
		
		f1 = f;
		System.out.println("value of area is " + f1.area());
		
	}

}
