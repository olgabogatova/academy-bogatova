/*
 * 14. ������ ����� �� 1 �� 12. ������� �� ������� �������� ������, �������-��������� ������� �����. (����������� �������� ������������ ����� �����).
 */

package by.academy.lesson5;

import java.util.Scanner;

public class Task14Strings {
	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
		int monthName = sc.nextInt();
		switch (monthName) {
		case 1:
			System.out.println("������");
			break;
		case 2:
			System.out.println("�������");
			break;
		case 3:
			System.out.println("����");
			break;
		case 4:
			System.out.println("������");
			break;
		case 5:
			System.out.println("���");
			break;
		case 6:
			System.out.println("����");
			break;
		case 7:
			System.out.println("����");
			break;
		case 8:
			System.out.println("������");
			break;
		case 9:
			System.out.println("��������");
			break;
		case 10:
			System.out.println("�������");
			break;
		case 11:
			System.out.println("������");
			break;
		case 12:
			System.out.println("�������");
			break;
		default:
			System.out.println("����� ������� ������� ");
		}
		sc.close();
	}
}
