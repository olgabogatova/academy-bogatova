/*
 * Задача 2.
Создайте массив из всех нечётных чисел от 1 до 99, 
выведите его на экран в строку, а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 … 7 5 3 1).
 */
package by.academy.lesson3;

public class Task2M {
public static void main (String []args ) {
	int [] mas = new int [99/2+1];
	int a=0;
	int b=1;
	while ( a < mas.length) {
		mas [a] = b;
		b+=2;
		a++;
	}
	 for (a = 0;a < mas.length; a++) {
         System.out.print(mas[a] + " ");
}
	  System.out.println( " ");
	  a=0;
	  b=99;
		while ( a < mas.length) {
			mas [a] = b;
			b-=2;
			a++;
		}
		 for (a = 0;a < mas.length; a++) {
	         System.out.print(mas[a] + " ");
	}
}
}