package learn3;
import java.io.*;

public class FileIoDemo5 
{

	public static void main(String[] args)throws IOException
	{
		FileWriter f = new FileWriter("abcd.txt");
		BufferedWriter b = new BufferedWriter(f);
		b.write(115);
		//b.newLine();
		char[]c = {'w','a','p'};
		b.write(c);
		b.write("na");
		b.newLine();
		b.write("you did it");
		b.flush();
		b.close();
		
	}

}
