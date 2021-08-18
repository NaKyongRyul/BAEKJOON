package chapter10;

import java.util.Scanner;

public class Number02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a+1];
		sc.close();
				
		for(int i=0; i<=a; i++) {
			if(i == 0) {
				arr[i] = 0;
			}
			else if(i == 1) {
				arr[i] = 1;
			}
			else {
				arr[i] = arr[i-1] + arr[i-2];				
			}
		}
		System.out.println(arr[a]);
	}

}
