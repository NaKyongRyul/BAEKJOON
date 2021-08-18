package chapter05;

import java.util.Arrays;
import java.util.Scanner;

public class Number05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double[] arr = new double[a];
		
		for(int i=0; i<a; i++) {
			arr[i] = sc.nextDouble();
		}
		double sum = 0;
		Arrays.sort(arr);
		
		for(int i=0; i<a; i++) {
			sum += arr[i]/arr[a-1]*100;
		}
		System.out.println(sum/a);
		sc.close();
	}

}
