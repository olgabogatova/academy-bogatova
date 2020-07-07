/*Задание 3.
Ввести с консоли число от 1 до 10, вывести на экран таблицу умножения для этого числа. (10 чисел).
*/

package by.academy.homework;

import java.util.Scanner;

public class Task3 {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Введите число от 1 до 10 ");
		int a = sc.nextInt();
		System.out.println("Таблица умножения для числа " + a);
		for (int i = 1; i <= 10; i++) {
			int y = 1;
			y = a * i;
			System.out.println(a + " * " + i + " = " + y + ";");
		}
		sc.close();
	}
}
