package chapter09;

import java.util.Scanner;

public class Number02_2 {

	public static boolean[] prime; // 소수 체크할 배열
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		
		prime = new boolean[b+1];
		get_prime();
		
		int sum = 0;
		int min = -1; // min을 아무값으로 설정
		
		for(int i=a; i<=b; i++) {
			if(prime[i] == false) { // 소수
				sum += i;
				if(min == -1) { // min은 처음에만 설정한 값이 되므로 min = i 로 고
					min = i;
				}
			}
		}
		
		if(sum == 0) {
			System.out.println(-1);
		}
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		System.out.println();
	}
	
	public static void get_prime() {
		prime[0] = true;
		prime[1] = true;
		
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			if(prime[i] == true) {
				continue;
			}
			for(int j=i*i; j<prime.length; j = j + i) {
				prime[j] = true;
			}
		}
	}

}
