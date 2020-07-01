package by.academy.lesson3;
import java.util.Scanner;

public class Task3C {
public static void main ( String []args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Ведите значение");
	int a = sc.nextInt();
	int proizv = 1;
	for (int i=1; i<=a; i++) {
		proizv *= i;
		}
	System.out.println(proizv);
}
}
