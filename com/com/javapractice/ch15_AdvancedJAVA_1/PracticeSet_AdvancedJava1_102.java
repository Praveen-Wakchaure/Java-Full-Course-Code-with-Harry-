package com.javapractice.ch15_AdvancedJAVA_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class PracticeSet_AdvancedJava1_102 {

	public static void main(String[] args) {

/*
//......................1..........................
		
		ArrayList<String> sn = new ArrayList<>();
	    sn.add("A A A");
	    sn.add("B B B");
	    sn.add("C C C");
	    sn.add("D D D");
	    sn.add("E E E");
	    sn.add("F F F");
	    sn.add("G G G");
	    sn.add("H H H");
	    sn.add("I I I");
	    sn.add("J J J");
	    
	    System.out.println("Student Names: ");
	    
	    for (int i=0; i<10;i++)
	    {
	    	System.out.println(sn.get(i));
	    }
*/
		
/*
//....................2.........................
		
		//Using Date class
		
		Date d = new Date();
		System.out.println("New Time Format Using Date Class: "+d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

		//Using Time API
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println("Default Date-Time Format: "+dt);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		String Mydate = dt.format(dtf);
		System.out.println("New Time Format Using Time API: "+Mydate);
	
		//Using Calendar Class
		Calendar c = Calendar.getInstance();
		System.out.println("New Time Format Using Calendar class: "+c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
*/
		
/*		
//..................5...................
		
		HashSet<Integer> s = new HashSet<>();
		
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(4);
		s.add(5);
			
	    	System.out.println(s);  //Duplicate Element Cannot Store in Set
*/	  	
	}

}
