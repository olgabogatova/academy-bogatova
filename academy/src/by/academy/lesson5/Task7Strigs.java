/*
 * 7. Ввести n слов с консоли. Найти слово, состоящее только из различных символов. 
Если таких слов несколько, найти первое из них.
 */
package by.academy.lesson5;

import java.util.Scanner;

public class Task7Strigs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of words");
		int a = sc.nextInt();
		String[] words = new String[a];
		System.out.println(" Enter " + a + " words ");
		sc.nextLine();
		String result = " ";
		for (int i = 0; i < words.length; i++) {
			words[i] = sc.nextLine();
		}
		System.out.println(" ");

		for (int i = 0; i < words.length; i++) {
			int currentUniqueCounter = 0;
			char[] chaar = new char[66000];

			for (char c : words[i].toCharArray()) {
				chaar[c]++;
			}
			for (char c : chaar) {
				if (c > 0) {
					currentUniqueCounter++;
				}
			}
			if (currentUniqueCounter == words[i].length()) {
				result = words[i] + " ";
				result.split(" ");
				System.out.print(result + " ");

				break;
			}
		}
		sc.close();
	}
}
