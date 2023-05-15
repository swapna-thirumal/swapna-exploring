package practice;

import java.util.Scanner;

public class SeparatingDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number");
		int num = sc.nextInt();
		int number = num;
		
		sc.close();
		 int sum=0;
		while(num>0)
		{
			sum = sum+((num%10)*(num%10)*(num%10));
			num=num/10;
		}
		if(number==sum)
			System.out.println( number +" is Armstrong number");
		else
			System.out.println( number +" is  not Armstrong number");
			
	}

}
