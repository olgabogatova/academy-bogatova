/*
 Задача 5.
Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый, 
выведите массивы на экран в двух отдельных строках. Посчитайте среднее арифметическое элементов каждого массива и сообщите, 
для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
 */


package by.academy.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task5M {
	public static void main( String []args ) {
		int[] array1 = new int [5];
		int [] array2 = new int [5];
		Random rand = new Random();
		double mediana1=0;
		double mediana2=0;
		
		for (int i =0; i<array1.length; i++) {
			array1[i] = rand.nextInt(6);
			array2[i] = rand.nextInt(6);
		}
			System.out.println(Arrays.toString(array1) );
			System.out.println(Arrays.toString(array2) );
					
		for (int i =0; i<array1.length; i++) {
			mediana1 +=array1[i];
			mediana2 +=array2[i];
		}
		mediana1 /=5;
		mediana2 /=5;
		
		System.out.println("");
		System.out.println(mediana1);
		System.out.println(mediana2);
	}

}

