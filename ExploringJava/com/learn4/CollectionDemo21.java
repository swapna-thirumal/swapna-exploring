package com.learn4;
import java.util.*;
class Temp
{
	/*public String toString()
	{
		return "name";
	}*/
	public void finalize()
	{
		System.out.println("finalize mathod called");
	}
}

public class CollectionDemo21 
{

	public static void main(String[] args)throws InterruptedException
	{
		WeakHashMap m = new WeakHashMap();
		Temp t = new Temp();
		m.put(t, "swap");
		System.out.println(m);
		
		t=null;
		System.gc();
		Thread.sleep(1000);
		System.out.println(m);
	}

}
