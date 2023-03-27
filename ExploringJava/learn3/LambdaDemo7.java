package learn3;
import java.util.*;

public class LambdaDemo7 
{

	public static void main(String[] args)
	{
		ArrayList<Integer> l = new ArrayList<>();
		l.add(12);
		l.add(30);
		l.add(0);
		l.add(25);
		l.add(18);
		System.out.println(l);
		Comparator<Integer> c = (I1,I2)->(I1<I2)?-1:(I1>I2)?+1:0;
		Collections.sort(l,c);
		System.out.println(l);
		

	}

}
