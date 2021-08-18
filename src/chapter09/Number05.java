package chapter09;

import java.util.Scanner;

public class Number05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int count = 0;
			
			if(a == 0) {
				break;
			}
			
			for(int i=a+1; i<=2*a; i++) {
				int j = 2;
				for(j=2; j<=Math.sqrt(i); j++) {
					if(i % j == 0) {
						break;
					}
				}
				if(j > Math.sqrt(i) && i != 1) {
					count++;
				}

			}
			System.out.println(count);
		}
	}
}
