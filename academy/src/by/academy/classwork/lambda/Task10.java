/*создать программу - калькулятор в которую мы передаём 2 числа и оператор +-*
*написать свой функциональный интрфейс для вычисления. использовать лямбдыюэ
*/

package by.academy.classwork.lambda;

import java.util.Map;
import java.util.TreeMap;

public class Task10 {
	
	
public static void main (String [] args) {
	Map <String, interface10> catalogue = new TreeMap<>();
	catalogue.put("+", (i,l)-> i+l);
	catalogue.put("-", (i,l)-> i-l);
	catalogue.put("*", (i,l)-> i*l);
	catalogue.put("/", (i,l)-> i/l);

	System.out.println(catalogue.get("+").calc(2, 8));
	System.out.println(catalogue.get("-").calc(12, 8));
	System.out.println(catalogue.get("*").calc(2, 7));
	System.out.println(catalogue.get("/").calc(16, 8));
	
}
}
