package com.learn1;
class Lunch
{
   String name;
   double time;
   int poori;
}

public class forEachClass
{

	public static void main(String[] args)
	{
		Lunch lun1 = new Lunch();
		lun1.name = "appa";
		lun1.time = 12.30;
		lun1.poori = 5;
		
		Lunch lun2 = new Lunch();
		lun2.name = "amma";
		lun2.time = 1;
		lun2.poori = 4;
		
		Lunch lun3 = new Lunch();
		lun3.name = "pappa";
		lun3.time = 1.30;
		lun3.poori = 2;
		
		Lunch[] ln = new Lunch[3];
		ln[0]= lun1;
		ln[1] = lun2;
		ln[2] =lun3;
		
		for(Lunch l : ln)
		{
			System.out.println( l.name + " eats "+ l.poori + "pooris at " + l.time);
		}
		

		
		
		
	}

}
