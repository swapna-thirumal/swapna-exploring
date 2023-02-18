package com.learn;

public class FlowControl2 {

	public static void main(String[] args) {
		int x=1,y=1;
		while(x<=3)
		{
			System.out.println(x+" ");
			x++;
		}
		while(y<=x)
		{
			System.out.println(x+" "+y);
			y++;
		}
	}

}
