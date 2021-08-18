package chapter09;

import java.util.Scanner;

public class Number04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		sc.close();
		
		for(int i=min; i<=max; i++) {
			int j = 2;
			for(j=2; j<=Math.sqrt(i); j++) {
				if(i % j == 0) {
					break;
				}
			}
			if(j > Math.sqrt(i) && i != 1) {
				System.out.println(i);
			}
			
		}
	}
}
