package chapter03;

import java.util.Scanner;

public class Number12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] arr = new int[a];
		
		for(int i=0; i<a; i++) {
			int c = sc.nextInt();
			arr[i] = c;
		}
		for(int i=0; i<a; i++) {
			if(arr[i] < b) {
				System.out.print(arr[i] + " ");
			}
		}
		sc.close();
	}
}
