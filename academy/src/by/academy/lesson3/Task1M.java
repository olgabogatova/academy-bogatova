/*
 * «адача 1. —оздайте массив из всех чЄтных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку, 
отдел€€ один элемент от другого пробелом, а затем в столбик (отдел€€ один элемент от другого началом новой строки). 
ѕеред созданием массива подумайте, какого он будет размера.
2 4 6 Е 18 20
2
4
6
Е
20
 */
package by.academy.lesson3;


public class Task1M {
//public static void main (String[]args) {
//		int[] array = new int [10] ;
//		for(int  c=2; c<=20; c++) {
//			int b=0;
//			if (c%2==0) {
//				array[b] = c;
//				System.out.print( array[b] + " ");
//				b++;
//			}
//		}
//		System.out.println(" ");		
//		for(int  c=2; c<=20; c++) {
//			int  b=0;
//			if (c%2==0) {
//				array[b] = c;
//				System.out.println( array[b] + " ");
//				b++;
//			}
//		}
//
//}
//}

	public static void main(String[] args) {
        int[] a = new int[10];
        int i = 0;
        int b = 2;
        while (i < 10) {
            a[i] = b;
            b += 2;
            i++;
        }        
        //вывод в строку
        for (i = 0; i < 10; i++)
            System.out.print(a[i] + " ");
        //¬ывод в столбик
        System.out.println();
        for (i = 0; i < 10; i++)
            System.out.println(a[i]);
    }
}







