/*������� 3.
������ � ������� ����� �� 1 �� 10, ������� �� ����� ������� ��������� ��� ����� �����. (10 �����).
*/

package by.academy.homework;

import java.util.Scanner;

public class Task3 {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ������� ����� �� 1 �� 10 ");
		int a = sc.nextInt();
		System.out.println("������� ��������� ��� ����� " + a);
		for (int i = 1; i <= 10; i++) {
			int y = 1;
			y = a * i;
			System.out.println(a + " * " + i + " = " + y + ";");
		}
		sc.close();
	}
}
