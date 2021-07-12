package com.javapractice.otherpracticecodes;

class Addition
{
	int a;
	int b;
	int sum;
public final void add() {
	
	this.a=5;
	this.b=10;
	this.sum=a+b;
	System.out.println(sum);
}	
}

class Multiplication extends Addition
{
	int a;
	int b;
	int mul;
	
	public void multiply() {
		
		super.add();
		
		this.a=10;
		this.b=10;
		this.mul=a*b;
		System.out.println(mul);
		
		System.out.println(sum);
	}
}

public class UsingSuperAndThisKeywords {

	public static void main(String[] args) {
		
		Addition a= new Addition();
		a.add();
		
		Multiplication m = new Multiplication();
		m.multiply();
		
		
		
	}
}
