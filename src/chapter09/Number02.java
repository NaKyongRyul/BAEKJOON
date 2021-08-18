package chapter09;

import java.util.Scanner;

public class Number02 {

	public static boolean[] prime;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		int count = 0;
		int sum = 0;
		int min = 0;
		
		for(int i=a; i<=b; i++) { // i가 최대 11
			int j = 2;
			for(j=2; j<=Math.sqrt(i); j++) { // j가 for문 밖에 있으므로 j++로 1이 더 증가된다.
				if(i % j == 0) {
					break;
				}
			}
			
			if(j > Math.sqrt(i) && i != 1) {
				sum += i;
				if(count == 0) {
					min = i;
				}
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}

	}
}
