package ch1ch2_Introduction;

import java.util.Scanner;

public class CheckInteger_07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Integer") ;
		
		boolean a =sc.hasNextInt();
		
		System.out.println(a);
		
	}

}
