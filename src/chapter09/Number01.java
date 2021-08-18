package chapter09;

import java.util.Scanner;

public class Number01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;
		
		for(int i=0; i<a; i++) {
			int b = sc.nextInt();
			boolean isPrime = true;
			
			if(b == 1) {
				continue;
			}
			
			else if(b == 2) {
				isPrime = true;
			}
			
			else {
				for(int j=2; j<=Math.sqrt(b); j++) {
					if(b % j == 0) {	
						isPrime = false;
						break;
					}
					
				}
			}
			if(isPrime) {
				count++;
			}
		}
		sc.close();
		System.out.println(count);
	}

}
