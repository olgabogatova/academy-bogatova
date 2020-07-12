/*
 * Zадача 10.
Создайте массив из 11 случайных целых чисел из отрезка [-1;1], выведите массив на экран в строку. 
Определите какой элемент встречается в массиве чаще всего и выведите об этом сообщение на экран. 
Если два каких-то элемента встречаются одинаковое количество раз, то не выводите ничего.
 */

package by.academy.lesson3;

public class Task10M {
	public static void main(String[] args) {
		int[] array = new int[11];
		int a = 0;
		int b = 0;
		int c = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 3) - 1;
			System.out.print(array[i] + " ");
			if (array[i] == 0) {
				a++;
			} else if (array[i] == -1) {
				b++;
			} else {
				c++;
			}
		}
		System.out.println("");
		
		if (a > b && a > c) {
			System.out.println("Больше всего : 0 ");
		} else if (b > c && b > a) {
			System.out.println("Больше всего : -1 ");
		} else if (c > b && c > a) {
			System.out.println("Больше всего : 1 ");
		} else {
			System.out.println("");
		}
	}
}
