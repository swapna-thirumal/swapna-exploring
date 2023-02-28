package com.learn1;
class Bank 
{
		private double balance;
	
	public double getBalance()	
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
}

public class Encaps
{

	public static void main(String[] args)
	{
		Bank obj = new Bank();
		
		 obj.getBalance();
		
		obj.setBalance(33.33);
		
		System.out.println( obj.getBalance());
	}

}
