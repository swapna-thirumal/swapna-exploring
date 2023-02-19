package com.learn;

public class FlowControl3 {

	public static void main(String[] args) {
		char c=36;
		for(int i=1;i<=3;i++)
			
		{
			for(int j=1;j<=3;j++)
			{
				if((i==2)&&(j==2))
				{
					System.out.print("  ");
					continue;
				}
				System.out.print(c+ " ");
			}
			System.out.println();
		}
	}

}
