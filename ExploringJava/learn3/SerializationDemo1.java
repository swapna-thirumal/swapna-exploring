package learn3;
import java.io.*;
class Data implements Serializable
{
	int i=10;
	//final int i=10;
	//transient   int i =10;
	//int j=20;
	 //transient int j=20;
	 transient static int j=20;
}

public class SerializationDemo1
{

	public static void main(String[] args) throws Exception
	{
		Data d = new Data();
		FileOutputStream f = new FileOutputStream("abs.ser");
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(d);
		
		FileInputStream f1 = new FileInputStream("abs.ser");
		ObjectInputStream o1 = new ObjectInputStream(f1);
		Data d1 =( Data)o1.readObject();
		System.out.println(d1.i + " "+ d1.j);
	}

}
