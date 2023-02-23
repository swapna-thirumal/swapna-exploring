package com.learn1;
class Boxy
{
	

double Volume(double w, double d, double h)
   {
      return w*d*h;
   }

}


class MethodFirst1
{
	public static void main(String[] args)
	{ 
		
		Boxy b1 = new Boxy();
		double vol;
		 vol=b1.Volume(2, 04.4, 08.3);
		
		/*Boxx b2 = new Boxx();
		b2.w=15.5;
		b2.d=12.2;
		b2.h=16.6;*/
		
		
		
		System.out.println(" The volume of b1 is:" + vol );
		//System.out.println(" The volume of b2 is:" + b2.Volume() );
		

	}

}

