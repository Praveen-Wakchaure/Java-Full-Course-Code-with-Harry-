package com.javapractice.ch7_Methods;

public class FibonacciSeries_34 {
	
	public static void main(String[] args) {
		
	int i=0;
	System.out.println(i);
	int n =10;
	int var1=1;
	int var2=0;
	for (i=0;i<=n;i++)
	{
		int out = var1+var2;
		System.out.println(out);
        var1=var2;
        var2=out;
	}
	}

	
	
}
