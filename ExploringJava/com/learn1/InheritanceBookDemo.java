package com.learn1;
class MyBox
{
			double  width;
			double depth;
			double height;
	MyBox(MyBox ob)
		{
			width = ob.width;
			depth = ob.depth;
			height= ob.height;
		}
	MyBox(double w,double d,double h)
		{
			width = w;
			depth = d;
			height= h;
		}
	MyBox()
		{
			width = 1;
			depth = 1;
			height= 1;
		}
	MyBox(double length)
		{
			width=depth=height=length;
		}
	double volume()
		{
			return width*depth*height;
		}
}
class SubMybox extends MyBox
{
	 		double weight;
	 SubMybox(SubMybox ob) 
	 	{
		 	super(ob);
		 	weight = ob.weight;
	 	}
	 SubMybox(double w,double d,double h,double m)
		{
		 	super(w,d,h);
		 	/*width = w;
			depth = d;
			height= h;*/
			weight= m;
		}
	 SubMybox()
	 	{
		 //super();
		 //weight = 1;
	 	} 
	 	
	 SubMybox(double length, double m)
	 {
		super(length);
		weight=m;
	 }
	 
	
}


public class InheritanceBookDemo
{

	public static void main(String[] args)
	{
		SubMybox box1 = new SubMybox(2,3,4,1.5);
		SubMybox box2 = new SubMybox();
		SubMybox box3 = new SubMybox(4,3.8);
		SubMybox box4 = new SubMybox(box1);
		
		double vol;
		vol = box1.volume();
		System.out.println("volume of box1 is:" + vol);
		System.out.println("weight of box1 is:" + box1.weight);
		
		vol = box2.volume();
		System.out.println("volume of box2 is:" + vol);
		System.out.println("weight of box2 is:" + box2.weight);
		
		vol = box3.volume();
		System.out.println("volume of box3 is:" + vol);
		System.out.println("weight of box3 is:" + box3.weight);
		
		vol = box4.volume();
		System.out.println("volume of box is:" + vol);
		System.out.println("weight of box3 is:" + box4.weight);
	}	
}
