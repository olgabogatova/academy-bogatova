// ������� ������ ��������� , ������� ���������, ��� ������ �� ����� � �� null , ��������� ����� and () ��������������� ����������  Predicate 

package by.academy.classwork.lambda;
import java.util.function.Predicate;

public class Task4 {


	public static void main(String[] args) {
		Predicate <String> p = i-> i!=null;
		Predicate <String> s = i-> i!="";
		System.out.println(p.and(s).test("game"));
		
	}

}
