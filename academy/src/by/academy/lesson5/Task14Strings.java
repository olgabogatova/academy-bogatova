/*
 * 14. ¬вести число от 1 до 12. ¬ывести на консоль название мес€ца, соответ-ствующего данному числу. (ќсуществить проверку корректности ввода чисел).
 */

package by.academy.lesson5;

import java.util.Scanner;

public class Task14Strings {
	public static void main(String[] Args) {
		Scanner sc = new Scanner(System.in);
		int monthName = sc.nextInt();
		switch (monthName) {
		case 1:
			System.out.println("€нварь");
			break;
		case 2:
			System.out.println("февраль");
			break;
		case 3:
			System.out.println("март");
			break;
		case 4:
			System.out.println("апрель");
			break;
		case 5:
			System.out.println("май");
			break;
		case 6:
			System.out.println("июнь");
			break;
		case 7:
			System.out.println("июль");
			break;
		case 8:
			System.out.println("август");
			break;
		case 9:
			System.out.println("сент€брь");
			break;
		case 10:
			System.out.println("окт€брь");
			break;
		case 11:
			System.out.println("но€брь");
			break;
		case 12:
			System.out.println("декабрь");
			break;
		default:
			System.out.println("„исло введено неверно ");
		}
		sc.close();
	}
}
