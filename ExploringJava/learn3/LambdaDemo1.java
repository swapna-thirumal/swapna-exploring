package learn3;
interface Lamb
{
	void show();
	
}

public class LambdaDemo1
{

	public static void main(String[] args) 
	{
		Lamb l = ()-> System.out.println("in show");
		l.show();
	}
	
}
