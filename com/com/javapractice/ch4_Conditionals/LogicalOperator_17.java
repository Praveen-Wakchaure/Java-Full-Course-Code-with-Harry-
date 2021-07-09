package com.javapractice.ch4_Conditionals;

public class LogicalOperator_17 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 1;
		int c = 3;
		
		if (a==b && c<5) {
			
			System.out.println("True");
			
		}else {
			System.out.println("False");
		}
		
		if (a==b || c>5){
			
			System.out.println("True");
			
		}else {
			System.out.println("False");
		}
		
        if (a==b && c>5 && c<5 || b!=a){
			
			System.out.println("True");
			
		}else {
			System.out.println("False");
		}
		
		if (a!=b){
			
			System.out.println("True");
			
		}else {
			System.out.println("False");
		}
	}

}
