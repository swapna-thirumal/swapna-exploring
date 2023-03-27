package learn3;
interface Divid
{
	int division(int a, int b);
}

public class LambdaDemo4 
{

	public static void main(String[] args) 
	{
		Divid d = (a,b)->
		{
		if(b==0) return 0;
		return a/b;
		};
		
		System.out.println(d.division(16,0));
	}

}
