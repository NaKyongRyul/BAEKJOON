package chapter08;

import java.util.Scanner;

public class Number09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		for(int i=0; i<count; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			int distance = b - a;
			int max = (int)Math.sqrt(distance);
			
			if(max == Math.sqrt(distance)) {
				System.out.println(max * 2 - 1);
			}
			else if(distance <= max * max + max) {
				System.out.println(max * 2);
			}
			else {
				System.out.println(max * 2 + 1);
			}
		}
		sc.close();
	}

}
