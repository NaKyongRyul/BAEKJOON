package chapter05;

import java.util.Scanner;

public class Number07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int[] arr;

		for(int i=0; i<testcase; i++) {
			int n = sc.nextInt(); //학생수
			arr = new int[n];
			double sum = 0;
			
			for(int j=0; j<n; j++) {
				int score = sc.nextInt();
				arr[j] = score;
				sum += score;
			}
			double mean = sum/n; //평균
			double count = 0; //평균 넘는 학생 수
			
			for(int j=0; j<n; j++) {
				if(arr[j] > mean) {
					count++;
				}
			}
			System.out.printf("%.3f%%\n", (count/n)*100);
		}
		sc.close();
	}

}
