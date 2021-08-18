package chapter10;

import java.util.Scanner;

public class Number01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int mult = 1;
		
		for(int i=1; i<=a; i++) {
			mult *= i;
		}
		System.out.println(mult);
		sc.close();
	}
}
