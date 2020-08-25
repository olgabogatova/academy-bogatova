//Ќаписать программу котора€ провер€ет, что строка начинаетс€ буквой УJФили УNФ и заканчиваетс€ УAФ. »спользуем функциональный интерфейс Predicate.


package by.academy.classwork.lambda;
import java.util.function.Predicate;
public class Task5 {
//	public interface Predicate <T>{
//		boolean test (T t );
//	
//	}
 public static void main ( String [] args) {
	 
	 Predicate <String > p = i->i.startsWith("J" )|| i.startsWith("N");
	 Predicate <String > s = i-> i.endsWith("A");
	 
	 System.out.println(p.and(s).test("NotA"));
	 System.out.println(p.and(s).test("Note"));
	 System.out.println(p.and(s).test("NA"));
	 System.out.println(p.and(s).test("JtA"));
	 System.out.println(p.and(s).test("J"));
	 System.out.println(p.and(s).test("ja"));
	 
	 
 }
}
