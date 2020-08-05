/*Задача 4
 * Можно писать все в main. Не нужно создавать новых классов.
Создать "Каталог" (Map<String, Integer>) для товаров, в который мы заносим название товара и его количество.
Будьте внимательны, если товар уже есть в каталоге, мы не добавляем его повторно, а увеличиваем счетчик.
Добавить 10 товаров. 
 */


package by.academy.classwork.collections;

import java.util.HashMap;
import java.util.Map;

public class Task4Main {
	public static void main ( String [] args) {
		Map<String, Integer> catalogue = new HashMap <>();
		addProduct (catalogue, "Product1");
		addProduct (catalogue, "Product1");
		addProduct (catalogue, "Product1");
		addProduct (catalogue, "Product1");
		addProduct (catalogue, "Product5");
		addProduct (catalogue, "Product5");
		addProduct (catalogue, "Product5");
		addProduct (catalogue, "Product5");
		addProduct (catalogue, "Product5");
		addProduct (catalogue, "Product11");
		addProduct (catalogue, "Product11");
		addProduct (catalogue, "Product1");
		
		for ( String product : catalogue.keySet()) {
		System.out.println(product + " " + catalogue.get(product));
	}
	}
	
	public static void addProduct(Map<String,Integer> catalogue, String product ) {
		if ( catalogue ==null) {
			return;
		} if ( catalogue.containsKey(product)) {
			
			catalogue.put(product,  catalogue.get(product) +1);
		} else {
			catalogue.put(product,1);
		}
		
		
	}
}
