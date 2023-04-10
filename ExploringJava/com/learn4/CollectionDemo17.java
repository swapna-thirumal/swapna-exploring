package com.learn4;
import java.util.*;
class Employee implements Comparable
{
	String name;
	int eid;
	Employee(String name,	int eid)
	{
		this.name = name;
		this.eid = eid;
	}
	public String toString()
	{
		return name+"-->"+eid;
	}
	public int compareTo(Object o)
	{
		int eid1 = this.eid;
		Employee e = (Employee) o;
		int eid2=e.eid;
		if(eid1<eid2)
		{
		 return -1;
		}
		else if(eid1<eid2)
		{
			return +1;
		}
		else
		{
			return 0;
		}
	}
}

public class CollectionDemo17
{

	public static void main(String[] args)
	{
		Employee e1=new Employee("abi",18);
		Employee e3=new Employee("cathy",10);
		Employee e5=new Employee("don",7);
		Employee e4 = new Employee("sasi",20);
		Employee e2= new Employee("ross",33);
		TreeSet t = new TreeSet();
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		System.out.println(t);
	}

}
