/*
 * 2. ������� ������ � �������. ���������� ���������� ���� � ������. ����������
������, ��� ����� ����� ����������� ����������� ���������, � ������ � �����
������ ����� ����� ���� �������, �� ����� � �������������.
 */

package by.academy.regulary;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2Regulary {
	public static void main(String[] args) {
		String s = " ����������      ���������� ���� ���� �  ������ .";

		Pattern p = Pattern.compile("[a-zA-Z�-��-�]+");
		Matcher m = p.matcher(s);

		int counter = 0;
		while (m.find()) {
			counter++;
		}
		System.out.println(s + counter);
	}
}
