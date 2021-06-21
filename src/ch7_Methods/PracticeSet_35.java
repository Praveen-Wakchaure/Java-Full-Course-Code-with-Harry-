package ch7_Methods;

import java.util.Scanner;
public class PracticeSet_35 {
		
/*	//1
	
	static void Multiplication(int n)
	{
		int a;
		for (int i=1;i<=10;i++)
		{
		a=n*i;
		System.out.println(n +"x"+i+"="+a);
		}	
	}
*/
	
	//2
	
	static void Star(String n)
	
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=0; j<i; j++)
			{
				System.out.print(n);
			}
			System.out.println();
		}
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
/*		//1
		System.out.println("Enter the table");
		
		int x = sc.nextInt();
		
        Multiplication(x);
*/		
		
		//2
		
		Star("*");
		
		
		
	}

}
