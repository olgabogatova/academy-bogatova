/*
 * 12. �������� ���������, ������� ������� ����� �� 1 �� 25 � ���� ������� 5x5 ����� ������� � ������ ����.

 */

package by.academy.lesson5;

public class Task12Strings {
	public static void main(String[] args) {
		int[][] matrix = new int[5][5];
		int start = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println();
			for (int j = 0; j < 5; j++) {
				matrix[i][j] = start += 1;
				System.out.print(matrix[i][j] + "\t");
			}
		}
	}
}
