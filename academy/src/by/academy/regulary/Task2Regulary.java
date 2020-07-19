/*
 * 2. »меетс€ строка с текстом. ѕодсчитать количество слов в тексте. ∆елательно
учесть, что слова могут раздел€тьс€ несколькими пробелами, в начале и конце
текста также могут быть пробелы, но могут и отсутствовать.
 */

package by.academy.regulary;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2Regulary {
	public static void main(String[] args) {
		String s = " ѕодсчитать      количество всех слов в  тексте .";

		Pattern p = Pattern.compile("[a-zA-Zа-€ј-я]+");
		Matcher m = p.matcher(s);

		int counter = 0;
		while (m.find()) {
			counter++;
		}
		System.out.println(s + counter);
	}
}
