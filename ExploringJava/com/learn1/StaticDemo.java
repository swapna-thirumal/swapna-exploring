package com.learn1;
class Mobile{
	
	String brand;
	int price;
	 static String name;

    public void show(){
    	
    	System.out.println(brand + ":" + price + ":" +name);
    	
     }
    public static void show1(Mobile ob) {
    	
    	System.out.println(ob.brand + ":" + ob.price + ":" +name);
    	
    }
  
}

public class StaticDemo {

	public static void main(String[] args){
		
		Mobile ob= new Mobile();
		Mobile ob1= new Mobile();
		Mobile ob2= new Mobile();
		
		ob.brand = "apple";
		ob.price = 100;
		ob.name = "phone";
		
		ob1.brand = "nokia";
		ob1.price = 30;
		ob1.name = "phone";
		
		ob2.brand = "samesung";
		ob2.price = 50;
		ob2.name = "phone";
		
		
		ob2.name="cell";
		
		ob.show();
		ob1.show();
		ob2.show();
		
		System.out.println();
		
		ob.show1(ob);
		ob1.show1(ob1);
		ob2.show1(ob2);
		
		
		
	}

}
