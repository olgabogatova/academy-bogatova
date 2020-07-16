/*
 * 2. ¬вести n строк с консоли. ”пор€дочить и вывести строки в пор€дке возрастани€ (убывани€) значений их длины.
 */

package by.academy.lesson5;

import java.util.Scanner;

public class Tassk2Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of strings");
		int a = sc.nextInt();
		String[] array = new String[a];
		System.out.println(" Enter " + a + " strings ");
		for (int i = 0; i < a; i++) {
			array[i] = sc.next();
		}
		System.out.println(" ");

		for (int i = 0; i < a; i++) {
			for (int j = 1; j < a; j++) {
				if (array[j - 1].length() > array[j].length()) {
					String first = array[j - 1];
					array[j - 1] = array[j];
					array[j] = first;
				}
			}
		}

		for (int i = 0; i < a; i++) {
			System.out.println(array[i] + ": " +array[i].length() + " symbols");
		}
		System.out.println(" ");

		for (int x = 0; x < a; x++) {
			for (int j = 1; j < a; j++) {
				if (array[j - 1].length() < array[j].length()) {
					String first = array[j];
					array[j] = array[j - 1];
					array[j - 1] = first;
				}
			}
		}

		for (int x = 0; x < a; x++) {
			System.out.println(array[x] + ": " + array[x].length()+ " symbols");
		}
		sc.close();
	}
}
