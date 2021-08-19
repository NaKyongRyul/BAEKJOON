package chapter11;

import java.util.Scanner;

public class Number03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[][] arr = new int[count][2];
		
		for(int i=0; i<count; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
		for(int i=0; i<count; i++) {
			int rank = 1;
			
			for(int j=0; j<count; j++) {
				
				if(i == j) {
					continue;
				}
				
				if(arr[i][0] > arr[j][0] && arr[i][1] > arr[j][1]) {
					rank++;
				}
			}
			System.out.println(rank + " ");
		}
		sc.close();
	}

}
