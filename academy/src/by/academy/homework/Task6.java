/*
 * ������� 6. 
������ ��� ������ � �������. ����������, �������� �� ���� ������ ������������� �������� ������ ������. ��������� �������. �� ������������ ���������� :) 
��������: 
1.	�hello� � �hlleo� -> true
2.	�hello� � �art� -> false
 */

package by.academy.homework;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		char[] c = a.toCharArray();

		int[] letters = new int[256];
		for (char q : c) {
			letters[q]++;
		}
		for (int i = 0; i < b.length(); i++) {
			int r = (int) b.charAt(i);
			if (--letters[r] < 0) {
				System.out.println("false");
				break;

			} else {
				System.out.println("true");
				break;

			}
		}
	sc.close();
	}
}
