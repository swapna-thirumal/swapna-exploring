package learn3;


public class StringDemo2
{

	public static void main(String[] args) 
	{
		String s = new String("sunskymoon");
		String s1 = "sunskymoon";
		String s2 = "skymoon";
		String s3 = "SKYMOON";
		
		System.out.println(s);
		System.out.println(s.concat("star"));
		System.out.println(s.charAt(5));
		System.out.println(s.toUpperCase());
		System.out.println(s.length());
		System.out.println(s.equals(s1));
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s==s1);
		System.out.println(s2==s3);
		System.out.println(s.substring(3));
		System.out.println(s1.substring(3, 6));
		System.out.println(s2.concat("sky"));
		System.out.println("bun".replace('b', 's'));
		System.out.println("sun moon   ".trim());
		
	}

}
