package chapter11;

import java.util.Scanner;

public class Number01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int max = sc.nextInt();
		int[] arr = new int[count];
		
		for(int i=0; i<count; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int sum = search(arr, count, max);
		System.out.println(sum);
	}
	
	public static int search(int[] arr, int count, int max) {
		int prev_sum = 0;
		
		for(int i=0; i<count-2; i++) {
			for(int j=i+1; j<count-1; j++) {
				for(int k=j+1; k<count; k++) {
					int sum = arr[i] + arr[j] + arr[k];
					
					if(sum == max) {
						return sum;
					}
					
					if(prev_sum < sum && sum < max) {
						prev_sum = sum;
					}
				}
			}
		}
		return prev_sum;
	}

}
