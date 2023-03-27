package learn3;
interface Facto
{
	int fact(int n);
}

public class LambdaDemo8 {

	public static void main(String[] args)
	{
		Facto f = n -> {
			int result = 1;
			for (int i =1;i<=n;i++)
			{
				result = i*result;
			}
			return result;
			
		};
		System.out.println(f.fact(8));
		System.out.println(f.fact(3));
	}

}
