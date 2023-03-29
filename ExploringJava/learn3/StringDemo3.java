package learn3;

public class StringDemo3
{

	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("sun sky moom star");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		System.out.println(sb.append('s'));
		System.out.println(sb.insert(4, "in"));
		System.out.println(sb.insert(6, " "));
		System.out.println(sb);
		//System.out.println(sb.reverse());
		System.out.println(sb.delete(4, 6));
		System.out.println(sb.indexOf("sun"));
	}

}
