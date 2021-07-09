package com.javapractice.ch14_ErrorsAndExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

class InputException extends InputMismatchException
{
	@Override
	public String toString() {
		
		return "Input must be Number";
	}
	
	@Override
	public String getMessage() {
		
		return "Input must be Number";
	}
}

class CannotDivideByZero extends ArithmeticException
{
	@Override
	public String toString() {
		
		return "Cannot divide by Zero";
	}
	
	@Override
	public String getMessage() {
		
		return "Cannot divide by Zero";
	}
}

class MaximumInputException extends Exception
{
	@Override
	public String toString() {
		
		return "Input should be less than 100000";
	}
	
	@Override
	public String getMessage() {
		
		return "Input should be less than 100000";
	}
}

class MaximumMultiplierReachedException extends Exception
{
	@Override
	public String toString() {
		
		return "For Multiplicatio - Maximum Multiplier should be less than 7000";
	}
	
	@Override
	public String getMessage() {
		
		return "For Multiplicatio - Maximum Multiplier should be less than 7000";
	}
}



public class CustomCalculator_Exe6_87 {
	
	public static double Addition(double a, double b) {
		
		double c=a+b;
		return c;
	}
	
	public static double Subtraction(double a, double b) {
		
		double c=a-b;
		return c;
	}
	
	public static double Multiplication(double a, double b) {
		
		double c=a*b;
		return c;
	}
	
	public static double Division(double a, double b) {
		
		double c=a/b;
		return c;
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try
		{
			System.out.println("......Multiplication........");
			System.out.println("Enter the first number");
			double x = sc.nextDouble();
			System.out.println("Enter the Second number");
			double y = sc.nextDouble();
			//Addition(x,y);
			if(x<100000 && y<100000 )
			{
				
				//Addition and Subtraction 
				
				System.out.println("Result of the Addition is :"+Addition(x, y));
				System.out.println("Result of the Subtraction is :"+Subtraction(x, y));
				
				
				//Multiplication
				
				if (x<7000 && y<7000)
				{
					System.out.println("Result of the Multiplication is :"+Multiplication(x, y));
				}
				else
				{
					MaximumMultiplierReachedException mm = new MaximumMultiplierReachedException();
					System.out.println(mm.getMessage());
				}
				
				//Division
				
				if (y>0 || y<0) 
				{
					System.out.println("Result of the Division is :"+Division(x, y));
				}
				
				else
				{
					CannotDivideByZero co = new CannotDivideByZero();
					System.out.println(co.getMessage());
				}
			}
			
			else
			{
				MaximumInputException mi = new MaximumInputException();
				System.out.println(mi.getMessage());
			}
	
		}
		catch (InputMismatchException e) {
			
			InputException ie = new InputException();
			System.out.println(ie.getMessage());
		}
		
		catch (Exception e) {
			System.out.println(e);
		}

	}

}
