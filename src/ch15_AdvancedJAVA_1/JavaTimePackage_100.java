package ch15_AdvancedJAVA_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JavaTimePackage_100 {

	public static void main(String[] args) {

		LocalDate d = LocalDate.now();
		System.out.println("Local Date: "+d);
		
		LocalTime t = LocalTime.now(); 
		System.out.println("Local time: "+t);
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);

	}

}
