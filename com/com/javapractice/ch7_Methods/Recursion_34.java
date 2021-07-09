package com.javapractice.ch7_Methods;

import java.util.Scanner;

public class Recursion_34 {

	static Scanner sc = new Scanner(System.in);
	
	static int factorial(int n) 
	
	{
		if(n==1 || n==0)
		{
			return 1;
		}
		else
		{
			return n * factorial(n-1);
		}
		
	}
	
	public static void main(String[] args) {
		
    System.out.println("Enter Number");
    
    int n = sc.nextInt();

    System.out.println("Factorial of given number is = "+factorial(n));
		
		
		
		
	}

}
