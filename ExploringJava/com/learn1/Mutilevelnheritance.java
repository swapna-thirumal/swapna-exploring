package com.learn1;
class PlainBox
{
		double width;
		double depth;
		double height;
	PlainBox(double w, double d, double h)
	{
		width = w;
		depth = d;
		height = h;
	}
	PlainBox()
	{
		width = 1;
		depth= 1;
		height = 1;
	}
	PlainBox(PlainBox ob)
	{
		width = ob.width;
		depth = ob.depth;
		height = ob.height;
	}
	double volume()
	{ 
		return width*depth*height;
	}
}
class WeBox extends PlainBox
{
		double weight;
		
	WeBox(double w, double d, double h,double m)
	{
		super(w,d,h);
		weight = m;
	}
	WeBox()
	{
		weight = 1;
	}
	WeBox(WeBox ob)
	{
		super(ob);
		weight = ob.weight;
	}
}
class ShipBox extends WeBox
{
	 	double cost;
	 	
	ShipBox(double w, double d, double h,double m,double c)
	{
		super(w,d,h,m);
		cost = c;
	}
	ShipBox()
	{
		cost = 1;
	}
	ShipBox(ShipBox ob)
	{
		super(ob);
		cost = ob.cost;
	}
	 
}


public class Mutilevelnheritance 
{

	public static void main(String[] args)
	{
		ShipBox box1 = new ShipBox ();
		ShipBox box2 = new ShipBox (9.2,2.1,3.8,4.150,5.75);
		ShipBox	a = new ShipBox(2,3,4,0,0);
		ShipBox box3 = new ShipBox (a);
		
		
		double vol;
		vol = box1.volume();
		System.out.println("volume of box1 is :" + vol);
		System.out.println("weight & cost of box1 is:" + box1.weight+ " & " + box1.cost);
		
		vol = box2.volume();
		System.out.println("volume of box2 is :" + vol);
		System.out.println("weight & cost of box2 is:" + box2.weight+ " & " + box2.cost);
		
		vol = box3.volume();
		System.out.println("volume of box3 is :" + vol);
		System.out.println("weight & cost of box3 is:" + box3.weight+ " & " + box3.cost);
		
		
		

	}

}
