package learn3;
import java.util.ArrayList;

public class WrapperClassDemo1 {

	public static void main(String[] args)
	{
	 ArrayList l = new ArrayList();
	 Integer x =10;
	 int x1 = 10;
	 System.out.println(x==x1);
	 
	 System.out.println(x.getClass().getName());
	 //System.out.println(x1.getClass().getName());
	 
	 System.out.println(x*x1);
	 
	}

}
