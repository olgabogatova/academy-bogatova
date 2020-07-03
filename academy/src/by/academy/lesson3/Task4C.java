package by.academy.lesson3;
import java.util.Scanner;

public class Task4C {
public static void main (String []args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Введите количество чисел");	
	int a = sc.nextInt(); 											// a - количество чисел
	
	System.out.println("Введите " +  a + " чисел");
	
	int o=0; 														// o - отрицательные числа	
	int p=0; 														// p -  положительные числа
	int n=0; 														// n - нули 
	
	
	for (int i=0; i<a; i++) {
	int b = sc.nextInt(); 											// b - введенные числа
																	// программа запрашивает количество чисел и считывает их 
		
	if ( b<0) {		
			o++;
			}
			else if (b>0) {
			p++;
			}
			else if (b==0) {
			n++;
			}

	}
	System.out.println( " количество отрицательных чисел: " + o);
	System.out.println(" количество положительных чисел: " + p);
	System.out.println(" количество нулей: " + n);
	sc.close();
}
}

