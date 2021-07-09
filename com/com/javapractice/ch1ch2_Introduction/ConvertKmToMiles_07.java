package com.javapractice.ch1ch2_Introduction;

import java.util.Scanner;

public class ConvertKmToMiles_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Km Value");
		
		double Km = sc.nextDouble();
		
		double Miles= Km * 0.621371;
		
		System.out.println("Miles=" + Miles);
		
		sc.close();
		
		

		
	}

}
