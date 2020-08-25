// —оздать л€бмда выражение , которое провер€ет, что строка не пуста, использу€ функциональный интерфейс Predicate 


package by.academy.classwork.lambda;

public class Task3 {
	public interface Predicate <T>{
		boolean test(T t);
	}
	 public static void main ( String [] args) {
		 String s1 = null;
		 Predicate<String> p  = i -> i!="";
		 System.out.println(p.test("pop"));
		 System.out.println(p.test(""));
		 System.out.println(p.test("alala"));
		 System.out.println(p.test(s1));
	 }
}
