package chapter09;

import java.util.Scanner;

public class Number12 {
	
	public static boolean[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		arr = new boolean[b+1];
		get_prime();
		sc.close();
		
		int sum = 0;
		int min = 0;
		
		for(int i=a; i<=b; i++) {
			if(arr[i] == false) {
				sum += i;
				if(min == 0) {
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
		
	}
	
	public static void get_prime() {
		arr[0] = true;
		arr[1] = true;
		
		for(int i=2; i<=Math.sqrt(arr.length); i++) {
			if(arr[i] == true) {
				continue;
			}
			for(int j=i*i; j<arr.length; j+=i) {
				arr[j] = true;
			}
			
		}
	}

}
