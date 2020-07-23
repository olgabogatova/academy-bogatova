/*
 * 2. Ќаписать RegExp который провер€л бы введенную дату на соответствие патерна:
   a) dd/MM/yyyy
   b) dd-MM-yyyy 
 */

package by.academy.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Task2GegEx {
	public static Pattern p1 = Pattern.compile("([0]?[1-9]|[1|2][0-9]|[3][0|1])/([0]?[1-9]|1[0-2])/\\d{4}"); // a
	public static Pattern p2 = Pattern.compile("([0]?[1-9]|[1|2][0-9]|[3][0|1])-([0]?[1-9]|1[0-2])-\\d{4}"); // b
	public static void main(String[] args) {

//		String[] test = { "50/50/9999", "00/00/0000", "13/12/2020", "9/9/2020" , "50-50-9999", "00-00-0000", "13-12-2020", "9-9-2020" };
		
		String[] test1 = { "50/50/9999", "00/00/0000", "13/12/2020", "9/9/2020" };
		String[] test2 = { "50-50-9999", "00-00-0000", "13-12-2020", "9-9-2020" };
		
//
		
//		for (String t : test) {
//			Matcher m1 = p1.matcher(t);
//			Matcher m2 = p2.matcher(t);
//			if (m1.find()) {
//				System.out.println(m1.group(0));
//			} else if (m2.find())	{
//				System.out.println(m2.group(0));
//			} 
//			else {
//				System.out.println("failed");
//			}
//
//		}
		
		for (String t : test1) {
			Matcher m1 = p1.matcher(t);
			if (m1.find()) {
				System.out.println(m1.group(0));
			} else {
				System.out.println("failed");
			}

		}
		
		for (String t : test2) {
			Matcher m2 = p2.matcher(t);
			if (m2.find()) {
				System.out.println(m2.group(0));
			} else {
				System.out.println("failed");
			}
		}
		
	}	
	public static boolean isValidDateString(String stringDate) {
		Matcher m1 = p1.matcher(stringDate);
		if (m1.find()) {
			return true;
		}
		Matcher m2 = p2.matcher(stringDate);
		if (m2.find()) {
			return true;
		}
		return false;
	}
	
	
}
