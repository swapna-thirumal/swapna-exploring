package learn3;
import java.io.*;

public class FileIoDemo4 
{

	public static void main(String[] args) throws IOException
	{
		File f = new File("demo.txt");
		char[] c = new char[(int)f.length()];
		FileReader fr = new FileReader(f);
		fr.read(c);
		for(char c1:c)
		{
			System.out.print(c1);
		}
		fr.close();
	}
}
