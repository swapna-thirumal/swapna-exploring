package com.learn1;
class Exam
{
	int rollno;
	String name;
	double marks;
	
	Exam(int rollno, String name,double marks )
	{
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
}

public class ThisKeyword {

	public static void main(String[] args) 
	{
		Exam a = new Exam(1,"swap",90.5);
		Exam b = new Exam(2,"thiru",91.4);
		Exam c = new Exam(3,"shru",93);
		
		System.out.println(a.name +" in rollno:"+ a.rollno + " got " + a.marks + " marks.");
		System.out.println(b.name +" in rollno:"+ b.rollno + " got " + b.marks + " marks.");
		System.out.println(c.name +" in rollno:"+ c.rollno + " got " + c.marks + " marks.");
	
	}

}
