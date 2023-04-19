package firstpgm;
import java.util.Scanner;


public class NumericCalculator 
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number");
		Double num1=s.nextDouble();
		System.out.println("Enter second number");
		Double num2=s.nextDouble();
		System.out.println("Enter third number");
		Double num3=s.nextDouble();
		Double result = (num1+num2+num3)/2;
		System.out.println(result);
		s.close();
		
	}

}
