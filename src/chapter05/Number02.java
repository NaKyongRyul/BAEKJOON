package chapter05;

import java.util.Scanner;

public class Number02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int count = 0;
		int max = 0;
		int index = 0;
		
		for(int i=0; i<9; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		for(int k : arr) {
			count++;
			if(k>max) {
				max = k;
				index = count;
			}
		}
		System.out.println(max + "\n" + index);
	}

}
