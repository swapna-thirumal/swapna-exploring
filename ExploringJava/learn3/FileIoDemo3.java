package learn3;
import java.io.*;

public class FileIoDemo3 
{

	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("demo.txt",true);
		fw.write(115);
		char[] c = {'w','a','p'};
		fw.write(c);
		fw.write("na\n did it");
		fw.write('\n');
		fw.write("\ngood job");
		fw.flush();
		fw.close();
		
	}

}
