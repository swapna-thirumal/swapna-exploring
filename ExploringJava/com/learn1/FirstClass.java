package com.learn1;
class Box
{
	double w;
	double l;
	double h;
}


public class FirstClass 
{
   public static void main(String[] args) 
      {
	   
	   Box NewBox1 = new Box();
	   
	   Box NewBox2 = new Box();
	   
	   double vol;
	   
	   NewBox1.w = 120.5;
	   
	   NewBox1.l = 123.7;
	   
	   NewBox1.h = 12.3;
	   
	   vol = NewBox1.w* NewBox1.l * NewBox1.h;
	   
	   System.out.println("the value of vol :" + vol );
	   
	   NewBox2.w=12;
	   NewBox2.l=11;
	   NewBox2.h=31;
	   
	   vol=NewBox2.w* NewBox2.l * NewBox2.h;
	   
	   System.out.println("the value of vol :" + vol);
	   
		

	}

}
