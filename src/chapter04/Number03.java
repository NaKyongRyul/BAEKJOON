package chapter04;

import java.util.Scanner;

public class Number03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int orig = sc.nextInt();
		sc.close();
		
		int copy = orig;
		int count = 0;
		
		while(true) {
			orig = (orig%10) * 10 + (orig/10 + orig%10) % 10;
			count++;
			
			if(copy == orig) {
				break;
			}
		}
		System.out.println(count);
	}
}
