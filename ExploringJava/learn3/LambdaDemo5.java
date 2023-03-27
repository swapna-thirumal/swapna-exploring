package learn3;
interface Function
{
	public int square(int n);
}

public class LambdaDemo5 {

	public static void main(String[] args)
	{
		Function f = n->n*n;
		int value = f.square(8);
		System.out.print(value);
	}

}
