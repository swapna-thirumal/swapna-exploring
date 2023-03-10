package com.learn2;
public class Balance
{
	String name;
	double bal;
	public Balance(String name, double bal)
	{
		this.name = name;
		this.bal = bal;
	}
	public void show()
	{
		if (bal<0)
		{
			System.out.print("-->");
		}
			System.out.println(name +":" + bal);
	}
}
class PackageDemo 
{

	public static void main(String[] args) 
	{
		Balance b[] = new Balance[3];
		b[0] = new Balance("swapna",90.75);
		b[1] = new Balance("shru",100.25);
		b[2] = new Balance("mal",-95.75);
		
		for( Balance b1:b)
			
			b1.show();
		
		
	}

}
