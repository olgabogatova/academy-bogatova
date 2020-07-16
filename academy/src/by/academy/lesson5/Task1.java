/*
 * 1. Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
 */

package by.academy.lesson5;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of strings");
		int a = sc.nextInt();
		String[] array = new String[a];
		System.out.println(" Enter " + a + " strings ");

		for (int i = 0; i < a; i++) {

			array[i] = sc.next();
			System.out.println(array[i].length());
		}
		String min = array[0];
		String max = array[0];
		for (int i = 1; i < a; i++) {
			if (array[i].length() < min.length()) {
				min = array[i];
			} else if (array[i].length() > max.length()) {
				max = array[i];
			}
		}
		System.out.println("");
		System.out.println("The shortest string: " + min + "; its length:  " + min.length());
		System.out.println("The longest string: " + max + "; its length:  " + max.length());
		sc.close();
	}
}
