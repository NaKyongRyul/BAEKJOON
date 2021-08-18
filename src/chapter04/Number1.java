package chapter04;

import java.util.Scanner;

public class Number1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int[] arr = new int[100];
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a==0 && b==0) { 
				break;
			}
			arr[count] = a + b;
			count++;
		}
		sc.close();
		
		for(int i=0; i<count; i++) {
			System.out.println(arr[i]);
		}
	}

}
