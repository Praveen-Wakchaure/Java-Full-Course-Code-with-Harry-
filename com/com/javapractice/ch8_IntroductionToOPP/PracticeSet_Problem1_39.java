package com.javapractice.ch8_IntroductionToOPP;

import java.util.Scanner;

class Employee
{
	//Properties
	
	int salary;
	String name;
	
	//Methods
	
	 public String getName()
	 {
		 return name;
	 }
	 
	 public int getSalary()
	 {
		 return salary;
	 }
	 
	 public void setName(String n)
	 {
		 name=n;
	 }	 
	 	 
}

public class PracticeSet_Problem1_39 {

	public static void main(String[] args) {
		
		Employee manoj = new Employee();
		manoj.salary=3000;
		
		manoj.setName("Manoj Vajpayee");
		System.out.println("Name is :"+manoj.getName());
		System.out.println("Salary is :"+manoj.getSalary());
		
	}

}
