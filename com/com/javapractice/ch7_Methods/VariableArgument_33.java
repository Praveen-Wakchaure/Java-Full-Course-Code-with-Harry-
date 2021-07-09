package com.javapractice.ch7_Methods;

public class VariableArgument_33 {

	
	public static int sum (int ...arr)  //<-- Variable arguments 
	{
		
	   int result = 0;
	     	
	   for(int a:arr)
		{
			result += a;		
		}	
	   return result;
	}
	
	public static void main(String[] args) {
		
		System.out.println("result= " +sum(1));
		
		System.out.println("result= " +sum(1,2,3));
		
		System.out.println("result= " +sum(1,2,3,4));
		
		System.out.println("result= " +sum(1,2,3,50));
		
		System.out.println("result= " +sum(1,2,3,44));
	}

}
