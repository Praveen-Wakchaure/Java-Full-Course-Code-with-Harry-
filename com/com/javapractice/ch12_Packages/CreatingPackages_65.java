package com.javapractice.ch12_Packages;

import com.javapractice.ch7_Methods.*;

public class CreatingPackages_65 {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		System.out.println("Enter the number");
		
		int a = sc.nextInt();
		
		System.out.println("Your entered number is: "+a);
		
		FibonacciSeries_34 fs = new FibonacciSeries_34();
		
		System.out.println(fs);
		 
}
}