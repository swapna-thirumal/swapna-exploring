package com.learn2;
enum Fruits
{
	APPLE,BANANA,GRAPES,MELON;
}

public class EnumerationDemo1
{

	public static void main(String[] args)
	{
		Fruits f = Fruits.APPLE;
		Fruits f1 = Fruits.BANANA;
		Fruits f2 = Fruits.GRAPES;
		
		switch(f2)
		{
		case APPLE:
			System.out.println("daily one");
			break;
		case BANANA:
			System.out.println("BREAKFAST FRUIT");
			break;
		default:
			System.out.println("fruits are goog for health");
		}
				
	}

}
