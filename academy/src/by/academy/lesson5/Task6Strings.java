/*
 * . Ввести n слов с консоли. Найти слово, символы в котором идут в стро-гом порядке возрастания их кодов. Если таких слов несколько, найти первое из них.
 */

package by.academy.lesson5;


import java.util.Scanner;

public class Task6Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of words");
		int a = sc.nextInt();
		String[] words = new String[a];
		System.out.println(" Enter " + a + " words ");
		sc.nextLine();
		String result = "";
		for (int i = 0; i < words.length; i++) {
			words[i] = sc.nextLine();
			words[i].toCharArray();

			for (int j = 1; j < words[i].length(); j++) {

				if ((int) words[i].charAt(j - 1) > (int) words[i].charAt(j)) {

					if ((int) words[i].charAt(j - 1) <= (int) words[i].charAt(j)) {

						break;
					}
					words[i] = "";
					break;
				}
			}
			if (words[i] != "") {
				result += words[i] + " ";
			}
		}
		String[] array = result.split(" ");
		System.out.println(array[0]);
		sc.close();
	}
}
