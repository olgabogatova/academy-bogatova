package by.academy.lesson3;
import java.util.Scanner;

public class Task4C {
public static void main (String []args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("������� ���������� �����");	
	int a = sc.nextInt(); 											// a - ���������� �����
	
	System.out.println("������� " +  a + " �����");
	
	int o=0; 														// o - ������������� �����	
	int p=0; 														// p -  ������������� �����
	int n=0; 														// n - ���� 
	
	
	for (int i=0; i<a; i++) {
	int b = sc.nextInt(); 											// b - ��������� �����
																	// ��������� ����������� ���������� ����� � ��������� �� 
		
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
	System.out.println( " ���������� ������������� �����: " + o);
	System.out.println(" ���������� ������������� �����: " + p);
	System.out.println(" ���������� �����: " + n);
	sc.close();
}
}

