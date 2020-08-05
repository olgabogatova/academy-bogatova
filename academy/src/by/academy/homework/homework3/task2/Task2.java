/*
 * Создать класс, который параметризуется любым типом (T). Имеет массив объектов нашего типа T.
Содержит пустой конструктор, который по дефолту инициализирует пустой массив размерности 16.
Содержит конструктор, принимающий значение int и инитает им размер нашего массива.

 */


package by.academy.homework.homework3.task2;

import java.util.ArrayList;
import java.util.List;


public class Task2 <T> {

	private T item;
	private ArrayList<T>  a = new ArrayList <> (List.of(item));

		public Task2() {
			super();
			a =  new  ArrayList <T> (16);
		}
		
		public Task2(int b) {
			super();
			a =  new  ArrayList <T> (b);
		}
		
		 
		
	
}
