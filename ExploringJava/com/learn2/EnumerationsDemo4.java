package com.learn2;
enum Laptop11
{
	Mac(200),Samsung(150),Hp(180),Abc();
	
	private int price;
	
	Laptop11()
	{
		price=110;
	}
	
	 Laptop11(int price)
	 {
		 this.price = price;
		 System.out.println("in laptop"+ " :" + this.price);
	 }
	 public int getPrice()
	 {
		 return price;
	 }
	 /*public void setPrice(int price)
	 {
		 this.price = price;
	 }*/
}

public class EnumerationsDemo4 
{

	public static void main(String[] args) 
	{
		Laptop11[] l = Laptop11.values();
		for(Laptop11 lap :l)
		{
			System.out.println(lap + "-->" +lap.getPrice() );
		}

	}

}
