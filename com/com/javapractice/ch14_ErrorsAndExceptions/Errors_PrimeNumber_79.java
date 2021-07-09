package com.javapractice.ch14_ErrorsAndExceptions;

import java.util.Scanner;

public class Errors_PrimeNumber_79 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		  //int i=0   // Syntax error (Semicolon needed)
		
	      int i =0;
	      int num =0;
	      //Empty String
	      //String  primeNumbers = "";
	      int primeNumbers=0;
	      System.out.println("Enter the value of n:");
	      
	      int n = scanner.nextInt();  //If we enter non-integer value, it gives runtime error, i.e. Exception (InputMismatchException)
	      
	      System.out.println("Prime numbers from 1 to " +n + " are: ");
	      scanner.close();
	      for (i = 1; i <= n; i++)  	   
	      { 		 		  
	         int counter=0; 		  
	         for(num =i; num>=1; num--)
	         {
	        	 if(i%num==0)
	        	 {
	        		 counter = counter + 1;
	        	 }
	         }
	         if (counter ==2)
	         {
	        	 //Appended the Prime number to the String
	        	 //primeNumbers = primeNumbers + i + " ";
	        	 
	        	 primeNumbers=i;
	        	 System.out.println(primeNumbers);
	         }	
	      }	
//	      System.out.println("Prime numbers from 1 to n are :");
//	      System.out.println(primeNumbers);
	   }
	}

