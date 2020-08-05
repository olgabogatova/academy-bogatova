/*
 * Напишите метод, который на вход получает коллекцию объектов, а возвращает коллекцию уже без дубликатов.
*/

package by.academy.classwork.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task1Main {

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5, 4, 8, 2, 3 };
		Set<Integer> h = new HashSet<>(Arrays.asList(intArray));
		for (int array : intArray) {
			h.add(array);
		}
		System.out.println(h);
	}
}
