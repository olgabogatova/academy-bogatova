/*
 * ������ 3.
�������� ������ �� 15 ��������� ����� ����� �� ������� [0;9]. 
�������� ������ �� �����. ����������� ������� � ������� ������ ��������� � �������� ��� ���������� �� ����� �� ��������� ������.
 */

package by.academy.lesson3;

import java.util.Random;

public class Task3M {
public static void main (String[] args) {
	int [] array = new int [15];
	Random rand = new Random();
	int count=0;
	for ( int i=0; i<array.length; i++) {
		array[i] = rand.nextInt(10);
		System.out.print(array[i] + " ");
			if (array[i]%2==0) {
				count++;
			}
	}
	System.out.println(" ");
	System.out.println(count)	;	
}
}
