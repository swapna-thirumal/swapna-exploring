package learn3;

public class WrapperClassDemo4
{

	public static void main(String[] args)
	{
		Boolean b = false;
		if(b)
		{
			System.out.println("b is true");
		}else
		{
			System.out.println("b is false");
		}
		Character c = 'a';
		char c1 = c;
		System.out.println("value of c1:" + c1);
		System.out.println(b.getClass().getName());
		System.out.println(c.getClass().getName());
		
	}

}
