package learn3;
class Parent
{
	public void show()
	{
		System.out.println("in parent class");
	}
}
class Child extends Parent
{
	@Override
	public void show()
	{
		System.out.println("in child class");
	}
}

public class AnnotationDemo1
{

	public static void main(String[] args) 
	{
		Parent p = new Child();
		p.show();

	}

}
