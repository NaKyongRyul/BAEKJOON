package chapter09;

import java.util.Scanner;

public class Number08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		sc.close();

		int x_min = x1;
		int y_min = y1;
		
		if(x1 > x2-x1) {
			x_min = x2-x1;
		}
		if(y1 > y2-y1) {
			y_min = y2-y1;
		}
		if(x_min > y_min) {
			System.out.println(y_min);
		}
		else {
			System.out.println(x_min);
		}
	}

}
