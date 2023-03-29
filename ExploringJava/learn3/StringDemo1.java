package learn3;
class Abox
{
	double  w;
	double  l;
	double  d;
	Abox(double w,double l,double d)
	{
		this.w=w;
		this.l=l;
		this.d=d;
	}
	/*public String toString()
	{
		return "dimensions are:"+ w+" ,"+l+ " ,"+d + ".";
	}*/
	
}

public class StringDemo1 {

	public static void main(String[] args)
	{
		Abox obj = new Abox(1.2,3.8,9.3);
		String s = "box A->"+obj;
		System.out.println(obj);
		System.out.println(s);
		

	}

}
