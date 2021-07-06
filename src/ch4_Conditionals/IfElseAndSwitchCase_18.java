package ch4_Conditionals;

import java.util.Scanner;

public class IfElseAndSwitchCase_18 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age");
		
		int age = sc.nextInt();
		
		//if...else if...if
		
		if (age<3) 
		{
			System.out.println("Baby");
		}
		else if (age>2 && age<18)
		{
			System.out.println("Student");
		}
		else if (age>17 && age<30)
		{
			System.out.println("Adult");
		}
		else if (age>29 && age<60)
		{
			System.out.println("Responsible");
		}
		else
		{
			System.out.println("Old");
		}
		
		//switch...case
		
		switch (age) {
		
		case (3):System.out.println("Baby");
			
		break;
		
		case (18):System.out.println("Adult");
		
		break;
		
		case(60):System.out.println("Old");
			
		break;
			
		default:System.out.println("Thank You");
		break;
		}
		
		//Enhanced switch...case ---> Supported JAVA 14 and Above (No break statement required)
		
//		switch (age) {
//		case (3)->System.out.println("Baby");
//		case (18)->System.out.println("Adult");
//		case(60)->System.out.println("Old");
//		default->System.out.println("Thank You");
//		}
	}  

}
