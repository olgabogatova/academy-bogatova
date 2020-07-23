/*
 * 10. »спользу€ оператор switch, написать программу, котора€ выводит на экран сообщени€ о принадлежности некоторого значени€ k интервалам (-10k, 0], (0, 5], (5, 10], (10, 10k].
 */

package by.academy.lesson5;

import java.util.Scanner;

public class Task10Strings {
	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number k");
		int k = sc.nextInt();
		String[] o = new String[] { "(-10000,0]", "(0,5]", "(5,10]", "(10,10000]" };
		for (String f : o) {
			switch (f) {
			case "(-10000,0]":
				if (k > -10000 && k <= 0) {
					System.out.println(k + " belongs to (-10000,0]");
					break;
				}
			case "(0,5]":
				if (k > 0 && k <= 5) {
					System.out.println(k + " belongs to (0,5]");
					break;
				}
			case "(5,10]":
				if (k > 5 && k <= 10) {
					System.out.println(k + " belongs to (5,10]");
					break;
				}
			case "(10,10000]":
				if (k > 10 && k <= 10000) {
					System.out.println(k + " belongs to (10,10000]");
					break;
				}
			default:
				System.out.println(k + " is out of any interval");
			}
			break;
		}
		sc.close();
	}
}