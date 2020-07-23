/*
 * 4. Ввести n слов с консоли. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них.
 */
package by.academy.lesson5;


import java.util.Scanner;

public class Task4Strings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		
		System.out.println("Enter the number of words");
		int a = sc.nextInt();
		String[] words = new String[a];
		System.out.println(" Enter " + a + " words ");
		sc.nextLine();
		for (int i = 0; i < words.length; i++) {
			words[i] = sc.nextLine();
			System.out.println(words[i]);
		}
		System.out.println(" ");


		int indexMinUnique=-1;
		int minUnique=Integer.MAX_VALUE;
		for (int i = 0; i < words.length; i++) {
			int currentUniqueCounter=0;
			char [] chaar= new char[66000];
				
			for ( char c: words[i].toCharArray()) {
					chaar[c]++;
			}
			for (char c: chaar) {
				if (c>0) {
					currentUniqueCounter++;
				}
			}
			if (currentUniqueCounter<minUnique) {
				minUnique=currentUniqueCounter;
				indexMinUnique=i;
			}
		}
		System.out.println(words[indexMinUnique]);
		sc.close();
	}



}
