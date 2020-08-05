/*
 * 2) Задача:
Можно писать все в main. Не нужно создавать новых классов.
Напишите метод, который добавляет 1000000 элементов в ArrayList и LinkedList. 
Напишите еще один метод, который выбирает из заполненного списка элемент наугад 100000 раз. 
Замерьте время, которое потрачено на это. 
Сравните результаты и предположите, почему они именно такие.
 */

package by.academy.classwork.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Task2Main {
	public static void main(String[] args) {
		long startMS1 = System.currentTimeMillis();

		ArrayList<Integer> one = new ArrayList<>();
		for (int i = 1; i <= 1_000_000; i++) {
			one.add(1);

		}

		long endMS1 = System.currentTimeMillis();
		System.out.println("Time1" + " " + (endMS1 - startMS1));

		
		
		
		long startMS2 = System.currentTimeMillis();

		LinkedList<Integer> two = new LinkedList<>();
		for (int i = 1; i <= 1_000_000; i++) {
			two.add(1);

		}
		long endMS2 = System.currentTimeMillis();
		System.out.println("Time2" + " " + (endMS2 - startMS2));

		
		
		
		long startMS3 = System.currentTimeMillis();
		Random rand = new Random();
		ArrayList<Integer> three = new ArrayList<>();
		for (int i = 1; i <= 1_000_000; i++) {
			three.add(rand.nextInt());
		}
		Random newRand = new Random();
		
		for (int i = 1; i <= 1_000_000; i++) {
			three.get(newRand.nextInt(1000000));
		}

		long endMS3 = System.currentTimeMillis();
		System.out.println("Time3" + " " + (endMS3 - startMS3));

	}
}
