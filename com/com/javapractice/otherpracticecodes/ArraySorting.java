package com.javapractice.otherpracticecodes;

import java.util.Arrays;

public class ArraySorting {
	
	public static void main(String[] args) {
	
		
		int[] a= new int[] {15,6,3,8,9,15,11,13,10};  
		
//		for (int i = 0; i < a.length; i++)   
//		{ 
//			for (int k = i + 1; k < a.length; k++)   
//			{  
//					int s = 0;  
//					if (a[i] > a[k])   
//			{  
//						s = a[i];  
//						a[i] = a[k];  
//						a[k] = s;  
//			}  
//		}   
//		System.out.println(a[i]);  
//		}  
		
		Arrays.sort(a);
		
		for (int i = 0 ; i < a.length ; i++)
		{
			System.out.println(a[i]);
		}
		
	}
	
}
