package com.learn;

public class FlowControl11 {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=3;i++)
		{
			
			for(j=1;j<=i;j++)
			{
				
				for(k=1;k<=j;k++)
				{
					System.out.print(" "+i);
					System.out.println();
					System.out.print(" "+j);
					System.out.println();
					System.out.print(" "+k);
				}
			}
		}

	}

}
