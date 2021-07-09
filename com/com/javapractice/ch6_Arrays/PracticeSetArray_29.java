package com.javapractice.ch6_Arrays;

import java.util.Scanner;

public class PracticeSetArray_29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
/*		//1
		
		float[] array = {10.5f,10.5f,10.5f,10.5f,10.5f};
		float sum=0f;
		for(int i=0; i<array.length;i++)
		{
			sum+=array[i]; 
		}
        System.out.println(sum);
*/
		
/*		//2
		
		int [] array = {20,32,56,14,50};
		
		System.out.println("Enter array number to be find");
		
		int n = sc.nextInt();
		
		boolean isInArray = false;
		
        for(int element:array)
        {
        	if(n==element)
        	{
        		isInArray=true;
        		break;
        	}
        }
        if(isInArray)
        {
        	System.out.println("Element is here");
        }
        else
        {
        	System.out.println("Element not found");
        }
*/		
		//3
		
		float [] physics = {45,45,45,55,55,55};
		
		float average=0;
		float sum = 0;
		
		for(int i=0; i<physics.length;i++)
		{
			sum+=physics[i];
		}
		
		average=sum/physics.length;
		
		System.out.println("Average = " + average);
		
		
		
		
		
	}

}
