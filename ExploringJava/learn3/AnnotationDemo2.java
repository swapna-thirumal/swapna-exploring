package learn3;
import java.util.*;
class Bank
{
	@SuppressWarnings("unchecked")
	public ArrayList details()
	{
		ArrayList l = new ArrayList();
		l.add("CUSTOMER-1");
		l.add("CUSTOMER-2");
		l.add("CUSTOMER-3");
		l.add("CUSTOMER-4");
		return l;
		
	}
}

public class AnnotationDemo2 
{
	
	public static void main(String[] args)
	{
		Bank b = new Bank();
		ArrayList al = b.details();
		System.out.println(al);
	}

}
