/*
 * «адача 9. 
—оздайте два массива из 10 целых случайных чисел из отрезка [1;9] и третий массив из 10 действительных чисел. 
 аждый элемент с i-ым индексом третьего массива должен равн€тьс€ отношению элемента из первого массива с i-ым индексом к элементу из второго массива с i-ым индексом. 
¬ывести все три массива на экран (каждый на отдельной строке), затем вывести количество целых элементов в третьем массиве.
 * 
 */

package by.academy.lesson3;

import java.util.Arrays;

public class Task9M {
public static void main (String [] args) {
	int [] array1 = new int [10];
	int [] array2 = new int [10];
	double [] array3 = new double [10];
	int count = 0;
	for (int i =0; i<array1.length;i++) {
		array1[i] = (int)(Math.random()*9+1);
		array2[i] = (int)(Math.random()*9+1);
		array3[i] = (double) array1[i]/array2[i];
		if (array1[i]% array2[i]==0  ) {
			count++;
		}
		
	}
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		System.out.println(" оличество целых элементов в третьем массиве: " + count  );
}
}
