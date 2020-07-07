/*
 ������� 2.
���������� switch/case. ������ � ������� ��� ������(��������� � String) � ����������, ������� �� �����:
	a) ���� ��� ������ int, ������� ������� �� ������� �� 2
	b) ���� double, ������� 70% �� ����� 
	c) ���� float, �������� � �������
	d) ���� char, ������� ��� �������
	e) String, ������� �� ����� ������ � ���� ("Hello " + ����������)
	f) �� ���� ��������� ������� ������� �� ����� ("Unsupported type");
 */

package by.academy.homework;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ��� ������");
		String dataType = sc.nextLine();
		System.out.println("������� ����������");
		switch (dataType) {
		case "Int":
		case "int":
			int a = sc.nextInt();
			System.out.println(a = a % 2);
			break;
		case "Double":
		case "double":
			double b = sc.nextDouble();
			System.out.println(b *= 0.7);
			break;
		case "Float":
		case "float":
			float c = sc.nextFloat();
			System.out.println(c *= c);
			break;
		case "Char":
		case "char":
			char d = sc.next().charAt(0);
			System.out.println((int) d);
			break;
		case "String":
		case "string":
			String e = sc.nextLine();
			System.out.println("Hello " + e);
			break;
		default:
			System.out.println("Unsupported type");
		}
		sc.close();
	}
}
