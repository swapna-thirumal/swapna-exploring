package learn3;
import java.io.*;

class Dog implements Serializable
{
	Cat c = new Cat();
}
class Cat implements Serializable
{
	Rat r = new Rat();
}
class Rat implements Serializable
{
	int j=20;
}

public class SerializationDemo2
{

	public static void main(String[] args) throws Exception
	{
		Dog d = new Dog();
		
		FileOutputStream f = new FileOutputStream("abc.ser");
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(d);
		
		FileInputStream f1 = new FileInputStream("abc.ser");
		ObjectInputStream o1 = new ObjectInputStream(f1);
		Dog d1 =( Dog)o1.readObject();
		
		System.out.println(d1.c.r.j);
		
	}

}
