/*
 * ������� �����, ������� ��������������� ����� ����� (T). ����� ������ �������� ������ ���� T.
�������� ������ �����������, ������� �� ������� �������������� ������ ������ ����������� 16.
�������� �����������, ����������� �������� int � ������� �� ������ ������ �������.

 */


package by.academy.homework.homework3.task2;

import java.util.ArrayList;
import java.util.List;


public class Task2 <T> {

	private T item;
	private ArrayList<T>  a = new ArrayList <> (List.of(item));

		public Task2() {
			super();
			a =  new  ArrayList <T> (16);
		}
		
		public Task2(int b) {
			super();
			a =  new  ArrayList <T> (b);
		}
		
		 
		
	
}
