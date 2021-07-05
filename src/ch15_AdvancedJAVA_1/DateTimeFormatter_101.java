package ch15_AdvancedJAVA_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatter_101 {

	public static void main(String[] args) {
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("LocalDateTime: "+dt);
		
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	    String myDate = dt.format(dtf);
	    System.out.println("Formatted Date: "+myDate);
	    
	    DateTimeFormatter dtf2 = DateTimeFormatter.ISO_DATE;
	    String myDate1 = dt.format(dtf2);
	    System.out.println("Formatted Date: "+myDate1);

	}

}
