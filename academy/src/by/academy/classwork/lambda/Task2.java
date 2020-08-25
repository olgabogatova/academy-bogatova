// —оздать л€мбда выражение , которое возвращаетзначение true ? если строка null , использу€ функциональный интерфейс Predicate

package by.academy.classwork.lambda;

public class Task2 {
	public interface Predicate<T> {
		boolean test(T t);
	}

	public static void main(String[] args) {
		String s1 = null;
		Predicate <String> s = i -> i!= null;
		System.out.println(s.test(""));
		System.out.println(s.test("row"));
		System.out.println(s.test("ola"));
		System.out.println(s.test(s1));
	}
}
