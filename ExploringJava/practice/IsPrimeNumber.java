package practice;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		isPrime(19);
		
		}
	public static void isPrime(int n)
	{
		int count=0;
		for(int i=1;i<=7;i++) {
			if(n%i==0)
				count++;
		}
		if(count <=2)
			System.out.println( n +" is prime number");
		else
			System.out.println( n +" is not prime number");
	}

}
