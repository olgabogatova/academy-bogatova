/*
 * 15. ������� �����: ������ 2 �����, ��������� �� ������� ����� ����. �������� ����� ��������� �� ������ �������� ������� ����� � ������ �������� ������� �����.
 */

package by.academy.lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class Task15stringss {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter 2 words containing even letters number ");

		String one = sc.nextLine();
		String two = sc.nextLine();
		if (one.length() % 2 != 0) {
			System.out.println("The first word has odd number of letters");
		}
		if (two.length() % 2 != 0) {
			System.out.println(" The second word has odd number of letters");
		} else {
			String result = one.substring(0, one.length() / 2) + two.substring(two.length() / 2, two.length());
			System.out.println(result);
		}
		sc.close();
	}
}
