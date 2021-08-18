package chapter09;

import java.util.Scanner;

public class Number07 {
	public static boolean[] prime = new boolean[10001];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		get_prime();
		int T = sc.nextInt();
		
		while(T-- > 0) {
			int a = sc.nextInt();
			int first = a/2;
			int second = a/2;
			
			while(true) {
				if(prime[first] == false && prime[second] == false) {
					System.out.println(first + " " + second);
					break;
				}
				first--;
				second++;
			}
		}
		sc.close();
	}
	public static void get_prime() {
		prime[0] = prime[1] = true;
		
		for(int i=2; i<=Math.sqrt(prime.length); i++) {
			if(prime[i] == true) {
				continue;
			}
			for(int j=i*i; j<prime.length; j+=i) {
				prime[j] = true;
			}
		}
	}

}
