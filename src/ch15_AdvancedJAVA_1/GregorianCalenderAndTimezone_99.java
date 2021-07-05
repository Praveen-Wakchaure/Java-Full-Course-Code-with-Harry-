package ch15_AdvancedJAVA_1;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class GregorianCalenderAndTimezone_99 {
	
	public static void main(String[] args) {
		
		GregorianCalendar gc = new GregorianCalendar();
		
		System.out.println("Leap Year Checking: "+gc.isLeapYear(2015));
		
		System.out.println(gc.getCalendarType());
		
		System.out.println(gc.getFirstDayOfWeek());
		
		System.out.println(gc.SECOND);
		
		//............Time zone...........
		
		System.out.println("Available Time Zones IDs");
		
		for(int i=0; i<628; i++)              //There are total 628 Time zone IDs available
		{
			System.out.println(TimeZone.getAvailableIDs()[i]);
		}
		
		System.out.println("Default Timezone: "+TimeZone.getDefault());
		
		System.out.println(TimeZone.getTimeZone("SST"));
	}

}
