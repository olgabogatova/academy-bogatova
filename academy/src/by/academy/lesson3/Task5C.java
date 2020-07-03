package by.academy.lesson3;

public class Task5C {
public static void main ( String [] args) {
	for (int n=1; n<=10;n++) {
		double y=1;
		y *=n;
		System.out.println(n + " сажень равна " + y * 2.1366 + " м " );
		System.out.println(n + " дюйм равен "  + y * 2.5 + " см ");
		System.out.println(n + " фут равен "  + y * 0.3048 + " м ");
		System.out.println(n + " драхма равна "  + y * 3.7325 + " г ");
		System.out.println(n + " унция равна "  + y * 29.86 + " г ");
		System.out.println(n + " фунт равен "  + y * 0.40951 + " кг ");
		System.out.println(n + " аршин равен "  + y * 0.7112 + " м ");
		System.out.println(n + " золотник равен " + y *  4.2657 + " г ");
		System.out.println(n + " дюйм равен "  + y * 25.3995 + " мм ");
		System.out.println();
	}
}
}

