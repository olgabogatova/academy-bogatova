
/*
 * 
 * Zадача 6.
—оздайте массив из 4 случайных целых чисел из отрезка [10;99], 
выведите его на экран в строку. ќпределить и вывести на экран сообщение о том, €вл€етс€ ли массив строго возрастающей последовательностью.

 */


package by.academy.lesson3;


public class Task6M {
public static void main ( String []args ) {
int [] array = new int [3];
	
	
	for (int  i=0;i<array.length; i++) {
		
		array[i] = (int) (Math.random()*89+10)  ;
		System.out.print(array[i]+" ");
	}

	System.out.println(" ");
	
	String result = "ѕоследовательность возрастающа€";
	for (int  i=0;i<array.length; i++) {
		if (i>0 && array[i-1]>=array[i] ) {
			result = "ѕоследовательность не возрастающа€";
			break;
}
	}
		System.out.println(result);
		
	
}
}


//	String result = "ѕрогресси€ возрастающа€";
//	for (int i = 0; i < Mas.length; i++) {
//	   if (i > 0 && Mas[i - 1] >= Mas[i]) {
//	      result = "ѕрогресси€ не возрастающа€";
//	      break;
//	   }      
//	}
//	System.out.print(result);
//}
//}
