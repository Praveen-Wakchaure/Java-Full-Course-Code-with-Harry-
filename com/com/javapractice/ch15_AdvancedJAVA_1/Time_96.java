package com.javapractice.ch15_AdvancedJAVA_1;

public class Time_96 {

	public static void main(String[] args) {

		System.out.println("Long Value: "+Long.MAX_VALUE);
		
		//Milliseconds Stored in Long Format
		
		System.out.println("");
		
		System.out.println("Current Milliseconds Pass Since 1 Jan 1970: "+System.currentTimeMillis());
		System.out.println("");
		
		System.out.println("Current Seconds Pass Since 1 Jan 1970: "+System.currentTimeMillis()/1000);
		System.out.println("");
		
		System.out.println("Current Minutes Pass Since 1 Jan 1970: "+System.currentTimeMillis()/1000/60);
		System.out.println("");
		
		System.out.println("Current hours Pass Since 1 Jan 1970: "+System.currentTimeMillis()/1000/3600);
		System.out.println("");
		
		System.out.println("Current Days Pass Since 1 Jan 1970: "+System.currentTimeMillis()/1000/3600/24);
		System.out.println("");

		System.out.println("Current Weeks Pass Since 1 Jan 1970: "+System.currentTimeMillis()/1000/3600/24/7);
		System.out.println("");
		
		System.out.println("Current Months (Approx.) Pass Since 1 Jan 1970: "+System.currentTimeMillis()/1000/3600/24/30);
		System.out.println("");
		
		System.out.println("Current Year Pass Since 1 Jan 1970: "+System.currentTimeMillis()/1000/3600/24/365);
		System.out.println("");
	}

}
