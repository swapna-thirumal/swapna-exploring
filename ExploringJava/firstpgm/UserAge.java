package firstpgm;

import java.util.Scanner;

public class UserAge 
{

	public static void main(String[] args) throws Exception
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = s.next();
		System.out.println("confirm name: "+name);
		Thread.sleep(1000);
		
		System.out.println("Enter your age");
		int age = s.nextInt();
		System.out.println("age five years ago: "+(age-5));
		System.out.println("age five years after: "+(age+5));
		
		s.close();

	}

}
