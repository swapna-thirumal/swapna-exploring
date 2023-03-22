package learn3;
import java.util.Scanner;


public class FileIoDemo8 
{

	public static void main(String[] args) 
	{
		System.out.println("get your number 1");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("get your number 2");
		Scanner sc1 = new Scanner(System.in);
		int num1 = sc1.nextInt();
		System.out.println(num1*num);
		sc.close();
		sc1.close();
		

	}

}
