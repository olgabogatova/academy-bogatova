/*
 * 3. ������� ������ � �������. ������� �����, ������������ �� ��������� ����
���� ����
 */


package by.academy.regulary;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3Regulary {
	public static void main ( String []args) {
		String s = "������� �����, ������������ �� ��������� ���� ���� ����";
		String result = new String();
		
		Pattern p = Pattern.compile("[a-zA-Z�-��-�]+");
		Matcher m = p.matcher(s);

		
		while (m.find()) {
			result += s.substring(m.end()-1, m.end());
		}
			
		System.out.println(s  + "\n" + result);
	}
	}

