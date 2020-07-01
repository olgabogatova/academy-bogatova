package by.academy.lesson3;
import java.util.Random;


public class Task3 {
public static void main ( String [] args) {
	int [] array = new int [10];
	Random rand = new Random ();
	int sum = 0;
	for (int i=0; i < array.length; i++) {
		array[i] = rand.nextInt(10);
		sum += array[i];
	System.out.println( array[i]);
	}
	System.out.println(  " Сумма массива равна: " + sum);
	int mediana = sum / array.length;
	System.out.println ( " Cреднее арифметическое: " + sum / array.length);
	for ( int i=0; i < array.length; i++ ) {
		System.out.println("");
		if (mediana> array[i]) {
			System.out.print(array[i]);
		}
	}
	}
}