// Написать лямбда выражение для интерфейса Printable , который содержит один метод void print()

package by.academy.classwork.lambda;

public class Task1 {
	interface Printable {
		void print(String s);
	}

	public static void main(String[] args) {
		Printable p = s -> System.out.println(s);
		p.print("Task one");
	}
}
