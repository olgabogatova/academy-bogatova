/*
 * Задача 4.
Создайте массив из 8 случайных целых чисел из отрезка [1;10]. Выведите массив на экран в строку. 
Замените каждый элемент с нечётным индексом на ноль. Снова выведете массив на экран на отдельной строке.
 */

package by.academy.lesson3;

import java.util.Random;

public class Task4M {
	public static void main ( String []args ) {
		int [] array = new int [8];
		Random rand = new Random ();
		for (  int i=0; i<array.length;i++) {
			array[i] = rand.nextInt(11);
			System.out.print(array[i] + " ");
		} 
		System.out.println("");
		for (  int i=0; i<array.length;i++) {
			if ( i%2!=0) {
				array[i]=0;
			}		
			System.out.print(array[i] +" ");
		}					
	}
}
