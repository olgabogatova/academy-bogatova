/*
 *7 .
	�������� ������ ���������, ������� ��������� �� ���� ����� � ���������� �������� 
	�������������� �����, �������������� ����� ���  ������.
	���������� �������������� ��������� Function.
 */

package by.academy.classwork.lambda;

import java.util.Scanner;
import java.util.function.Function;

public class Task7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Function<Integer, String> n = c -> {
			if (c > 0)
				System.out.println("������������� �����");
			if (c < 0)
				System.out.println("������������� �����");
			if (c == 0)
				System.out.println("����");
			return null;
		};
		n.apply(5);
		n.apply(0);
		n.apply(10);
		n.apply(-5);
		n.apply(-15);
		
	sc.close();	
	}
}
