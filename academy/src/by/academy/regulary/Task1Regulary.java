/*
 * ����� � ������ �� ������ ������� , ��  � ������ ����� ����������.������� �� ����� ����������
 */


package by.academy.regulary;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1Regulary {
public static void main ( String []args) {
	String s ="����� � ������ �� ������ ������� , ��  � ������ ����� ����������...������� �� ����� ����������!";
	
	long startMS = System.currentTimeMillis();
	
	Pattern p = Pattern.compile("[,.!]");
	Matcher m = p.matcher(s);
	
	int counter =0;
	while (m.find()) {
		counter++;
	}
	
	System.out.println(counter);
	
	long endMS = System.currentTimeMillis();
	System.out.println(endMS-startMS);
}
}
