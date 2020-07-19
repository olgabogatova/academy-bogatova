/*
 * 4.Напишите два цикла выполняющих многократное сложение строк, один
с помощью оператора сложения и String, а другой с помощью StringBuilder
и метода append. Сравните скорость их выполнения.
 */

package by.academy.regulary;

public class Task4Regulary {
	public static void main ( String [] args) {
		long startMS1 = System.currentTimeMillis();	
	
	String start1 = "Start ";
	for ( int i =0; i<1000;i++) {
		start1+=" process ";
		System.out.println(start1);
	}
	long endMS1 = System.currentTimeMillis();
	System.out.println(" ");
	
	long startMS2 = System.currentTimeMillis();
	StringBuffer start2 = new StringBuffer("Start ");
	for ( int i =0; i<1000;i++) {
		start2.append(" process ");
		System.out.println(start2);
	}
	
	long endMS2 = System.currentTimeMillis();
	
	System.out.println(endMS1-startMS1);
	System.out.println(endMS2-startMS2);
}
}