/*
 * 3. Ввести n строк с консоли. Вывести на консоль те строки, длина которых меньше (больше) средней, а также длину.
 */

package by.academy.lesson5;

import java.util.Scanner;

public class Task3Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of strings");
		int a = sc.nextInt();
		String[] array = new String[a];
		System.out.println(" Enter " + a + " strings ");
		for (int i = 0; i < a; i++) {
			array[i] = sc.next();
		}
		double mediana = 0;
		for (int i = 0; i < a; i++) {
			mediana += array[i].length();
		}
		mediana = (double) mediana / a;
		System.out.println("Average length : " + mediana);
		System.out.println(" ");
		System.out.println("The length of strings shorter than average: ");

		for (int i = 0; i < a; i++) {
			if (array[i].length() < mediana) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println(" ");
		System.out.println("The length of strings longer than average: ");
		for (int i = 0; i < a; i++) {
			if (array[i].length() > mediana) {
				System.out.print(array[i] + " ");
			}
		}
		sc.close();
	}
}
