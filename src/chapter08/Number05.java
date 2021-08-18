package chapter08;

import java.util.Scanner;

public class Number05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		for(int k=0; k<count; k++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();
			int[][] arr = new int[h][w];
			
			for(int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					arr[i][j] = (i+1) * 100 + (j + 1);
				}
			}
		
			if(n % h != 0) {
				System.out.println(arr[n % h - 1][n / h]);			
			}
			else {
				System.out.println(arr[h - 1][n / h - 1]);							
			}
		}
		sc.close();
	}

}
