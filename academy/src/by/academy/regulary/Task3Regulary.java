/*
 * 3. Имеется строка с текстом. Вывести текст, составленный из последних букв
всех слов
 */


package by.academy.regulary;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3Regulary {
	public static void main ( String []args) {
		String s = "Вывести текст, составленный из последних букв всех слов";
		String result = new String();
		
		Pattern p = Pattern.compile("[a-zA-Zа-яА-Я]+");
		Matcher m = p.matcher(s);

		
		while (m.find()) {
			result += s.substring(m.end()-1, m.end());
		}
			
		System.out.println(s  + "\n" + result);
	}
	}

