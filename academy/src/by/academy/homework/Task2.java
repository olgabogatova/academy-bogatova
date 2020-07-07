/*
 Задание 2.
Используем switch/case. Ввести с консоли тип данных(созраняем в String) и переменную, вывести на экран:
	a) если тип данных int, вывести остаток от деления на 2
	b) если double, вывести 70% от числа 
	c) если float, возвести в квадрат
	d) если char, вывести код символа
	e) String, вывести на экран строку в виде ("Hello " + переменная)
	f) во всех остальных случаях вывести на экран ("Unsupported type");
 */

package by.academy.homework;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите тип данных");
		String dataType = sc.nextLine();
		System.out.println("Введите переменную");
		switch (dataType) {
		case "Int":
		case "int":
			int a = sc.nextInt();
			System.out.println(a = a % 2);
			break;
		case "Double":
		case "double":
			double b = sc.nextDouble();
			System.out.println(b *= 0.7);
			break;
		case "Float":
		case "float":
			float c = sc.nextFloat();
			System.out.println(c *= c);
			break;
		case "Char":
		case "char":
			char d = sc.next().charAt(0);
			System.out.println((int) d);
			break;
		case "String":
		case "string":
			String e = sc.nextLine();
			System.out.println("Hello " + e);
			break;
		default:
			System.out.println("Unsupported type");
		}
		sc.close();
	}
}
