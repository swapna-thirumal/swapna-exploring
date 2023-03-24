package learn3;
import java.io.*;
class Card implements Serializable
{
	String username = "swapna";
	transient String pwd = "password";
	transient int pin = 1234;
	private void writeObject(ObjectOutputStream os)throws Exception
	{
		os.defaultWriteObject();
		String epwd = "123"+pwd;
		os.writeObject(epwd);
		int epin = 4444+pin;
		os.writeInt(epin);
	}
	private void readObject (ObjectInputStream is) throws Exception
	{
		is.defaultReadObject();
		String epwd = (String) is.readObject();
		pwd = epwd.substring(3);
		int epin = is.readInt();
		pin = epin-4444;
	}
	
}

public class SerializationDemo4 
{

	public static void main(String[] args) throws Exception
	{
		Card c = new Card();
		System.out.println( "b values-->" +c.username + "...." + c.pwd + "..." + c.pin);
		
		FileOutputStream f = new FileOutputStream("abc123.ser");
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(c);
		
		FileInputStream f1 = new FileInputStream("abc123.ser");
		ObjectInputStream o1 = new ObjectInputStream(f1);
		Card c1 =(Card)o1.readObject();
		
		System.out.println( "b1 values-->"+ c1.username + "...." + c1.pwd + "..."+c1.pin);
		

	}

}
