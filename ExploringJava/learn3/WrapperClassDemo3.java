package learn3;

public class WrapperClassDemo3 
{

	public static void main(String[] args)
	{
		Integer i,i1;
		int j;
		i = 100;
		System.out.println("value of i before:" + i);
		++i;
		System.out.println("value of i after:" + i);
		i1 = i+(i/3);
		System.out.println("value of i2 after:" + i1);
		j = i1+(i1/3);
		System.out.println("value of j :" + j);
		
	}

}
