/*
 * 5. ¬вести n слов с консоли. Ќайти количество слов, содержащих только символы латинского алфавита, а среди них Ц количество слов с равным числом гласных и согласных букв.
 */

package by.academy.lesson5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pattern p = Pattern.compile("[a-z]\\S*");

		System.out.println("Enter the number of words");
		int a = sc.nextInt();
		String[] words = new String[a];
		System.out.println(" Enter " + a + " words ");
		sc.nextLine();
		
		int count = 0;
		int wordsVC = 0;
		char[] vowels = { 'e', 'y', 'u', 'i', 'o', 'a' };
		char[] consonants = { 'q', 'w', 'r', 't', 'p', 's', 'd', 'f', 'g', 'h', 'k', 'j', 'l', 'z', 'x', 'c', 'v', 'b',
				'n', 'm' };

		for (int i = 0; i < words.length; i++) {
			words[i] = sc.nextLine();
			words[i].toLowerCase();
			words[i].toCharArray();
			Matcher m = p.matcher(words[i]);
			int countVowels = 0;
			int countConsonants = 0;
			while (m.find()) {
								
				for (int j = 0; j < words[i].length(); j++) {
					
					for (int n = 0; n < vowels.length; n++) {
						if (words[i].charAt(j) == vowels[n]) {
							countVowels++;
						}
					}

					for (int x = 0; x < consonants.length; x++) {
						if (words[i].charAt(j) == consonants[x]) {
							countConsonants++;
						}
					}
				}
				if (countConsonants == countVowels) {
					wordsVC++;
				}
				count++;
			}
		}
		System.out.println("There are  " + count + " words containing only letters of the Latin alphabet.");
		System.out.println("Among them there are " + wordsVC + " words with the same number of vowels and consonants.");
		sc.close();
	}
}
