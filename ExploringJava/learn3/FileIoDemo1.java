package learn3;
import java.io.File;

public class FileIoDemo1 
{

	public static void main(String[] args)
	{
		int count = 0;
		File f = new File("/Users/shruthi");
		String[] s = f.list();
		for( String s1:s)
		{
			File f1 = new File(f,s1);
			//if (f1.isFile())
			if (f1.isDirectory())
			{
				count++;
				System.out.println(s1);
			}
		}
		System.out.println("total number :" + count);
		
	}

}
