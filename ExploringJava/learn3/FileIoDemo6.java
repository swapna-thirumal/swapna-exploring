package learn3;
import java.io.*;

public class FileIoDemo6 
{

	public static void main(String[] args) throws Exception 
	
	{
		FileReader f = new FileReader("abcd.txt");
		BufferedReader b = new BufferedReader(f);
		String line = b.readLine();
		while(line != null)
		{
			System.out.println(line);
			line = b.readLine();
		}
		b.close();
		
	}

}
