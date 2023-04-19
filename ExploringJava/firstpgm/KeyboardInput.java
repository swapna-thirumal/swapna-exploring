package firstpgm;
import java.util.Scanner;

public class KeyboardInput
{

	public static void main(String[] args) 
	{
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first word");
		s.next();
		System.out.println("Enter second word");
		 s.next();
		System.out.println("Enter first number");
		s.nextInt();
		System.out.println("Enter first number");
		 s.nextInt();
		s.close();
		
		
	}

}
