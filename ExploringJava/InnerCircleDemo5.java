
public class InnerCircleDemo5 
{

	public static void main(String[] args) 
	{
		Runnable r = new Runnable()
		{
			public void run()
			{
				for(int i=0;i<5;i++)
				{
					System.out.println("hi");
					
					try
					{
						Thread.sleep(100);
					}
					catch(InterruptedException e) {}
				}
			}
				
		};
		Runnable r1 = new Runnable()
		{
			public void run()
			{
				for(int i=0;i<5;i++)
				{
					System.out.println("hello");
					
					try
					{
						Thread.sleep(100);
					}
					catch(InterruptedException e) {}
				}
			}
				
		};
		Thread t=new Thread(r);
		Thread t1=new Thread(r1);
		t.start();
		t1.start();
		
		
		
	}

}
