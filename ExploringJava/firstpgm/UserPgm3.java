package firstpgm;
import java.util.Scanner;

public class UserPgm3
{

	public static void main(String[] args)throws Exception 
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = s.next();
		System.out.println("confirm name: "+name);
		Thread.sleep(1000);
		
		System.out.println("Enter your age");
		int age = s.nextInt();
		System.out.println("confirm age: "+age);
		Thread.sleep(1000);
		
		System.out.println("Enter how much you make");
		double earning = s.nextDouble();
		System.out.println("confirm your earning: "+earning);
		
		s.close();
		
	}

}
