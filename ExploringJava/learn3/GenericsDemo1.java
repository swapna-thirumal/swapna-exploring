package learn3;
class Gen<T>
{
	T ob;
	Gen(T ob)
	{
		this.ob=ob;
	}
	public void show()
	{
		System.out.println("ob type is:" + ob.getClass().getName());
	}
	public T getob()
	{
		return ob;
	}
}

public class GenericsDemo1 
{

	public static void main(String[] args) 
	{
		Gen<String> g1 = new Gen<> ("swapna");
		g1.show();
		System.out.println(g1.getob());
		
		Gen<Integer> g2 = new Gen<> (10);
		g2.show();
		System.out.println(g2.getob());
		
		
		Gen<Double> g3 = new Gen<> (10.55);
		g3.show();
		System.out.println(g3.getob());
		
		
	}
		

}
