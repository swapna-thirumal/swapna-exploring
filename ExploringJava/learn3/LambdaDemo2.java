package learn3;
interface Math
{
	int add(int a, int b);
}

public class LambdaDemo2
{

	public static void main(String[] args) 
	{
		Math m =(a, b)->a+b;
		System.out.println(m.add(4, 5));
	}

}
