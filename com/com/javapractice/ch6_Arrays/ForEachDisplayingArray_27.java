package com.javapractice.ch6_Arrays;

public class ForEachDisplayingArray_27 {
	
	public static void main(String[] args) {
		
		//Using For-Each loop
		
		int [] marks = {50,65,68,89,14};
		
	    System.out.println("For-Each loop");
		
		for (int element:marks)
		{
			System.out.println(element);
		}
		
		//Using For loop
		
		float [] marks1 = {50.5f,60.3f,68.9f};
		
		System.out.println("For loop");
		
		for(int i=0; i<marks1.length; i++)
		{
			System.out.println(marks[i]);
		}
		
		//Using normal method
		
		String [] marks2 = {"Praveen","Uttam","Wakchaure"};
		
		System.out.println("Normal Method-String printing");
		
		System.out.println(marks2[0]);
		System.out.println(marks2[1]);
		System.out.println(marks2[2]);

		
	}

}
