package com.javapractice.ch10_Inheritance;

class Super
{
	public void Meth1() 
	{
		System.out.println("Method 1");
	}
	
	public void Meth2() 
	{
		System.out.println("Method 2");
	}
}

class Base extends Super
{
	@Override
	public void Meth2() 
	{
		System.out.println("Override");
	}
	
	public void Meth3() 
	{
		System.out.println("Method 3");
	}
}

public class DynamicMethodDespached_49 {

	public static void main(String[] args) {
		
		Super method = new Base();
		
      //Base method = new Super();  //<-- Not Allowed
		
		method.Meth1();     //<-- Super class method run
		
		method.Meth2();     //<-- Subclass Override method Runs
		
	  //method.Meth3();     //<-- Not Allowed
		
	}

}
