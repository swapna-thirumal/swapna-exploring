package learn3;
@FunctionalInterface
interface Apple
{
	public void apple1();
	//public void apple2();
}
class Fruit implements Apple
{
	public void apple1()
	{
		System.out.println("apple1 method");
	}
	public void apple2()
	{
		System.out.println("apple2 method");
	}
}

public class AnnotationDemo4 
{

	public static void main(String[] args) 
	{
		Apple a = new Fruit();
		a.apple1();
		//a.apple2();
	}

}
