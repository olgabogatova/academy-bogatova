/*
 * ������ 7.
�������� ������ �� 20-�� ������ ����� ��������� � �������� ��� �� �����. 
����������, ��� ������ � ������ ����� ������������������ ����� ��������, � ������ ��������� � ����� ���� ����������.
 * 
 */


package by.academy.lesson3;

public class Task7M {
	public static void main ( String [] args) {
		int [] array = new int [20];
		array[0]=1;
		array[1]=1;
		System.out.println( array[0]);
		System.out.println( array[1]);
		for ( int i = 2; i< array.length; i++) {
			array[i]=array[i-1]+array[i-2];
			System.out.println( array[i]);
		}
	}
}
