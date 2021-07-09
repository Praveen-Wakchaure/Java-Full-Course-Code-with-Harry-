package com.javapractice.ch4_Conditionals;

import java.util.Scanner;

public class RelationalOperators_16 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Age in Year");
		
		int age = sc.nextInt();
				
				if(age>18)
				{
					System.out.println("You can drive");
				}
				else
				{
					System.out.println("You cannot drive");
				}
				
				sc.close();
				
		///////////////////////////
				
		int age1=25;
		
		boolean condition = age1==25;
		
		if(condition)
		{
			System.out.println("You can drive");
		}
		else
		{
			System.out.println("You cannot drive");
		}
	}
	

}
