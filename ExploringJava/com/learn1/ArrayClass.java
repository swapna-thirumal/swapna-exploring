package com.learn1;
class Student
{
	int Rollno;
	String name;
	int marks;
}

public class ArrayClass
{

	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.Rollno = 1;
		s1.name = "swapna";
		s1.marks = 85;
		
		Student s2 = new Student();
		s2.Rollno = 2;
		s2.name = "shru";
		s2.marks = 95;
		
		Student s3 = new Student();
		s3.Rollno = 3;
		s3.name = "thiru";
		s3.marks = 90;
		
		Student[] Students = new Student[3];
		Students[0] = s1;
		Students[1] = s2;
		Students[2] = s3;
		
		for(int i=0;i<=2;i++)
		{
			System.out.println(Students[i].name + " : " + Students[i].marks);
			
			
		}
		
		
	}

}
