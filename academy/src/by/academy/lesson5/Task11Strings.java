/*
 * 11. »спользу€ оператор switch, написать программу, котора€ выводит на экран сообщени€ о принадлежности некоторого значени€ k интервалам (-10k, 5], [0, 10], [5, 15], [10, 10k].
 */

package by.academy.lesson5;

import java.util.Scanner;

public class Task11Strings {
	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number k");
		int k = sc.nextInt();
		String[] o = new String[] { "(-10000,5]", "[0,10]", "[5,15]", "[10,10000]" };
		for (String f : o) {

			switch (f) {
			case "(-10000,5]":
				if (k > -10000 && k <= 5) {
					System.out.println(k + " belongs to (-10000,5]");
				}
			case "[0,10]":
				if (k >= 0 && k <= 10) {
					System.out.println(k + " belongs to [0,10]");
				}
			case "[5,15]":
				if (k >= 5 && k <= 15) {
					System.out.println(k + " belongs to [5,15]");
				}
			case "[10,10000]":
				if (k >= 10 && k <= 10000) {
					System.out.println(k + " belongs to [10,10000]");
				}
			}
			break;
		}
		sc.close();
	}
}
