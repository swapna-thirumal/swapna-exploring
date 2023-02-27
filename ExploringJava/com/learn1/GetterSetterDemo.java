package com.learn1;
class Data 
{
		private int age;
		private String name;
		
	public void setAge(int a)
	{
		age=a;
	}
	public int getAge() 
	{
		return age;
	}
	public void setName(String n)
	{
		name=n;
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
		
		obj.setAge(33);
		obj.setName("swapna");
		obj1.setAge(11);
		obj1.setName("shru");
		
		System.out.println(obj.getName() + ":" + obj.getAge());
		
		System.out.println(obj1.getName() + ":" + obj1.getAge());
		
	}

}
