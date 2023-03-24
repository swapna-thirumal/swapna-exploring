package learn3;
import java.io.*;
class Account implements Serializable
{
	String username = "swapna";
	transient String pwd = "password";
	
	private void writeObject(ObjectOutputStream os) throws Exception
	{
		os.defaultWriteObject();
		String epwd = "123" + pwd;
		os.writeObject(epwd);
	}
	private void readObject(ObjectInputStream is)throws Exception
	{
		is.defaultReadObject();
		String epwd = (String) is.readObject();
		pwd = epwd.substring(3);
		
	}
}

public class SerializationDemo3 
{

	public static void main(String[] args) throws Exception
	{
		Account a = new Account();
		System.out.println( "a values-->" +a.username + "...." + a.pwd);
		
		FileOutputStream f = new FileOutputStream("abc1.ser");
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(a);
		
		FileInputStream f1 = new FileInputStream("abc1.ser");
		ObjectInputStream o1 = new ObjectInputStream(f1);
		Account a1 =( Account)o1.readObject();
		
		System.out.println( "a1 values-->"+ a1.username + "...." + a1.pwd);
		
	}

}
