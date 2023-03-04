package com.learn1;

class SuperBox
{
	double width;
	double depth;
	double height;
		
	SuperBox(double w,double d,double h)
	{
		width = w;
		depth = d;
		height = h;
	}
	/*SuperBox()
	{
		width = 1;
		depth = 1;
		height = 1;
	}*/
	double volune()
	{
		return width*height*depth;
	}
}

class SubClassBox extends SuperBox
{
	double weight;
	SubClassBox(double w,double d, double h,double m)		
	{
		super(1,2,3);
		width = w;
		depth = d;
		height = h;
		weight = m;
	}
	double volune()
	{
		return width*height*depth*weight;
	}
}

public class InheritanceDemo 
{

	public static void main(String[] args) 
	{
		SubClassBox  obj= new SubClassBox (2,3,4,5);
		SubClassBox  obj1= new SubClassBox (1,4,5,0);
		
		System.out.println("Output for my program is "+ obj.volune());
		System.out.println("Output for my program is "+ obj1.volune());

	}

}
