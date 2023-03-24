package learn3;
import java.io.*;
class Mom 
{
	int i=10;
	Mom()
	{
		System.out.println("mom constructor called");
	}
}
class Kid extends Mom implements Serializable
{
	int j=20;
	Kid()
	{
		System.out.println("kid constructor called");
	}
}

public class SerializationDemo5
{

	public static void main(String[] args) throws Exception
	{
		Kid k = new Kid();
		k.i=111;
		k.j=222;
		
		System.out.println(k.i+".."+k.j);
		
		FileOutputStream f = new FileOutputStream("a1b2.ser");
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(k);
		System.out.println("deserialization started");
		FileInputStream f1 = new FileInputStream("a1b2.ser");
		ObjectInputStream o1 = new ObjectInputStream(f1);
		Kid k1 =( Kid)o1.readObject();
		
		System.out.println(k1.i+".."+k1.j);
	}

}
