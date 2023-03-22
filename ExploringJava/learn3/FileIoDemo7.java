package learn3;
import java.io.*;

public class FileIoDemo7
{

	public static void main(String[] args) throws IOException 
	{
		FileWriter f= new FileWriter("abc.txt");
		PrintWriter out = new PrintWriter(f);
		f.write(100);
		out.println(100);
		out.println('a');
		out.println(true);
		out.println("swapna");
		out.flush();
		out.close();

	}

}
