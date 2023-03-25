package learn3;
import java.io.*;

public  class ExternalizationDemo implements Externalizable
{
	String s;
	int i;
	int j;
	public ExternalizationDemo()
	{
		System.out.println("public no-arg constructor");
	}
	public ExternalizationDemo(String s,int i,int j)
	{
		this.s=s;
		this.i=i;
		this.j=j;
	}
	public void writeExternal(ObjectOutput out)throws IOException
	{
		out.writeObject(s);
		out.writeInt(i);
	}
	public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException
	{
	{
		s = (String)in.readObject();
		i=in.readInt();
	}
		
}
	

	public static void main(String[] args)throws Exception
	{
		ExternalizationDemo d = new ExternalizationDemo("swapna",10,20);
		
		FileOutputStream f = new FileOutputStream("ab21.ser");
		ObjectOutputStream o = new ObjectOutputStream(f);
		o.writeObject(d);
		
		FileInputStream f1 = new FileInputStream("ab21.ser");
		ObjectInputStream o1 = new ObjectInputStream(f1);
		ExternalizationDemo d2=( ExternalizationDemo)o1.readObject();
		
		System.out.println(d2.s+"..."+d2.i+".."+d2.j);
		
	}

}
