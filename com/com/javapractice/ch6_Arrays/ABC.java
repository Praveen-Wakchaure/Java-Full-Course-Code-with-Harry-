package com.javapractice.ch6_Arrays;

public class ABC {

	public static void main(String[] args) {
		
		int [] one = {1,2,3,4,5};
		
		int [] two = {6,7,8,9,10};
		
		int [] three = new int [5];
		
		for(int i=0; i<5;i++)
			
		{
			int a=one[i];
			int b=two[i];
			
			int c=a+b;
			
			three[i]=c;
			
			System.out.println(three[i]);
			
		}
		
		
	}
}
