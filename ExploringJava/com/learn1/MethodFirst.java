package com.learn1;
class Boxx
{
	double w;
	double d;
	double h;
	

double Volume()
   {
      return w*d*h;
   }

}


class MethodFirst 
{
	public static void main(String[] args)
	{ 
		
		Boxx b1 = new Boxx();
		b1.w=10;
		b1.d=11.1;
		b1.h=20.2;
		
		Boxx b2 = new Boxx();
		b2.w=15.5;
		b2.d=12.2;
		b2.h=16.6;
		
		
		
		System.out.println(" The volume of b1 is:" + b1.Volume() );
		System.out.println(" The volume of b2 is:" + b2.Volume() );
		

	}

}
