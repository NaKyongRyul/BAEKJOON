package chapter10;

import java.util.Scanner;

public class Number02_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(fibo(a));
		sc.close();
	}
	
	public static int fibo(int i) {
		if(i == 0) {
			return 0;
		}
		else if(i == 1) {
			return 1;
		}
		else {
			return fibo(i-1) + fibo(i-2);
		}
	}

}
