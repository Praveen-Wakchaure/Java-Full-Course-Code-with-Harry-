package com.javapractice.ch16_AdvanceJava_2;

@FunctionalInterface
interface DemoLambda
{
	void method1(int a, int b, int c);
	//void method2(int a);

}

public class LambdaExpression_109 {

	public static void main(String[] args) {

		DemoLambda dl =(a,b,c)->{System.out.println("This is method 1: "+a+b+c);};    //Lambda Expression
		
		//DemoLambda dl =(5)->{System.out.println("This is method 2");}; 
		
		dl.method1(5,6,7);      //Method 1 is automatically called
	}

}
