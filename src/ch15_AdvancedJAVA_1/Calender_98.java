package ch15_AdvancedJAVA_1;

import java.util.Calendar;
import java.util.TimeZone;

public class Calender_98 {

	public static void main(String[] args) {
		
		Calendar cd = Calendar.getInstance();
		
		System.out.println("Calender Type: "+cd.getCalendarType());
		
		System.out.println("Local Timezone: "+cd.getTimeZone());
		
		System.out.println("Seconds: "+cd.get(Calendar.SECOND));
		System.out.println("Hours: "+cd.get(Calendar.HOUR));
		System.out.println("Date: "+cd.get(Calendar.DATE));
		System.out.println("Month: "+cd.get(Calendar.MONTH));
		System.out.println("Year: "+cd.get(Calendar.YEAR));
		
		String a = cd.getCalendarType();
		System.out.println(a);
		
		System.out.println("Time: "+cd.getTime());
		
		System.out.println(cd.get(Calendar.MARCH));
		System.out.println(cd.get(Calendar.DAY_OF_WEEK));
		System.out.println("Hour of the Day: "+cd.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("Time--> "+cd.get(Calendar.HOUR)+":"+cd.get(Calendar.MINUTE)+":"+cd.get(Calendar.SECOND));
		
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Shanghai"));
		
		System.out.println(c.getTimeZone());

	}

}
