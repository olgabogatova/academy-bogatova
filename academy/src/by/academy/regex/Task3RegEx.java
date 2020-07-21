package by.academy.regex;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task3RegEx {
	public static SimpleDateFormat format1 = new SimpleDateFormat ("d/M/yyyy");
	public static SimpleDateFormat format2 = new SimpleDateFormat ("d-M-yyyy");
	
	public static void main ( String [ ] args) throws ParseException  {
		
		String[] test1 = { "50/50/9999", "00/00/0000", "13/12/2020", "9/9/2020" };
		String[] test2 = { "50-50-9999", "00-00-0000", "13-12-2020", "9-9-2020" };
		
		
		
		for ( String t : test1) {
			boolean isValid = Task2GegEx.isValidDateString(t);
			if ( isValid) {
				Date date = format1.parse(t);
				System.out.println(date);
				
				Calendar c= new GregorianCalendar();
				c.setTime(date);
				c.add(Calendar.MONTH, 3);
				c.add(Calendar.DAY_OF_MONTH, 2);
				c.add(Calendar.HOUR, 4);
				System.out.println(format1.format(c.getTime()));
				
			}
		}
		
		for ( String t : test2) {
			boolean isValid = Task2GegEx.isValidDateString(t);
			if ( isValid) {
				Date date = format2.parse(t);
				System.out.println(date);
				Calendar c= new GregorianCalendar();
				c.setTime(date);
				c.add(Calendar.MONTH, 3);
				c.add(Calendar.DAY_OF_MONTH, 2);
				c.add(Calendar.HOUR, 4);
				System.out.println(format2.format(c.getTime()));
	}
}
	}
}
