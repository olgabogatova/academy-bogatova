/*
 * 6. 
	�������� ������ ���������, ������� ��������� �� ���� ������ ���� HeavyBox � 
	������� �� ������� ��������� ���������� ���� � ����� n�. ����������� ���� � ����� n� 
	���������� �������������� ��������� Consumer � ����� �� ��������� andThen.
 */

package by.academy.classwork.lambda;

import java.util.function.Consumer;

import by.academy.classwork.collections.HeavyBox;

public class Task6 {

	public static void main(String[] args) {

		Consumer<HeavyBox> c = heavybox -> System.out.println("��������� ���� � ����� n");
		Consumer<HeavyBox> b = heavybox -> System.out.println("���������� ���� � ����� n");

		c.andThen(b).accept(new HeavyBox(11, 5, 6, 7));

	}
}