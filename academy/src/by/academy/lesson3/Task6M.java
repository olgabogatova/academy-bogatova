
/*
 * 
 * Z����� 6.
�������� ������ �� 4 ��������� ����� ����� �� ������� [10;99], 
�������� ��� �� ����� � ������. ���������� � ������� �� ����� ��������� � ���, �������� �� ������ ������ ������������ �������������������.

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
	
	String result = "������������������ ������������";
	for (int  i=0;i<array.length; i++) {
		if (i>0 && array[i-1]>=array[i] ) {
			result = "������������������ �� ������������";
			break;
}
	}
		System.out.println(result);
		
	
}
}


//	String result = "���������� ������������";
//	for (int i = 0; i < Mas.length; i++) {
//	   if (i > 0 && Mas[i - 1] >= Mas[i]) {
//	      result = "���������� �� ������������";
//	      break;
//	   }      
//	}
//	System.out.print(result);
//}
//}
