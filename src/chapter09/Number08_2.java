package chapter09;

import java.util.Scanner;

public class Number08_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		sc.close();
		
		int x_min = Math.min(x1, x2-x1);
		int y_min = Math.min(y1, y2-y1);
		
		System.out.println(Math.min(x_min, y_min));
	}

}
