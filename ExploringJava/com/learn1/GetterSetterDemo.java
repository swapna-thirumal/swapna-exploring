package com.learn1;
class Data 
{
		private int age =33;
		private String name="swapna";

	public int getAge() 
	{
		
		return age;
	}
	public String getName()
	{
		
		return name;
	}
}
	
	public class GetterSetterDemo {

	public static void main(String[] args) {
		
		Data obj= new Data();
		Data obj1= new Data();
		
		obj.getAge();
		obj.getName();
		
		System.out.println(obj.getName() + ":" + obj.getAge());
		
	}

}
