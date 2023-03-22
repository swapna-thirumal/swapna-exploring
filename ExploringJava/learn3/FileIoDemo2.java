package learn3;

import java.io.File;
import java.io.IOException;

public class FileIoDemo2
{

	public static void main(String[] args)throws IOException
	{
		File f = new File("swap123");
		f.mkdir();
		//File f1 = new File("swap123","demo.txt");
		File f1 = new File(f,"demo.txt");
		f1.createNewFile();
		System.out.println(f.exists());
		System.out.println(f1.exists());
		
	}

}
