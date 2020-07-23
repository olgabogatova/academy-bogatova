/*
 * 13. Написать программу, позволяющую корректно находить корни квад-ратного уравнения. Параметры уравнения должны задаваться с ко-мандной строки.
 */

package by.academy.lesson5;

import java.util.Scanner;

public class Task13Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the quadratic coefficient");
		double a = sc.nextDouble();
		System.out.println("Enter the linear coefficient");
		double b = sc.nextDouble();
		System.out.println("Enter the constant");
		double c = sc.nextDouble();
		double discr = b * b - 4 * a * c;
		String s = new String("The quadratiс function: " + " " + a + "x^2" + "+ " + b + " x" + " " + "+" + c + " = 0 ");
		if (discr > 0) {
			double x1 = (-b + Math.sqrt(discr)) / (2 * a);
			double x2 = (-b - Math.sqrt(discr)) / (2 * a);
			System.out.println(s + " has two  roots  :" + x1 + ", " + x2);
		} else if (discr == 0) {
			double x = -b / (2 * a);
			System.out.println(s + " has one root: " + x);
		} else {
			System.out.println(s + "  has no roots");
		}
		sc.close();
	}
}
