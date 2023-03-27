package learn3;
interface Word
{
	int length(String s);
}

public class LambdaDemo3 
{

	public static void main(String[] args)
	{
		Word w =  s->s.length();
		
		int length = w.length("good job");
		
		System.out.println(length);
			
	}

}
