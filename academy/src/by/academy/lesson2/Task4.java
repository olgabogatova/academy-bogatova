package by.academy.lesson2;

public class Task4 {
public static void main (String []Args) {
	int s = 3700;
    int sec;
    int m;
    int min, h;
    int hour;
    int d;
    int day;
    int w;
    sec = s % 60; 			/* 3700-3660=40 ��� */
    m = (s - sec) / 60;		/* (3700-40)/60=61 */
    min = m % 60;			/* 61-60=1 ���  */
    h = (m - min) / 60;		/* (61-1)/60=1 ��� */
    hour = h % 24;
    d = (h - hour) / 24;
    day = d % 7;
    w = d / 7;
    System.out.println(w + " ������ " + day + " ���� "  + hour + " ����� " + min + " ����� " + sec + " ������");
  }
}

