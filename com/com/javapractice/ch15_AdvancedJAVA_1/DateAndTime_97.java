package com.javapractice.ch15_AdvancedJAVA_1;

import java.util.Date;

public class DateAndTime_97 {

	public static void main(String[] args) {

		Date d = new Date();
		
		System.out.println("Current Date and Time: "+d);
		
		System.out.println("Current Milliseconds Pass Since 1 Jan 1970: "+d.getTime());
		System.out.println("");
		
		
		System.out.println("Current Seconds Pass: "+d.getSeconds());
		System.out.println("");
		
		System.out.println("Current Minutes: "+d.getMinutes());
		System.out.println("");
		
		System.out.println("Todays hours Pass: "+d.getHours());
		System.out.println("");
		
		System.out.println("Current Days Pass: "+d.getDay());
		System.out.println("");

		
		System.out.println("Current Months Pass: "+d.getMonth());
		System.out.println("");
		
		System.out.println("Current Year Pass Since 1900: "+d.getYear());
		System.out.println("");

	}

}
