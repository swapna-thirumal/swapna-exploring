package learn3;

public class BoxJava
{

	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=30;j++)
			{
				if(i==1||i==10)
					System.out.print("-");
				else if ((j==1)||(j==30))
					System.out.print("|");
				else	
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
