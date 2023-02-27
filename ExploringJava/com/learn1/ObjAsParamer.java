package com.learn1;
class Table
{
		double w;
		double h;
		double d;
	
	public Table(Table ta) 
	{
		w=ta.w;
		h=ta.h;
		d=ta.d;
	}
	public  Table(double w,double h,double d) 
	{
		 this.w=w;
		 this.h=h;
		 this.d=d;
	}
	public Table()
	{
		w=1;h=1;d=1;
	}
	public Table(double l)
	{
		h=w=d=l;
	}
	public double volume()
	{
		return w*h*d;
	}
}
	
public class ObjAsParamer
{

	public static void main(String[] args)
	{
		Table t = new Table(1.1,2.2,3.3);
		Table t1 = new Table();
		Table t2 = new Table(2);
		
		double vol;
		
		vol=t.volume();
		System.out.println("volum of t :" + vol);
		
		vol=t1.volume();
		System.out.println("volum of t1 :" + vol);
		
		vol=t2.volume();
		System.out.println("volum of t2 :" + vol);
		
		Table t3= new Table(t);
		vol = t3.volume();
		System.out.println("volum of t3 :" + vol);
		
		Table o = new Table();
		Table t4 = new Table(o);
		vol =t4.volume();
		System.out.println("volum of t4 :" + vol);
		
		Table o1 = new Table(5);
		Table t5 = new Table(o1);
		vol =t5.volume();
		System.out.println("volum of t5 :" + vol);
		
		//Table o = new Table();
		Table t6 = new Table(new Table());
		vol =t6.volume();
		System.out.println("volum of t6 :" + vol);
		
		Table t7 = new Table(new Table(1,2,3));
		vol =t7.volume();
		System.out.println("volum of t7 :" + vol);
		
		
		
		
		
		
		
		
		
		

	}

}
