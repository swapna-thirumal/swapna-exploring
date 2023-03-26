package learn3;
import java.util.*;

public class GenericsDemo4
{

	public static void main(String[] args) 
	{
		ArrayList<String> l = new ArrayList<>();
		l.add("sun");
		l.add("sky");
		l.add("star");
		m1(l); 
		System.out.println(l);
	}
	public static void m1(ArrayList l)
	{
		l.add(10);
		l.add(10.5);
	}

}
