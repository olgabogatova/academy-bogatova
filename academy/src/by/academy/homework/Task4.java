/*
 * ������� 4.
�������� �� ������� ������� ������, ���� ��������� �� ����� ������, ��� 1_000_000. 
 */

package by.academy.homework;

public class Task4 {
	public static void main(String[] args) {
		int i = 0;
		for (int a = 2; a < 1000000; a *= 2) {
			i++;
			System.out.println(2 + " � ������� " + i + " ����� " + a);
		}
	}
}
