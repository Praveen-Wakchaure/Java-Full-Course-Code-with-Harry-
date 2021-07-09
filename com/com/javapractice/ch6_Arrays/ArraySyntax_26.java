package com.javapractice.ch6_Arrays;

public class ArraySyntax_26 {
	public static void main(String[] args) {
		
//		int [] marks;
//		marks= new int [5];              //<---1st method
		
		int [] marks = new int [5];      //<--- 2nd method
		
		marks[0]=100;
		marks[1]=60;
		marks[2]=70;
		marks[3]=80;
		marks[4]=90;
		
		System.out.println(marks[4]);
		
		int [] marks1 = {50,45,46,3,65}; //<--- 3rd method
		
		System.out.println(marks1[3]);
		
		
	}

}
