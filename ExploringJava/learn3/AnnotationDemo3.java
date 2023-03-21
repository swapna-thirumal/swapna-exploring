package learn3;
class ShowClass
{
	@Deprecated
	public void show()
	{
		System.out.println("in outdated method");
	}
	public void newShow()
	{
		System.out.println("in latest method");
	}
}

public class AnnotationDemo3 
{
	
	public static void main(String[] args) 
	{
		ShowClass sc = new ShowClass();
		sc.show();
		sc.newShow();
		
	}

}
