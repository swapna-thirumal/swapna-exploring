package com.learn4;
import java.util.*;
import java.io.*;

public class CollectionDemo25 
{

	public static void main(String[] args) throws Exception
	{
		Properties p = new Properties();
		FileInputStream f = new FileInputStream("/Users/shruthi/javaProjects/abc.properties");
		p.load(f);
		System.out.println(p);
		p.setProperty("swap", "333");
		p.setProperty("srav", "423");
		FileOutputStream f1 = new FileOutputStream ("/Users/shruthi/javaProjects/abc.properties");
		p.store(f1, "updated by me");
		//System.out.println(p);
		
	}

}
