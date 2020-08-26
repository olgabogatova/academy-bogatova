/*
 *7 .
	Написать лямбда выражение, которое принимает на вход число и возвращает значение 
	“Положительное число”, “Отрицательное число” или  “Ноль”.
	Используем функциональный интерфейс Function.
 */

package by.academy.classwork.lambda;

import java.util.Scanner;
import java.util.function.Function;

public class Task7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Function<Integer, String> n = c -> {
			if (c > 0)
				System.out.println("Положительное число");
			if (c < 0)
				System.out.println("Отрицательное число");
			if (c == 0)
				System.out.println("Ноль");
			return null;
		};
		n.apply(5);
		n.apply(0);
		n.apply(10);
		n.apply(-5);
		n.apply(-15);
		
	sc.close();	
	}
}
