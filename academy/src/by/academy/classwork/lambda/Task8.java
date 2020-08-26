/*
 * 8
 * Написать лямбда выражение, которое возвращает случайное число от 0 до 10. 
	Используем функциональный интерфейс Supplier.
 */

package by.academy.classwork.lambda;

import java.util.Random;
import java.util.function.Supplier;

public class Task8 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		Supplier <Integer> chislo = ()-> rand.nextInt(10);
		System.out.println(chislo.get());
		System.out.println(chislo.get());
		System.out.println(chislo.get());
		System.out.println(chislo.get());
		System.out.println(chislo.get());
		System.out.println(chislo.get());
		System.out.println(chislo.get());
		System.out.println(chislo.get());
		
	}
}
