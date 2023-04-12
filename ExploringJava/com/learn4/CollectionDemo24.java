package com.learn4;
import java.util.*;
class Temper
{
	int i;
	Temper(int i)
	{
		this.i=i;
	}
	public int hashcode()
	{
		return i  ;
	}
	public String toString()
	{
		return i+" ";
	}
}

public class CollectionDemo24 
{

	public static void main(String[] args) 
	{
		Hashtable<Temper,String> t = new Hashtable<>();
		t.put(new Temper(5),"A");
		t.put(new Temper(2), "B");
		t.put(new Temper(6), "C");
		t.put(new Temper(15), "D");
		t.put(new Temper(23), "E");
		t.put(new Temper(16), "F");
		System.out.println(t);

	}

}
