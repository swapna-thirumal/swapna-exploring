package firstpgm;
import java.util.Scanner;

public class BmiCalculator
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your weight in kilograms");
		Double weight = s.nextDouble();
		System.out.println("Enter your height in meters");
		Double height = s.nextDouble();
		Double BMI =weight/(height*height);
		System.out.println("your BMI value is:"+ BMI);
		s.close();
	}
}
