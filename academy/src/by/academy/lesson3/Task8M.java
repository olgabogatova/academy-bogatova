/*
 * ������ 8.
�������� ������ �� 12 ��������� ����� ����� �� ������� [-15;15]. 
���������� ����� ������� �������� � ���� ������� ������������ � �������� ������ ��� ���������� ��������� � ������.
 */


package by.academy.lesson3;

import java.util.Arrays;

public class Task8M {
	public static void main (String []args) {
		int [] array = new int [12];
	
		for (int i=0; i<array.length; i++) {
			array[i]=(int) (Math.random()*(-31)+16);
		}
		System.out.println(Arrays.toString(array));
		
		int max =array[0];
		int index=0;
		for (int i=1; i<array.length; i++) {
			if( array[i]>max) {
				max = array[i];
				index=i;
			
			}
		}System.out.println(max + " " +index);
	}
}
