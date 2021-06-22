package ch1ch2_Introduction;

import java.util.Scanner;

public class Exe1_CalculatePercentage_06 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the Marks of subject1 out of 100");
		
		float subject1 = sc.nextInt();
		
		System.out.println("Enter the Marks of subject2 out of 100");
		
		float subject2 = sc.nextInt();
		
		System.out.println("Enter the Marks of subject3 out of 100");
		
		float subject3 = sc.nextInt();
		
		System.out.println("Enter the Marks of subject4 out of 100");
		
		float subject4 = sc.nextInt();
		
		System.out.println("Enter the Marks of subject5 out of 100");
		
		float subject5 = sc.nextInt();
		
		float totalMarks = subject1 + subject2 + subject3+ subject4 +subject5;
		
		float percentage  = totalMarks/500 * 100;
				
		//
		
		System.out.println("percetage obtain=" + percentage);
		
		
		

	}

}
