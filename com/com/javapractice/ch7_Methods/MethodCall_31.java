package com.javapractice.ch7_Methods;

public class MethodCall_31 {
	
	static int logic (int x, int y)
	{
		int z;
		if(x>y)
		{
		z=x-y;
		}
		else
		{
		z=x+y;
		}
		
		x=500;          //Does not change in main method
		return z;
	}

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		int c;
		
		c = logic (a,b);
		
		System.out.println(c);	
		
		int a1 = 3;
		int b1 = 2;
		
		int d;
		
		d=logic (a1,b1);
		
		System.out.println(d);
		
		
	}
}
