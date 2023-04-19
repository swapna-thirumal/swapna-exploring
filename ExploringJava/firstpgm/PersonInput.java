package firstpgm;
import java.util.Scanner;


public class PersonInput {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String s =sc.next();
		System.out.println("full name: "+s+"Thirumal");
		sc.close();
	}
}
